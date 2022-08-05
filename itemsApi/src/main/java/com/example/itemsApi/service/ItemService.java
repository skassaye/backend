package com.example.itemsApi.service;

import com.example.itemsApi.repository.Item;

import java.util.List;

public interface ItemService
{

    Item save(Item item );

    boolean delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}