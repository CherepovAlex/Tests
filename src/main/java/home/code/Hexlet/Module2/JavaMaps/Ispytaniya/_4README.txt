В классе App создайте публичный статический методом findWhere(), который принимает два параметра:

Список List<Map<String, String>> книг. Каждая книга представляет собой словарь Map<String, String>, в котором ключи и значения представлены строками
Словарь Map<String, String> из пар ключей и значений, представленных строками
Метод должен возвращать список List<Map<String, String>> со всеми книгами, данные которых соответствуют всем переданным парам. Если совпадений нет, метод должен вернуть пустой список.

    var books = new ArrayList<Map<String, String>>();

    var book1 = Map.of("title", "Cymbeline", "author", "Shakespeare", "year", "1611");
    var book2 = Map.of("title", "Book of Fooos", "author", "FooBar", "year", "1111");
    var book3 = Map.of("title", "The Tempest", "author", "Shakespeare", "year", "1611");
    var book4 = Map.of("title", "Book of Foos Barrrs", "author", "FooBar", "year", "2222");
    var book5 = Map.of("title", "Still foooing", "author", "FooBar", "year", "3333");
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);

    var where = Map.of(
        "author", "Shakespeare",
        "year", "1611"
    );

    var result = App.findWhere(books, where);

    System.out.println(result); // =>
    // [
    //     {title=Cymbeline, year=1611, author=Shakespeare},
    //     {title=The Tempest, year=1611, author=Shakespeare}
    // ]

Подсказки
Загляните в тесты, чтобы посмотреть другие варианты работы метода