package com.codegym.repostory;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepostoryimpl implements ProductRepository<Product> {
    private ArrayList<Product> productList = new ArrayList<>();

    {
        Product product = new Product(4, "Nokia4", "500", "Nokia", "new");
        productList.add(new Product(1, "Samsung", "300", "sam sung", "new"));
        productList.add(new Product(2, "Iphone", "400", "Iphone", "new"));
        productList.add(new Product(3, "Nokia", "500", "Nokia", "new"));
        productList.add(product);
    }

    @Override
    public ArrayList<Product> findAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(Product e) {
        if (search(e)) {
            productList.remove(e);
        }
    }

    @Override
    public void delete(int index) {
        if (search(index)) {
            productList.remove(index);
        }
    }

    @Override
    public void edit(Product product) {
        productList.set(product.getId(), product);
    }

    @Override
    public void edit(int id, String name, String price, String status, String description) {
        Product product = new Product(id, name, price, status, description);
        productList.set(id, product);
    }

    @Override
    public boolean search(Product product) {
        for (Product i : productList) {
            if (i.getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean search(int id) {
        for (Product i : productList) {
            if (productList.get(id) != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void Sort() {

        Collections.sort(productList,new ChairWeightComparator());
    }

    class ChairWeightComparator implements Comparator<Product> {
        public int compare(Product product1, Product product2) {
            return Integer.parseInt(product1.getPrice()) - Integer.parseInt(product2.getPrice());
        }
    }
}

