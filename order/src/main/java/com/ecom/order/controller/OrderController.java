package com.ecom.order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class OrderController {

    @GetMapping("order/{order}")
    public String sample(@PathVariable("order") String order) {
        return "Order of the product "+order +" placed Order id is :  "+new Random().nextInt();
    }

}
