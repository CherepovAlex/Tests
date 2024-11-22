package io.hexlet.Module2.JavaAutomaticTest.implementations8;

import io.hexlet.Module2.JavaAutomaticTest.Good;
import java.util.List;
import java.util.Map;

public interface Cart {
    void addItem(Good item, int count);
    List<Map> getItems();
    int getCost();
    int getCount();
}
