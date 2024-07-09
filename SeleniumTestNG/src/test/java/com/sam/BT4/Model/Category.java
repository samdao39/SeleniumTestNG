package com.sam.BT4.Model;

public  class Category {
  public String name;
    public String banner;
   public String parentCategory;

    public Category(String name, String banner, String parentCategory) {
        this.name = name;
        this.banner = banner;
        this.parentCategory = parentCategory;
    }
}

