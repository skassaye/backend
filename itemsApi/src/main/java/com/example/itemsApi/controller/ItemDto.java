package com.example.itemsApi.controller;

public class ItemDto
{

    private String name;
    private Double price;
    private String description;

    private String imageUrl;

    public ItemDto( String name,Double price, String description, String imageUrl )
    {
        this.name = name;
        this.price= price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public void setImageUrl( String imageUrl )
    {
        this.imageUrl = imageUrl;
    }
}
