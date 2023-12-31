package tk.huclele.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * demo stock service app.
 * 
 * @author huclele
 * @version 1.0
 * @since 2023/10/30
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StockServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(StockServiceApplication.class,args);
    }
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

}
