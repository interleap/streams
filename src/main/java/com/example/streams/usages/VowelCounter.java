package com.example.streams.usages;

import com.example.streams.InputStream;

public class VowelCounter {
    public int countVowels(InputStream stream){
        int count = 0;
        while(stream.hasNext()){
            char character = stream.read();
            if("aeiou".contains(character+"")) count++;
        }
        return count;
    }
}
