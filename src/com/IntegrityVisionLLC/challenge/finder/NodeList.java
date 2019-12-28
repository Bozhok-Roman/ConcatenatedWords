package com.IntegrityVisionLLC.challenge.finder;

public class NodeList {
    private Node node;

    public NodeList() {
        node = new Node();
    }

    public void insert(final String word) {
        Node root = node;

        for (int i = 0; i < word.length(); ++i) {
            int index = word.charAt(i) - 'a';
            if (root.children[index] == null) root.children[index] = new Node();
            root = root.children[index];
        }
        root.isWord = true;
    }

    public boolean check(final String word) {
        Node root = node;

        for (int i = 0; i < word.length(); ++i) {
            int index = word.charAt(i) - 'a';
            if (root.children[index] == null)
                return false;
            root = root.children[index];
        }

        return root.isWord;
    }
}
