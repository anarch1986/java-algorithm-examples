package com.tomi.algorithms.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by tomi on 2017.06.12..
 */
class ReverseIteratorTest {
    private static final Object[] ARRAY = new Object[]{" A", " B", "c"};

    @Test
    public void testForwardsIterationBecomesBackwards() {
        ReverseIterator iterator = new ReverseIterator(new ArrayIterator(ARRAY));
        iterator.first();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());
        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());
        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());

        iterator.next();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
        } catch (IteratorOutOfBoundsException e) {

        }
    }

    @Test
    public void testBackwardsIterationBecomesForwards() {
        ReverseIterator iterator = new ReverseIterator(new ArrayIterator(ARRAY));
        iterator.last();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());
        iterator.previous();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());
        iterator.previous();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());
        iterator.previous();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
        } catch (IteratorOutOfBoundsException e) {

        }
    }
}