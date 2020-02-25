package com.assign.word;


import com.assign.word.word.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class TestCounter {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @InjectMocks
    private Counter counter;

    @Spy
    private BST bst;

    @Spy
    private Translator translator;

    @Spy
    private Validator validator;

    @Before
    public void setUp() {
        counter = new Counter(bst,translator,validator);
    }

    @Test
    public void testAddWordNullThrowsException() {
        exceptionRule.expect(ValidationException.class);
        counter.addWord(null);

    }


    @Test
    public void testAddWordAsEmptyThrowsException() {
        exceptionRule.expect(ValidationException.class);
        counter.addWord("");

    }

    @Test
    public void testAddNonAlphabeticThrowsException() {
        exceptionRule.expect(ValidationException.class);
        counter.addWord("Hello123");

    }


    @Test
    public void testWhenNoWordAddedReturnsZeroCount() {
        long count = counter.getCount("hello");
        assertEquals(0, count);
    }

    @Test
    public void testAddRepeatedWordReturnsCount() {
        for (int i = 0; i < 100; i++)
            counter.addWord("word");

        long count = counter.getCount("word");
        assertEquals(100, count);
    }

    @Test
    public void testAddMultipleRepeatedWordReturnsExactCount(){

        for (int i = 0; i < 100; i++)
            counter.addWord("apple");

        for (int i = 0; i < 200; i++)
            counter.addWord("orange");

        for (int i = 0; i < 300; i++)
            counter.addWord("kiwi");

        long countOne = counter.getCount("apple");
        long countTwo = counter.getCount("orange");
        long countThree = counter.getCount("kiwi");


        assertEquals(100, countOne);
        assertEquals(200, countTwo);
        assertEquals(300, countThree);

    }

    @After
    public void tearDown() {
        counter = null;
    }
}