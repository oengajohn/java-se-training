package com.systechafrica.part3.collections;

public class Node<T> {
    private Object prev;
    private T data;
    private Object next;
    
    public Object getPrev() {
        return prev;
    }
    public void setPrev(Object prev) {
        this.prev = prev;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public Object getNext() {
        return next;
    }
    public void setNext(Object next) {
        this.next = next;
    }

    
}
