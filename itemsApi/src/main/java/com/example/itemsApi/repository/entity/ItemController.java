package com.example.itemsApi.repository.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController{

    final ItemRepository itemRepository;


    public ItemController(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public Iterable<Item> getItems(){
        return itemRepository.findAll();
    }
}