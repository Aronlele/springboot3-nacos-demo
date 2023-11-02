package com.fantasymz.order.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Messi Mei
 * @version 1.0
 * @since 2023/10/30
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/add")
    public String add(String id){
        System.out.println("order success!");
        System.out.println("restTemplate.getForObject = " + restTemplate.getForObject("http://stock-service/stock/redact", String.class));
        return "hello world";
    }
}
