package com.kodilla.kodillacourse;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileInput {

    public String loadFile(String path) throws java.io.FileNotFoundException, java.io.IOException {
        try {
            String result = "";
            Reader reader = new FileReader(path);
            int charsNo = reader.read();
            while ( charsNo != -1 ) {
                char charData = (char) charsNo;
                result += charData;
                charsNo = reader.read();
            }
            return result;
        } catch (FileNotFoundException ex){
            System.out.println("Plik nie istnieje.");
            return "";
        }
    }
}
