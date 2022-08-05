package com.example.itemsApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
public interface ItemRepository extends JpaRepository<Item, Integer>
{
}