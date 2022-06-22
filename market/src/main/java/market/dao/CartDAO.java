package market.dao;

import java.util.List;

import market.model.CartDTO;
import market.model.FollowDTO;
import market.model.ProductDTO;

public interface CartDAO {
	
	boolean findCartProduct(CartDTO cart);
	void insert (CartDTO cart);
	List<CartDTO> getShopNo(String m_email);
	List<CartDTO> list(String m_email);
	List<FollowDTO> getFollowList(String m_email);
	int update(CartDTO cart);
	int delete(int cart_no);
	int allDelete(String m_email);
	int deleteOrderCart(CartDTO cart);
}
