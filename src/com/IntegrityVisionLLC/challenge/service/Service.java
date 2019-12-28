package com.IntegrityVisionLLC.challenge.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Service {
    public static void findConcatenatedWordTwoMaxLength(List<String> list) {
        list.stream()
                .sorted((a, b) -> b.length() - a.length())
                .limit(2)
                .forEach(System.out::println);
    }

    public static List<String> readerAllWordsFromFile(String path) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        while (true) {
            String sad = reader.readLine();
            if (sad == null) {
                break;
            }
            list.add(sad);
        }
        return list;
    }
}
