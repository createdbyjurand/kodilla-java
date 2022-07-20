package com.kodilla.stream.functional_interfaces;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
