package tk.huclele.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import tk.huclele.order.record.NewOrderRecord;

/**
 * demo order controller.
 *
 * @author huclele
 * @version 1.0
 * @since 2023/10/30
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private final RestTemplate restTemplate;

    @Autowired
    public OrderController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @PostMapping("/add")
    public String add(@RequestBody NewOrderRecord newOrderRecord) {
        System.out.println("********** new order operation **********");
        System.out.println(newOrderRecord);
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<>(2);
        paramMap.add("productId", newOrderRecord.productId());
        paramMap.add("quantity", String.valueOf(newOrderRecord.quantity()));
        String url = "http://stock-service/stock/deduct";
        url = UriComponentsBuilder.fromUriString(url).queryParams(paramMap).toUriString();
        return restTemplate.exchange(url, HttpMethod.POST, null, String.class).getBody();
    }
}
