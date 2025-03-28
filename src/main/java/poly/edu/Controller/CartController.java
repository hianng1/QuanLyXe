package poly.edu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import poly.edu.Model.GioHang;
import poly.edu.Model.PhuKienOto;
import poly.edu.Service.CartService;
import poly.edu.Service.PhuKienOtoService;

@Controller
@RequestMapping("cart")
public class CartController {
    @Autowired
    PhuKienOtoService phuKienOtoService;

    @Autowired
    CartService cartService;

    // Hiển thị giỏ hàng
    @GetMapping("views")
    public String viewsCart(Model model) {
        model.addAttribute("CART_ITEMS", cartService.getAllItems());
        return "cart";
    }

    // Thêm phụ kiện vào giỏ hàng
    @GetMapping("/add/{id}")
    public String addCart(@PathVariable("id") Long id) {
        PhuKienOto pk = phuKienOtoService.findById(id);
        if (pk != null) {
            GioHang item = new GioHang();
            item.setPhuKienOto(pk);
            item.setSoLuong(1); // Đặt số lượng ban đầu
            cartService.add(item);
        }
        return "redirect:/cart/views";
    }
}
