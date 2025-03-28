package poly.edu.Service;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.mapping.Collection;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import poly.edu.Model.GioHang;
import poly.edu.Model.PhuKienOto;

@SessionScope
@Service
public class CartServiceImp implements CartService{
	Map<Long, GioHang> maps = new HashMap<Long, GioHang>();
	
	@Override
	public void add(GioHang item) {
		GioHang cartItem = maps.get(item.getCartID());
		if(cartItem == null) {
			maps.put(item.getCartID(), item);
		}else {
			cartItem.setSoLuong(cartItem.getSoLuong() + 1);
		}
	}
	
	@Override
	public void remove(Long id) {
		maps.remove(id);
	}
	
	@Override
	public GioHang update(long CartID, int SoLuong) {
		GioHang giohang = maps.get(CartID);
		giohang.setSoLuong(SoLuong);
		return giohang;
	}
	
	@Override
	public void clear() {
		maps.clear();
	}
	@Override
	public java.util.Collection<GioHang> getAllItems(){
		return maps.values();
	}
	@Override
	public int getCount() {
		return maps.values().size();
	}
	
	@Override
	public double getAmounts() {
	    return maps.values().stream().mapToDouble(item -> item.getSoLuong() * item.getGia()).sum();
	}
}
