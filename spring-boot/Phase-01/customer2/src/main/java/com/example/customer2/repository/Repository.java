package com.example.customer2.repository;

public interface Repository<T, ID> {
    T save(T data);

    T findById(ID id);

    Iterable<T> findAll();

    void deleteById(ID id);
}
