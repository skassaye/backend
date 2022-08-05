package com.example.itemsApi.service;

import com.example.itemsApi.repository.Item;
import com.example.itemsApi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceMySQL implements ItemService{
    private final ItemRepository itemRepository;

    public ItemServiceMySQL(@Autowired ItemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item )
    {
       return itemRepository.save(item);
    }

    @Override
    public boolean delete( int itemId )
    { if (itemRepository.getReferenceById(itemId) !=null){
        itemRepository.delete(itemRepository.getReferenceById(itemId));
        return true;
    } else {
        return false;
    }

    }

    @Override
    public List<Item> all()
    {
        return itemRepository.findAll();
    }

    @Override
    public Item findById( int itemId )
    {
      return itemRepository.findById(itemId).get();
    }

}
