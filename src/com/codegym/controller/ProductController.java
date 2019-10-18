package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceimpl;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        int check=0;
        ProductService<Product> productService=new ProductServiceimpl();
        List<Product> arrayList= productService.findAllHaveBusiness();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuong trinh quan ly san pham");
        int choice;
        do {
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    for (Product product : productService.findAllHaveBusiness()) {
                        System.out.println("ID: " + product.getId() + " NAME: " + product.getName() + " PRICE: " + product.getPrice()
                                + " Status " + product.getStatus()+" Description " +product.getDescription());
                    }
                    break;
                }
                case 2: {
                    System.out.println("Add Product.");
                    Product productObject = inputProduct();
                    productService.addHaveBusiness(productObject);
                    break;

                }
                case 3:{
                    System.out.println("Edit Product.");
                    Product productObject = inputProduct();
                    productService.editHaveBusiness(productObject);
                    break;
                }
                case 4:{
                    System.out.println("Delete Product.");
                    Product productObject = inputProduct();
                    productService.deleteHaveBusiness(productObject);
                    break;
                }
                case 5:{
                    System.out.println("Search Product.");
                    Product productObject = inputProduct();
                    System.out.println(productService.searchHaveBusiness(productObject););
                    break;
                }
                case 6:{
                    System.out.println("Sort Product.");
                    productService.SortHaveBusiness();
                    for (int i = 0; i <productService.findAllHaveBusiness().size(); i++) {
                        Product product=productService.findAllHaveBusiness().get(i);
                        System.out.println("ID: " + product.getId() + " NAME: " + product.getName() + " PRICE: " + product.getPrice()
                                + " Status " + product.getStatus()+" Description " +product.getDescription());
                    }
                    break;
                }
            }

        } while (choice != 0);
    }
    private static void menu() {
        System.out.println("0. Exit.");
        System.out.println("1. Hien thi danh sach san pham.");
        System.out.println("2. creat new product.");
        System.out.println("3. Edit product.");
        System.out.println("4. delete product.");
        System.out.println("5. search product.");
        System.out.println("6. sort in Price");
        System.out.println("Input select:");
    }

    private static Product inputProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ID:");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Nhap NAME:");
        String name = input.nextLine();
        System.out.println("Nhap PRICE:");
        String price = input.nextLine();
        input.nextLine();
        System.out.println("Nhap Status:");
        String status=input.nextLine();
        input.nextLine();
        System.out.println("Nhap description:");
        String description=input.nextLine();
        Product product = new Product(id, name, price,status,description);
        return product;
    }
}

