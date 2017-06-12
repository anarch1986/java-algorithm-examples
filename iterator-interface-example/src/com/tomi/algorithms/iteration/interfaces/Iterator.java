package com.tomi.algorithms.iteration.interfaces;

import com.tomi.algorithms.iteration.IteratorOutOfBoundsException;

/**
 * Created by tomi on 2017.06.12..
 */
public interface Iterator {

    void first();

    void last();

    boolean isDone();

    void next();

    void previous();

    Object current() throws IteratorOutOfBoundsException;

}
