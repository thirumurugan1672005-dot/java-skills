package com.example.management.repository;

public interface Repository<T,ID> {
         T save(T data);
         T findById(ID customerId);
         Iterable<T> findAll();
         void deleteById(ID customerId);
}
