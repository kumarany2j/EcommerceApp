package com.ecom.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@RestController
public class ProductController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("product/{productname}")
    public String sample(@PathVariable("productname") String productname) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        return restTemplate.exchange(
                "http://localhost:8081/order/"+productname, HttpMethod.GET, null, String.class).getBody();
    }

}
