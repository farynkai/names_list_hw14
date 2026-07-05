package app;

import java.util.List;

public class DataHandler {

    public static String formatName(List<String> list, int index) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        if (index < 0 || index >= list.size()) {
            throw new IllegalArgumentException(
                    String.format("Index %d is out of bounds for list of size %d", index, list.size()));
        }
        return String.format("Name: %s is in index %d", list.get(index), index);
    }

    public static String formatList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder("Names:\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%d) %s%n", i + 1, list.get(i)));
        }
        return sb.toString();
    }
}
