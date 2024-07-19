/*package com.spring.test.step3;

import com.spring.test.step3.UserDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange("https://apis.data.go.kr")
public interface HttpInterface {
    @GetExchange("/B551015/API208_1/BetwindowMgt_1")
    public UserDto getSales(
            @PathVariable Integer pageNo,
            @PathVariable Integer numOfRows
            //@PathVariable
    );
}

private String numOfRows;
String apiUrl = "https://apis.data.go.kr/B551015/API208_1/BetwindowMgt_1?" +
        "serviceKey=ir3mpDlu0ufITimucTE5RxZmTEVvjVuI735f%2BsG9U%2FwtpLxyBtDJ%2Flcwners49PCPYrxb6xebBD%2BzIwdR5TXzw%3D%3D" +
        "&pageNo=" + pageNo + "&numOfRows=" + numOfRows + "&sale_race=" + sale_race + "&rc_month=" + rc_month + "&rc_date=" + rc_date + "&type=" + type;

 */

// 당장은 미사용....