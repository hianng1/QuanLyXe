package poly.edu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



import poly.edu.DAO.DanhMucDAO;
import poly.edu.DAO.KhachHangDAO;
import poly.edu.DAO.MaKhuyenMaiDAO;
import poly.edu.DAO.NhanVienDAO;
import poly.edu.DAO.PhuKienOtoDAO;
import poly.edu.DAO.SanPhamDAO;
import poly.edu.Model.DanhMuc;
import poly.edu.Model.KhachHang;
import poly.edu.Model.MaKhuyenMai;
import poly.edu.Model.NhanVien;
import poly.edu.Model.PhuKienOto;
import poly.edu.Model.SanPham;

@Controller
public class HomeController {
	@Autowired
    private DanhMucDAO danhMucDAO;
    @Autowired
    private SanPhamDAO sanPhamDAO;
    @Autowired
    private NhanVienDAO nhanVienDAO;
    @Autowired
    private KhachHangDAO KhachHangDAO;
    @Autowired
    private MaKhuyenMaiDAO maKhuyenMaiDAO;
    @Autowired
    private PhuKienOtoDAO phuKienOtoDAO;

    @GetMapping(value = "/trangchu", produces = "text/html; charset=UTF-8")
    public String home(Model model) {
        try {
            List<SanPham> sanPhamList = sanPhamDAO.findAll();
            model.addAttribute("sanPhamList", sanPhamList);
            List<DanhMuc> danhMucList = danhMucDAO.findAll();
            model.addAttribute("danhMucList", danhMucList);
            List<NhanVien> nhanVienList = nhanVienDAO.findAll();
            model.addAttribute("nhanVienList", nhanVienList);
            List<KhachHang> khachHangList = KhachHangDAO.findAll();
            model.addAttribute("khachHangList", khachHangList);
            List<MaKhuyenMai> maKhuyenMaiList = maKhuyenMaiDAO.findAll();
            model.addAttribute("maKhuyenMaiList", maKhuyenMaiList);
            List<PhuKienOto> phuKienOtoList = phuKienOtoDAO.findAll();
            model.addAttribute("phuKienOtoList", phuKienOtoList);
            
        } catch (Exception e) {
            model.addAttribute("error", "Lỗi khi lấy danh sách sản phẩm: " + e.getMessage());
        }
        return "index2";
    }
    // CTSP
    @GetMapping("/details/{productId}")
    public String getDetailsByProductId(@PathVariable("productId") String productId, Model model) {
        List<SanPham> details = sanPhamDAO.findByProductId(productId);

        if (details.isEmpty()) {
            model.addAttribute("message", "Không tìm thấy thông tin chi tiết cho sản phẩm này.");
        } else {
            model.addAttribute("details", details);
        }

        return "Details"; 
    }

}
