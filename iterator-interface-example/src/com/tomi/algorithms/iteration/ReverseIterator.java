package com.tomi.algorithms.iteration;

import com.tomi.algorithms.iteration.interfaces.Iterator;

/**
 * Created by tomi on 2017.06.12..
 */
public class ReverseIterator implements Iterator {
    private final Iterator _iterator;

    public ReverseIterator(Iterator iterator) {
        assert iterator != null : "The iterator can't be null!";
        _iterator = iterator;
    }

    public boolean isDone() {
        return _iterator.isDone();
    }

    public Object current() throws IteratorOutOfBoundsException {
        return _iterator.current();
    }

    public void first() {
        _iterator.last();
    }

    public void last() {
        _iterator.first();
    }

    public void next() {
        _iterator.previous();
    }

    public void previous() {
_iterator.next();
    }
}
