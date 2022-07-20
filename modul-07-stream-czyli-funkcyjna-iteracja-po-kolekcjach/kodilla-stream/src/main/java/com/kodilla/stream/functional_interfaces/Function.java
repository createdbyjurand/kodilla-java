package com.kodilla.stream.functional_interfaces;

// The T is the input argument while R is the return result
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
