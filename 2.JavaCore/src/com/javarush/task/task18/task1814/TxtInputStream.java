package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {
    public static String filename;

    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException, IOException {
        super(fileName);
        if (!fileName.matches(".*(\\.txt)$")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedFileNameException, IOException{
        new TxtInputStream("C:/1.txt");
        new TxtInputStream("C:/1.txt.pac");
    }
}

