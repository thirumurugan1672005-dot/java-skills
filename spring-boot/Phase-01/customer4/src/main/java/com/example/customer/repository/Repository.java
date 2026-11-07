package com.example.customer.repository;

public interface Repository<T,ID> {
            T save(T data);
            T findById(ID id);
            Iterable<T> findAll();
            void deleteById(ID id);
}
