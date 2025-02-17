package poly.edu.Model;

import java.io.Serializable;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "SanPham") // Tên bảng trong CSDL
public class SanPham implements Serializable {
    @Id
    @Column(name = "ProductID")
    private String productID;

    @Column(name = "TenSanPham", nullable = false)
    private String tenSanPham;

    @Column(name = "Gia", nullable = false)
    private Double gia;

    @Column(name = "SoLuongTrongKho")
    private Integer soLuongTrongKho;

    @Column(name = "TheLoaiSanPham")
    private String theLoaiSanPham;

    @Column(name = "Description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "CategoryID") // Liên kết với bảng DanhMuc
    private DanhMuc danhMuc;

    // Quan hệ với bảng ChiTietDonHang
    @OneToMany(mappedBy = "sanPham")
    private List<ChiTietDonHang> chiTietDonHangs;

    // Quan hệ với bảng ChiTietGioHang
    @OneToMany(mappedBy = "sanPham")
    private List<GioHangChiTiet> gioHangChiTiets;

    // Constructor không tham số
    public SanPham() {
    }

    // Getter & Setter
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getSoLuongTrongKho() {
        return soLuongTrongKho;
    }

    public void setSoLuongTrongKho(Integer soLuongTrongKho) {
        this.soLuongTrongKho = soLuongTrongKho;
    }

    public String getTheLoaiSanPham() {
        return theLoaiSanPham;
    }

    public void setTheLoaiSanPham(String theLoaiSanPham) {
        this.theLoaiSanPham = theLoaiSanPham;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DanhMuc getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(DanhMuc danhMuc) {
        this.danhMuc = danhMuc;
    }

    public List<ChiTietDonHang> getChiTietDonHangs() {
        return chiTietDonHangs;
    }

    public void setChiTietDonHangs(List<ChiTietDonHang> chiTietDonHangs) {
        this.chiTietDonHangs = chiTietDonHangs;
    }

    public List<GioHangChiTiet> getGioHangChiTiets() {
        return gioHangChiTiets;
    }

    public void setChiTietGioHangs(List<GioHangChiTiet> gioHangChiTiets) {
        this.gioHangChiTiets = gioHangChiTiets;
    }
}
