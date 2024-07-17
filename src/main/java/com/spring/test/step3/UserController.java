package com.spring.test.step3;

import com.spring.test.step2.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.tewt.step3.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("users")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    public String fetchAndSaveData() {
        RestTemplate restTemplate = new RestTemplate();
        String apiUrl = "https://apis.data.go.kr/B551015/API208_1/BetwindowMgt_1?" +
                "serviceKey=ir3mpDlu0ufITimucTE5RxZmTEVvjVuI735f%2BsG9U%2FwtpLxyBtDJ%2Flcwners49PCPYrxb6xebBD%2BzIwdR5TXzw%3D%3D" +
                "&pageNo="+pageNo+"&numOfRows="+numOfRows+"&sale_race="+sale_race+"&rc_month="+rc_month+"&rc_date="+rc_date+"&type="+type;
        String response = restTemplate.getForObject(apiUrl, String.class);

        @exception
        try {
            service.saveEntitiesFromXml(response);
            return "Data saved successfully!";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred while saving data.";
    }
}
