package com.assign.word.word;

/**
 *<code>Node</code> to represent a node in BST.
 */
public class Node {

    private String word;
    private long count;
    private Node leftNode;
    private Node rightNode;

    /**
     * @param word
     */
    public Node(String word) {
        this.word = word;
        this.count = 1;
        leftNode = null;
        rightNode = null;

    }

    public String getWord() {
        return word;
    }

    public long getCount() {
        return count;
    }

    public void incrementCount() {
        ++this.count;
    }

    public void addLeftNode(final Node leftNode) {
        this.leftNode = leftNode;
    }

    public void addRightNode(final Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return this.leftNode;
    }

    public Node getRightNode() {
        return this.rightNode;
    }

}