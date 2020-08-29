package oop1;

public class Shop {

    private String name;
    private String products;

    public Shop (String name, String products){
        System.out.println("Новый магазин: " + name);
        this.name = name;
        this.products = products;
    }


    public String getName(){return name;}
    public String getProducts(){return products;}

    public void setName(String name){
        this.name = name;
    }

    public void setProducts(String products){
        this.products = products;
    }

}