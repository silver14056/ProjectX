package ui;

import java.util.List;

public class UI {
    public <T> void writeList(String name, List<T> list) {
        System.out.println("Habits " + name);

        for(T t : list) {
            System.out.println(t.toString());
        }
    }
}
