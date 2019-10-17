package com.codegym.service;

import java.util.List;

public interface ProductService<Product> {
    List<Product> findAllHaveBusiness();
    void addHaveBusiness(Product product);
    void deleteHaveBusiness(int index);
    void deleteHaveBusiness(Product product);
    void editHaveBusiness(Product product);
    void editHaveBusiness(int id,String name,String price ,String status, String description);
    boolean searchHaveBusiness(Product product);
    boolean searchHaveBusiness(int id);
    void SortHaveBusiness();
}
