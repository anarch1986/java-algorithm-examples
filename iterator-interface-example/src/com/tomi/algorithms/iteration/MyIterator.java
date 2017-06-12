package com.tomi.algorithms.iteration;

/**
 * Created by tomi on 2017.06.12..
 */
public interface MyIterator {

    void first();

    void last();

    boolean isDone();

    void next();

    void previous();

    Object current() throws MyIteratorOutOfBoundsException;

}
