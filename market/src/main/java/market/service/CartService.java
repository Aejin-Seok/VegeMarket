package market.service;

import java.util.List;
import java.util.Map;

import market.model.CartDTO;
import market.model.FollowDTO;

public interface CartService {
	boolean findCartProduct(CartDTO cart);
	void insert(CartDTO cart);
	List<CartDTO> getShopNo(String m_email);
	List<CartDTO> list(String m_email);
	List<FollowDTO> getFollowList(String m_email);
	int update(CartDTO cart);
	int delete(int cart_no);
	int allDelete(String m_email);
    int deleteOrderCart(CartDTO cart);
}
