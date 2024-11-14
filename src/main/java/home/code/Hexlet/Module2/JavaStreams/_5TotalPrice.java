package home.code.Hexlet.Module2.JavaStreams;

import java.util.List;

import home.code.Hexlet.Module2.JavaStreams.model.Product;

class App5 {
    public static int getTotalPrice(List<Product> list) {
        return list.stream()
                .filter((product) -> product.getCategory().equals("electronics"))
                .map(Product::getPrice)
                .reduce(0, Integer::sum);
    }
}

public class _5TotalPrice {
    public static void main(String[] args) {
        var products = List.of(
                new Product("Smartphone", "electronics", 500),
                new Product("Laptop", "electronics", 1000),
                new Product("Headphones", "electronics", 100),
                new Product("Smart Watch", "electronics", 300),
                new Product("T-Shirt", "cloth", 20),
                new Product("Sneakers", "shoes", 100),
                new Product("Coffee Machine", "kitchen", 200),
                new Product("Sunglasses", "accessories", 50),
                new Product("Book", "books", 15),
                new Product("Gaming Console", "electronics", 400)
        );

        System.out.println(App5.getTotalPrice(products)); // 2300
    }
}
