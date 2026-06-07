package app;

import java.util.List;

public class DataRepository {
    private final List<String> names = List.of("Alice", "Bob", "Lucy", "Denis", "Tom");

    public List<String> getNames() {
        return names;
    }
}
