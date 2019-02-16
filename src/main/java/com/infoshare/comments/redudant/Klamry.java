package com.infoshare.comments.redudant;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Klamry {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            try {
                InputStreamReader in = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(in);
                for (int j = 0; j < 250; j++) {
                    if (numbers.get(j) > 10) {
                        dao.save(number);
                    } // if
                } // for
            } catch (Exception e) {
                logger.log("Exception");
                if (e.equals(IllegalStateException.class)) {
                    for (int j = 0; j < array.size(); j++) {
                        System.out.println(array[j]);
                    } // for
                } // if
            } //catch
        } // for
    } // main
}
