package com.codegym.repostory;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository <E>{
    ArrayList<E> findAll();

    void add(E e);
    void delete(int index);
    void delete(E e);
    void edit(E e);
    void edit(int id,String name,String price ,String status, String description);
    boolean search(E e);
    boolean search(int id);
    void Sort();
}
