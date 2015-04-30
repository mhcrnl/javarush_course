package com.javarush.test.level18.lesson08.task03;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream {

    private FileOutputStream original;

    public AmigoOutputStream (FileOutputStream original) throws FileNotFoundException {
        super(fileName);
        this.original = original;
    }
    public void write(int b) throws IOException {
        original.write(b);
    }
    public void write(byte[] b) throws IOException {
        original.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException {
        original.write(b, off, len);
    }

    public FileChannel getChannel(){
        return original.getChannel();
    }

    public void close() throws IOException {
        original.flush();
        String copyright = "JavaRush © 2012-2013 All rights reserved.";
        byte[] array = copyright.getBytes();
        original.write(array);
        original.close();
    }

    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
