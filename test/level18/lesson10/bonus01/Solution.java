package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        FileOutputStream fos;
        String typeCommand = args[0];
        String fileName = args[1];
        String fileOutputName = args[2];
        byte key=-10;
        try {
            if (typeCommand.equals("-e")) {
                fis = new FileInputStream(fileName);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                for (int i=0; i<buffer.length; i++) {
                    buffer[i]=(byte)(buffer[i]+key);
                }
                fos=new FileOutputStream(fileOutputName);
                fos.write(buffer);
                fis.close();
                fos.close();
            }
            else if (typeCommand.equals("-d")) {
                fis = new FileInputStream(fileName);
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer);
                for (int i=0; i<buffer.length; i++) {
                    buffer[i]=(byte)(buffer[i]-key);
                }
                fos=new FileOutputStream(fileOutputName);
                fos.write(buffer);
                fis.close();
                fos.close();
            }
            else {
                throw new Exception("Неизвестная команда");
            }
        }
        catch (Exception e) {
            e.getMessage();
        }

    }


}
