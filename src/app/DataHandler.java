package app;

import java.util.List;

public class DataHandler {

    public static String formatName(List<String> list, int index) {
        if (list == null || index < 0 || index >= list.size()) {
            return "Wrong index!";
        }
        return "Name: " + list.get(index) + " is in index " + index;
    }

    public static String formatList(List<String> list) {
        if (list == null) return "";
        StringBuilder sb = new StringBuilder("Names:\n");
        for (int i = 0; i < list.size(); i++) {
            sb.append(String.format("%d) %s%n", i + 1, list.get(i)));
        }
        return sb.toString();
    }
}
