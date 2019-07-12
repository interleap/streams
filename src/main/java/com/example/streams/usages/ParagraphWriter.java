package com.example.streams.usages;

import com.example.streams.OutputStream;

public class ParagraphWriter {

    private final OutputStream outputStream;

    public ParagraphWriter(OutputStream outputStream){

        this.outputStream = outputStream;
    }
    public void write(String string){
        for (int i = 0; i < string.length(); i++) {
             outputStream.write(string.charAt(i));
        }
    }

}
