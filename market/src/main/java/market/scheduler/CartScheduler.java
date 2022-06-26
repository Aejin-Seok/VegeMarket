package market.scheduler;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import market.service.CartService;

@Component
public class CartScheduler {

	@Autowired
	CartService cs;
	
	// 장바구니 등록일로부터 30일 후에 자동으로 삭제되는 스케줄러
	@Scheduled(cron="0 0 4 * * *") // 매일 오전 4시마다 실행
	public void autoCartDelete() throws Exception {
		cs.autoCartDelete();       // 등록일로부터 30일이 지난 장바구니 상품 삭제 
	}
	
}
