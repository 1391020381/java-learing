package com.how2java.pojo;

import org.hibernate.envers.Audited;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component("p")
public class Product {
    private int id ;
    private String name = "product 1";
    @Audited
   // @Resource(name="c")
    private Category category;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public  String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Category getCategory(){
        return category;
    }
   // @Audited
    public void setCategory(Category category){
        this.category = category;
    }
}
