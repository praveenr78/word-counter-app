package com.assign.word.word;

/**
 *  Validator to validate on the word being added.
 *  For performance reasons did'nt use Regex & Optional in validations.
 */
public class Validator {


    /**
     *
     * @param s
     * @return
     */
    private static boolean isAlphabetic(String s) {
        if (s == null) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param word
     * @throws Exception
     */
    public void validate(final String word) throws ValidationException {

        if (word == null || word.isEmpty()) throw new ValidationException("Word can't be null.");

        if (!isAlphabetic(word))
            throw new ValidationException("Word to contain only alphabetic chars");
    }

}