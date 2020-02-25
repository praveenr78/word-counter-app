package com.assign.word.word;

import java.util.Optional;

/**
 *
 */

public class Counter {

    private final BST bst;
    private final Translator translator;
    private final Validator validator;


    /**
     * @param bst
     */
    public Counter(final BST bst, final Translator translator, final Validator validator) {
        this.bst = bst;
        this.translator = translator;
        this.validator = validator;
    }

    /**
     * @param word
     * @throws Exception
     */
    public void addWord(final String word) throws ValidationException {
        validator.validate(word);
        bst.add(translator.translate(word));
    }

    /**
     * @param word
     * @return
     */
    public long getCount(final String word) {
        Optional<Node> wordNode = Optional.ofNullable(bst.searchByWord(word));
        return wordNode.isPresent() ? wordNode.get().getCount() : 0;
    }

}
