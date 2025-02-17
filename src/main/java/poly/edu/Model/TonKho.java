package poly.edu.Model;

import java.io.Serializable;
import java.util.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "TonKho") // Tên bảng trong CSDL
public class TonKho implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng ID nếu cần
    @Column(name = "InventoryID")
    private Long inventoryID;

    @ManyToOne
    @JoinColumn(name = "ProductID", nullable = false) // Liên kết với bảng SanPham
    private SanPham sanPham;

    @Column(name = "SoLuong", nullable = false)
    private Integer soLuong;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LanCapNhatCuoi", nullable = false)
    private Date lanCapNhatCuoi;

    // Constructor không tham số
    public TonKho() {
    }

    // Getter & Setter
    public Long getInventoryID() {
        return inventoryID;
    }

    public void setInventoryID(Long inventoryID) {
        this.inventoryID = inventoryID;
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

    public Date getLanCapNhatCuoi() {
        return lanCapNhatCuoi;
    }

    public void setLanCapNhatCuoi(Date lanCapNhatCuoi) {
        this.lanCapNhatCuoi = lanCapNhatCuoi;
    }
}
