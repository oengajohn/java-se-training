package com.systechafrica.part2.interfaces;

public interface Crud<T> {
    T create(T t) ;
    T find(String searchKey) ;
    T update(String searchKey,String fieldUpdate) ;
    void delete(String searchKey) ;
}
