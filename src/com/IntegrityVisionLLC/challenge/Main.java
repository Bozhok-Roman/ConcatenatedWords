package com.IntegrityVisionLLC.challenge;

import com.IntegrityVisionLLC.challenge.finder.Finder;
import com.IntegrityVisionLLC.challenge.service.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private final static String PATH = "/home/romanb/ConcatenatedWords/src/words.txt";


    public static void main(String[] args) throws IOException {

        List<String> allWordsFromFile = Service.readerAllWordsFromFile(PATH);

        String[] objects = allWordsFromFile.toArray(new String[allWordsFromFile.size()]);

        Finder finder = new Finder();

        List<String> allConcatenatedWordsInADict = finder.findAllConcatenatedWordsInADict(objects);

        System.out.println("Concatenated words count: "+allConcatenatedWordsInADict.size());

        System.out.println("The longest and 2nd longest concatenated words:");

        Service.findConcatenatedWordTwoMaxLength(allConcatenatedWordsInADict);

    }


}





