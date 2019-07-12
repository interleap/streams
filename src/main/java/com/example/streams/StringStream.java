package com.example.streams;

public class StringStream implements InputStream {
    @Override
    public char read() {
        return 0;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

}
