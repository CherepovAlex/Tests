package io.hexlet.Module2.JavaAutomaticTest.implementations8;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import io.hexlet.Module2.JavaAutomaticTest.Good;


public final class CartWrong3 implements Cart {
    private List<Map> items = new ArrayList<>();

    public void addItem(Good item, int count) {
        items.add(Map.of(
            "good", item,
            "count", count
        ));
    }

    public List<Map> getItems() {
        return items;
    }

    public int getCost() {
        return items
            .stream()
            .mapToInt(item -> {
                Good good = (Good) item.get("good");
                return good.getPrice() * (int) item.get("count");
            })
            .sum();
    }

    public int getCount() {
        return items.size();
    }
}
