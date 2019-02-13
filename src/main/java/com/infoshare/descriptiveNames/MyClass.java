package com.infoshare.descriptiveNames;

import java.util.List;

public class MyClass {

    public int c(List<Integer> l) {
        int s = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > 3 && l.get(i) % 2 == 0) {
                s = s + l.get(i) * l.get(i);
            }
        }
        return s;
    }
}
