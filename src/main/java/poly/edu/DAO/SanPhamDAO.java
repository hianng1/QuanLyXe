package poly.edu.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import poly.edu.Model.SanPham;

public interface SanPhamDAO extends JpaRepository<SanPham, String>{
//	List<SanPham> findByHangXe(Boolean trangThai);
    // Ví dụ: tìm xe theo hãng xe
    List<SanPham> findByHangXe(String hangXe);
    
    // Ví dụ: tìm xe theo tên xe
    List<SanPham> findByTenSanPham(String tenSanPham);
    @Query("SELECT d FROM SanPham d WHERE d.productID = :ProductID")
    List<SanPham> findByProductId(@Param("ProductID") String ProductID);

}
