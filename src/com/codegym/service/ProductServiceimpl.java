package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repostory.ProductRepository;
import com.codegym.repostory.ProductRepostoryimpl;

import java.util.List;

public class ProductServiceimpl implements ProductService<Product> {
    private ProductRepository productRepostoryimpl = new ProductRepostoryimpl();

    @Override
    public List<Product> findAllHaveBusiness() {

        return productRepostoryimpl.findAll();
    }

    @Override
    public void addHaveBusiness(Product product) {
        productRepostoryimpl.add(product);
    }

    @Override
    public void deleteHaveBusiness(int index) {
        productRepostoryimpl.delete(index);
    }

    @Override
    public void deleteHaveBusiness(Product product) {
        productRepostoryimpl.delete(product);
    }

    @Override
    public void editHaveBusiness(Product product) {
        productRepostoryimpl.edit(product);
    }

    @Override
    public void editHaveBusiness(int id, String name, String price, String status, String description) {
        productRepostoryimpl.edit(id, name, price, status, description);
    }

    @Override
    public boolean searchHaveBusiness(Product product) {

        return  productRepostoryimpl.search(product);
    }

    @Override
    public boolean searchHaveBusiness(int id) {
        return productRepostoryimpl.search(id);
    }

    @Override
    public void SortHaveBusiness() {
        productRepostoryimpl.Sort();
    }
}
