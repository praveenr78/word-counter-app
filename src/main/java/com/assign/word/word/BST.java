package com.assign.word.word;

/**
 * Binary search tree with node holding word and its count.
 */
public class BST {

    /**
     * Root node
     **/
    private Node root;

    /**
     * Add word.
     *
     * @param word
     */
    public void add(final String word) {
        root = addRecursive(root, word);
    }

    /**
     * @param current
     * @param word
     * @return
     */
    private Node addRecursive(final Node current, final String word) {

        if (current == null) {
            return new Node(word);
        }

        int code = word.compareTo(current.getWord());

        if (code == 0) {
            current.incrementCount();
        } else if (code < 0) {
            current.addLeftNode(addRecursive(current.getLeftNode(), word));
        } else if (code > 0) {
            current.addRightNode(addRecursive(current.getRightNode(), word));
        }

        return current;
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        return root == null;
    }

    public Node searchByWord(final String word) {
        return searchByWord(this.root, word);
    }

    /**
     * @param current
     * @param word
     * @return
     */
    private Node searchByWord(final Node current, final String word) {

        if (current == null) {
            return current;
        }

        int code = word.compareTo(current.getWord());

        if (code == 0) {
            return current;
        }

        return code < 0
                ? searchByWord(current.getLeftNode(), word)
                : searchByWord(current.getRightNode(), word);
    }


}
