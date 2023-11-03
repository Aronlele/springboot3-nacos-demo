package tk.huclele.stock.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo controller.
 *
 * @author huclele
 * @version 1.0
 * @since 2023/10/30
 */
@RestController
@RequestMapping("/stock")
public class StockController {

    @PostMapping("/deduct")
    public String deduct(@RequestParam String productId, @RequestParam Integer quantity) {
        System.out.println("********** deduct stock operation **********");
        return productId + " deduct " + quantity + " success";
    }

}
