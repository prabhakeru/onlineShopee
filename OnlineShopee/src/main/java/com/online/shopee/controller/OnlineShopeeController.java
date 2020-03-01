package com.online.shopee.controller;

import com.online.shopee.model.Product;
import com.online.shopee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class OnlineShopeeController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET,path = "/onlineshopee/getSKU")
    public List<Product> getAllProducts(){
        List<Product> products = productService.getAllProducts();
        return products;
    }

}
