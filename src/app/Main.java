package app;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> data = new DataRepository().getNames();
        System.out.println(DataHandler.formatList(data));
        System.out.println(DataHandler.formatName(data, 2));
    }
}