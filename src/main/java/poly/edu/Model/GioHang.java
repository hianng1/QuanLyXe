package poly.edu.Model;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "GioHang")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GioHang implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name = "CartID", updatable = false, nullable = false)
	private Long cartID;

    @OneToOne
    @JoinColumn(name = "UserID")
    private KhachHang khachHang;

    @Column(name = "TongGiaTri")
    private Double tongGiaTri;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "CouponID", nullable = true, referencedColumnName = "CouponID")
    private MaKhuyenMai maKhuyenMai;

    @OneToMany(mappedBy = "gioHang", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GioHangChiTiet> gioHangChiTiets = new ArrayList<>();

    
}
