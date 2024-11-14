package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya;

import home.code.Hexlet.Module2.JavaGenerics.model.Post;

import java.util.Map;
import java.util.function.Function;

public class _5FunctionConverter<T, U> implements Converter<T, U> {
    private final Function<T, U> func;

    public _5FunctionConverter(Function<T, U> func) {
        this.func = func;
    }

    @Override
    public U convert(T value) {
        return func.apply(value);
    }

    public static void main(String[] args) {
        var postData = Map.of(
                "name", "test post",
                "body", "test body"
        );

        // Функция, которая определяет правила конвертации Map в объект класса Post
        Function<Map<String, String>, Post> func = data -> {
            return new Post(
                    data.get("name"),
                    data.get("body")
            );
        };

        // Создаем конвертер для конвертации Map в объект класса Post
        var converter = new _5FunctionConverter<Map<String, String>, Post>(func);

        // Теперь мы можем преобразовывть Map в объекты класса Post
        var post = converter.convert(postData);
    }


}
