package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            if (fileName.equals("exit")) break;
            else {
                ReadThread thread = new ReadThread(fileName);
                thread.start();
            }
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        @Override
        public void run()
        {
            try {
                FileInputStream fis = new FileInputStream(this.fileName);
                byte[] buffer = new byte[fis.available()];
                while (fis.available()>0) {
                    fis.read(buffer);
                }

                int[] countMyBytes = new int[127];
                for (int i=0; i<buffer.length; i++) {
                    countMyBytes[buffer[i]]+=1;
                }

                int maxCountByte = countMyBytes[0];
                for (int j=0; j<countMyBytes.length; j++) {
                    if (countMyBytes[j]>maxCountByte) {
                        maxCountByte = countMyBytes[j];
                    }
                }

                for (int k=0; k<countMyBytes.length; k++) {
                    if (countMyBytes[k]==maxCountByte) {
                        synchronized (resultMap) {
                            resultMap.put(this.fileName, k);
                        }
                    }
                }

                fis.close();

            }
            catch (FileNotFoundException e) {

            }
            catch (IOException e) {

            }
        }

        // implement file reading here - реализуйте чтение из файла тут
    }
}
