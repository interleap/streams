package com.example.streams.usages;

import com.example.streams.Stream;

public class ParagraphWriter {

    private final Stream stream;

    public ParagraphWriter(Stream stream){

        this.stream = stream;
    }
    public void write(String string){
        for (int i = 0; i < string.length(); i++) {
             stream.write(string.charAt(i));
        }
    }

}
