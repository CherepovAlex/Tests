package Hexlet.Module2.JavaLists;

import java.util.List;
import java.util.ArrayList;

import Hexlet.Module2.JavaLists.model.Product;

class App3 {

    public static List<String> getProductsByPrice(List<Product> list, int minPrice, int maxPrice) {
        var newList = new ArrayList<String>();
        for (var listEl: list){
            if (listEl.getPrice() <= maxPrice && minPrice <= listEl.getPrice()){
                newList.add(listEl.getTitle());
            }
        }
        return newList;
    }

}

public class _3Products {
    public static void main(String[] args) {

        var products = List.of(
                new Product("bread", 5),
                new Product("milk", 10),
                new Product("fish", 30)
        );

        var result = App3.getProductsByPrice(products, 10, 30);
        System.out.println(result); // => ["milk", "fish"]

    }
}
