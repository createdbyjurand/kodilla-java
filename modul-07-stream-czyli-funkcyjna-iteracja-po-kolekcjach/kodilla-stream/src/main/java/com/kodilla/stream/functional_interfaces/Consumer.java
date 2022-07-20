package com.kodilla.stream.functional_interfaces;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
