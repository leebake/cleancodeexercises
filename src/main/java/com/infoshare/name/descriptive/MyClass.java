package com.infoshare.name.descriptive;

import java.util.List;

public class MyClass {

    public int c(List<Integer> l, int g) {
        int s = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) > g && l.get(i) % 2 == 0) {
                s = s + l.get(i) * l.get(i);
            }
        }
        return s;
    }
}
