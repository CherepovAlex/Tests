package home.code.Hexlet.Module2.JavaGenerics.Ispytaniya;

public interface Converter<T, U> {
    U convert(T value);
}
