package com.systechafrica.part4.functionalprogramming;

@FunctionalInterface
public interface CompareFunction<T,P,R> {
    R compare(T t, P p);
}
