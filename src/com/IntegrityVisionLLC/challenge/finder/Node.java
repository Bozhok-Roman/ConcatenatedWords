package com.IntegrityVisionLLC.challenge.finder;

public class Node {
    public Node children[] = new Node[26];
    public boolean isWord;

    public Node() {
        this.isWord = false;
    }
}
