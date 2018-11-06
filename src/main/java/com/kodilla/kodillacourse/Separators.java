package com.kodilla.kodillacourse;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Separators {
    private char character;
    private Character[] separators = {' ', ',', '.'};

    public boolean checkSeparator(Character character) {
        return Arrays.asList(separators).contains(character);
    }

    public Character getFirstSeparator() {
        return separators[0];
    }
}
