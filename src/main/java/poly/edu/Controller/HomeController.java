package poly.edu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import poly.edu.DAO.SanPhamDAO;
import poly.edu.Model.SanPham;

@Controller
public class HomeController {
	@Autowired
	private SanPhamDAO SanPhamDAO;
	
	@RequestMapping("/trangchu")
	public String home(Model model) {
	    List<SanPham> items = SanPhamDAO.findAll();
	    model.addAttribute("items", items);
	    return "index";
	}
}
