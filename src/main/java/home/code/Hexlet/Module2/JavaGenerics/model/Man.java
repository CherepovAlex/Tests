package home.code.Hexlet.Module2.JavaGenerics.model;

public final class Man implements Human {

    private final String name;

    public Man(final String name) {
        this.name = name;
    }

    @Override
    public String getSex() {
        return "male";
    }

    @Override
    public String getName() {
        return name;
    }
}