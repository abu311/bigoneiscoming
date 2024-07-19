/*package com.spring.test.step3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RaceOpenAPIService {
    private final RestTemplate restTemplate;

    public RaceOpenAPIService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void getSales() {
        RaceOpenAPI getSales = RaceOpenAPI.GET_SALES;
        String url = getSales.getUrl();
        String serviceKey = getSales.getServiceKey();
        List<String> queryParams = getSales.getQueryParams();

        restTemplate.getForObject(url,);
    }
}


 */
//일단은 미사용 참고하는데 쓸 수 있으니 주석화