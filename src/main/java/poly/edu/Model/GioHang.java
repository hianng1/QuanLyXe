package poly.edu.Model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "GioHang") // Tên bảng trong CSDL
public class GioHang implements Serializable {
    @Id
    @Column(name = "CartID")
    private String cartID;

    @OneToOne
    @JoinColumn(name = "UserID") // Liên kết với bảng KhachHang
    private KhachHang khachHang;

    @Column(name = "TongGiaTri")
    private Double tongGiaTri;

    @ManyToOne
    @JoinColumn(name = "CouponID", nullable = true) // Liên kết với bảng MaKhuyenMai (nếu có)
    private MaKhuyenMai maKhuyenMai;

    @OneToMany(mappedBy = "gioHang", cascade = CascadeType.ALL)
    private List<GioHangChiTiet> gioHangChiTiets;

    // Constructor không tham số
    public GioHang() {
    }

    // Getter & Setter
    public String getCartID() {
        return cartID;
    }

    public void setCartID(String cartID) {
        this.cartID = cartID;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public Double getTongGiaTri() {
        return tongGiaTri;
    }

    public void setTongGiaTri(Double tongGiaTri) {
        this.tongGiaTri = tongGiaTri;
    }

    public MaKhuyenMai getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(MaKhuyenMai maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public List<GioHangChiTiet> getGioHangChiTiets() {
        return gioHangChiTiets;
    }

    public void setGioHangChiTiets(List<GioHangChiTiet> gioHangChiTiets) {
        this.gioHangChiTiets = gioHangChiTiets;
    }
}
