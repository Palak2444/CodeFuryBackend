package com.example.model;

import java.util.Objects;

public class Product {
    // Attributes
    private int productId;
    private String name;
    private double price;
    private ProductCategory category;

    // Constructor
    public Product(int productId, String name, double price, ProductCategory category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getter methods
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    // Setter methods 
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }
    
    

    @Override
	public int hashCode() {
		return Objects.hash(category, name, price, productId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return category == other.category && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& productId == other.productId;
	}

	@Override
    public String toString() {
        return "Product ID: " + productId +
                "\nName: " + name +
                "\nPrice: $" + price +
                "\nCategory: " + category.toString();
    }
}
