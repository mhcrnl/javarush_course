package com.javarush.test.level18.lesson08.task04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* UnsupportedFileName
Измените класс TxtInputStream так, чтобы он работал только с txt-файлами (*.txt)
Например, first.txt или name.1.part3.txt
Если передан не txt-файл, например, file.txt.exe, то конструктор должен выбрасывать исключение UnsupportedFileNameException
*/

public class TxtInputStream extends FileInputStream {
    private FileInputStream original;

    public TxtInputStream(String fileName) throws FileNotFoundException, UnsupportedFileNameException {
        super(fileName);
        String extension = fileName.substring(fileName.lastIndexOf("."));
        if (extension.equals(".txt")) {
            this.original = new FileInputStream(fileName);
        }
        else {throw  new UnsupportedFileNameException();}
    }


}

