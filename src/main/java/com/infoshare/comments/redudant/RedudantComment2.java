package com.infoshare.comments.redudant;

public class RedudantComment2 {



    // Metoda, która wstawia wartosc do kolekcji jeżeli kolekcja jej nie zawiera, a następnie
    // zwraca true. W przypadku gdy wartość nie występuje w kolekcji zwracana jest wartość false
    public boolean putIfAbsent(V value) {
        if (!collection.contains(value)) {
            collection.put(value);
            return true;
        }
        return false;
    }

}
