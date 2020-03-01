package com.online.shopee.controller;

import com.online.shopee.model.Product;
import com.online.shopee.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class OnlineShopeeController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET,path = "/retrieveAllProducts")
    @ResponseBody
    public List<Product> getAllProducts(){
        //List<Product> products = productService.getAllProducts();
        List<Product> products  = new ArrayList<>();
        products.add(new Product(123,1 ,"SHIRT","RED","m"));
        return products;
    }

}
