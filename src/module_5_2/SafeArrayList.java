package module_5_2;

import java.util.ArrayList;

public class SafeArrayList {
    private ArrayList<String> list = new ArrayList<>();

    public synchronized void add(String s) {
        list.add(s);
    }

    public synchronized boolean remove(String s) {
        return list.remove(s);
    }

    public synchronized int size() {
        return list.size();
    }
}
