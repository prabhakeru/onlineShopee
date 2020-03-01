package com.online.shopee.service;

import com.online.shopee.dao.OnlineShopeeDao;
import com.online.shopee.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private OnlineShopeeDao onlineShopeeDao;
    public List<Product> getAllProducts() {

        List<Product> products = onlineShopeeDao.getAllProducts();
        return products;
    }
}
