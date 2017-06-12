package com.tomi.algorithms.iteration;

/**
 * Created by tomi on 2017.06.12..
 */
public class ArrayIterator implements Iterator {
    private final Object[] _array;
    private final int _first;
    private final int _last;
    private int _current = -1;

    public ArrayIterator(Object[] array, int start, int length) {
        assert array != null : "The array can't be null";
        assert start >= 0 : "The starting position can't be zero";
        assert start < array.length : "The starting position can't be bigger" +
                "than the length of the array";
        assert length >= 0 : "The length can't be negative";
        _array = array;
        _first = start;
        _last = start + length - 1;
        assert _last < array.length : "Start + length can't be bigger than" +
                "the length of the array";

    }

    public ArrayIterator(Object[] array) {
        assert array != null : "The array can't be null";
        _array = array;
        _first = 0;
        _last = array.length - 1;
    }

    @Override
    public void first() {
        _current = _first;
    }

    @Override
    public void last() {
        _current = _last;
    }

    @Override
    public void next() {
        ++_current;
    }

    @Override
    public void previous() {
        --_current;
    }

    @Override
    public boolean isDone() {
        return _current < _first || _current > _last;
    }

    @Override
    public Object current() throws IteratorOutOfBoundsException {
        if (isDone()) {
            throw new IteratorOutOfBoundsException();
        }
        return _array[_current];
    }
}
