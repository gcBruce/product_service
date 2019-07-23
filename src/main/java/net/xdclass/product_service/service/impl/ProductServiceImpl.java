package net.xdclass.product_service.service.impl;

import net.xdclass.product_service.domain.Product;
import net.xdclass.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static final Map<Integer,Product> daoMap=new HashMap<>();

    static {
        Product p1=new Product(1,"iphonex",9999,10);
        Product p2=new Product(2,"冰箱",132,19);
        Product p3=new Product(3,"洗衣机",4512,90);
        Product p4=new Product(4,"电话",8798,150);
        Product p5=new Product(5,"汽车",6546,140);
        Product p6=new Product(6,"椅子",231,20);
        Product p7=new Product(7,"java编程思想",4654,10);
        Product p8=new Product(8,"电视机",876546,10);
        daoMap.put(p1.getId(),p1);
        daoMap.put(p2.getId(),p2);
        daoMap.put(p3.getId(),p3);
        daoMap.put(p4.getId(),p4);
        daoMap.put(p5.getId(),p5);
        daoMap.put(p6.getId(),p6);
        daoMap.put(p7.getId(),p7);
        daoMap.put(p8.getId(),p8);

    }

    @Override
    public List<Product> listProduct() {

        List<Product> list=new ArrayList<>(daoMap.values());
        return list;
    }

    @Override
    public Product findById(int id) {
        return daoMap.get(id);
    }
}
