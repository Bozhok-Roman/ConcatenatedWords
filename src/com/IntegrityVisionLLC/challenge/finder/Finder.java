package com.IntegrityVisionLLC.challenge.finder;

import java.util.ArrayList;
import java.util.List;

public class Finder {
    private NodeList nodeList;

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        nodeList = new NodeList();
        List<String> res = new ArrayList<>();

        for (String word : words)
            nodeList.insert(word);

        for (String word : words) {
            if (valid(word)) res.add(word);
        }

        return res;
    }

    private boolean valid( String word) {

        String leftStr = "";
        String rightStr = "";

        if (word.length() <= 1 && !nodeList.check(word))
            return false;


        for (int i = 0; i < word.length() - 1; ++i) {
            leftStr += word.charAt(i);
            rightStr = word.substring(i + 1);

            if (nodeList.check(leftStr) && (nodeList.check(rightStr) || valid(rightStr)))
                return true;
        }

        return false;
    }
}
