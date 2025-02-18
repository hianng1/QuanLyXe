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
    
    @Column(name = "SoGhe")
    private Integer soGhe;
    
    @Column(name = "TruyenDong")
    private String truyenDong;
    
    @Column(name = "NhienLieu")
    private String nhienLieu;
    
    @Column(name = "DiaDiemLayXe")
    private String diaDiemLayXe;
    
    @Column(name = "HangXe")
    private String hangXe;

    @Column(name = "Gia", nullable = false)
    private Double gia;

    @Column(name = "SoLuongTrongKho")
    private Integer soLuongTrongKho;

    @Column(name = "TheLoaiSanPham")
    private String theLoaiSanPham;

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

	public Integer getSoGhe() {
		return soGhe;
	}

	public void setSoGhe(Integer soGhe) {
		this.soGhe = soGhe;
	}

	public String getTruyenDong() {
		return truyenDong;
	}

	public void setTruyenDong(String truyenDong) {
		this.truyenDong = truyenDong;
	}

	public String getNhienLieu() {
		return nhienLieu;
	}

	public void setNhienLieu(String nhienLieu) {
		this.nhienLieu = nhienLieu;
	}

	public String getDiaDiemLayXe() {
		return diaDiemLayXe;
	}

	public void setDiaDiemLayXe(String diaDiemLayXe) {
		this.diaDiemLayXe = diaDiemLayXe;
	}

	public String getHangXe() {
		return hangXe;
	}

	public void setHangXe(String hangXe) {
		this.hangXe = hangXe;
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

	public void setGioHangChiTiets(List<GioHangChiTiet> gioHangChiTiets) {
		this.gioHangChiTiets = gioHangChiTiets;
	}
    
}
