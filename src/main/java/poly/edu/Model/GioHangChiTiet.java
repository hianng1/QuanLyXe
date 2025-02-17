package poly.edu.Model;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@Table(name = "GioHangChiTiet") // Tên bảng trong CSDL
public class GioHangChiTiet implements Serializable {
    @Id
    @Column(name = "CartItemID")
    private String cartItemID;

    @ManyToOne
    @JoinColumn(name = "CartID") // Liên kết với bảng Giỏ Hàng
    private GioHang gioHang;

    @ManyToOne
    @JoinColumn(name = "ProductID") // Liên kết với bảng Sản Phẩm
    private SanPham sanPham;

    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;

    // Constructor không tham số
    public GioHangChiTiet() {
    }

    // Getter & Setter
    public String getCartItemID() {
        return cartItemID;
    }

    public void setCartItemID(String cartItemID) {
        this.cartItemID = cartItemID;
    }

    public GioHang getGioHang() {
        return gioHang;
    }

    public void setGioHang(GioHang gioHang) {
        this.gioHang = gioHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }
}
