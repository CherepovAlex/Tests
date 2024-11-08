package home.code.Hexlet.Module2.JavaClasses;

class ProductsStorage {
    int goodsQuantity;
    int maxCapacity;

    public ProductsStorage(int goodsQuantity, int maxCapacity) {
        this.goodsQuantity = goodsQuantity; //количество товара на складе
        this.maxCapacity = maxCapacity;     //максимальная вместимость склада
    }

    public int getGoodsQuantity() {
        return goodsQuantity;
    }


    public void placeProducts(int numberProd) {
        if (goodsQuantity + numberProd <= maxCapacity) {
            goodsQuantity = goodsQuantity + numberProd;
        } else {
            System.out.println("действие не возможно выполнить");
        }
    }

    public void takeProducts(int numberProd) {
        if (goodsQuantity - numberProd >= 0) {
            goodsQuantity = goodsQuantity - numberProd;
        } else {
            System.out.println("действие не возможно выполнить");
        }
    }
}

public class _6Producting {
    public static void main(String[] args) {
        // Создаем новый объект склада с начальным количеством товара и максимальной вместимостью
        var storage = new ProductsStorage(20, 50);

        // Размещаем там товар
        storage.placeProducts(20);
        System.out.println(storage.getGoodsQuantity()); // 40

        // Будет превышена максимальная вместимость
        storage.placeProducts(60); // => Общее количество товара превысит максимальную вместимость
        // Состояние склада не изменилось
        System.out.println(storage.getGoodsQuantity()); // 40

        // Забираем товары со склада
        storage.takeProducts(30);
        System.out.println(storage.getGoodsQuantity()); // 10

        // Это больше, чем есть сейчас
        storage.takeProducts(60); // => Такого количество товара нет на складе
        System.out.println(storage.getGoodsQuantity()); // 10
    }
}
