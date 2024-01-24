package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Literature> literatures;

    public Library() {
        literatures = new ArrayList<>();
    }

    public void addToStock(Literature item) {
        this.literatures.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInLiterature(String title) {
        List<Literature> filtered = this.literatures.stream()
                .filter(literature -> literature.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkIn();
    }

    public String checkOutLiterature(String title) {
        List<Literature> filtered = this.literatures.stream()
                .filter(literature -> literature.title.equals(title))
                .toList();

        if (filtered.size() < 1) {
            return "item is not part of the library's collection";
        }

        return filtered.get(0).checkOut();
    }

}
