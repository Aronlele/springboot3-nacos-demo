package com.fantasymz.stock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Messi Mei
 * @version 1.0
 * @since 2023/10/30
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("/redact")
    public String redact(){
        System.out.println("减少");
        return "减少成功";
    }

}
