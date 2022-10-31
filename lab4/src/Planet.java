import java.util.Iterator;

public class Planet implements Nameable, Iterable {
    String name;
    @Override
    public String getName() {
        return this.name;
    }
    public Planet(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}

