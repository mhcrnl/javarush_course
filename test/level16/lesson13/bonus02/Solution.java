package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }
    public static class Thread1 extends Thread {
        @Override
        public void run()
        {
            while (true){
                try
                {
                    Thread.sleep(1000);
                    System.out.println("Вечная нить");
                }
                catch (Exception e) {
                }
            }
        }
    }
    public static class Thread2 extends Thread {
        @Override
        public void run()
        {
            try {
                while (!isInterrupted()) {
                }
                throw new InterruptedException();
            }
            catch (InterruptedException e) {
                System.out.print("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread {
        @Override
        public void run()
        {
            try {
                while (true) {
                    System.out.print("Ура!");
                    Thread.sleep(500);
                }
            }
            catch (InterruptedException e){
            }
        }
    }
    public static class Thread4 extends Thread implements Message {
        @Override
        public void run()
        {
            while (!isInterrupted()){
            }
        }
        public void showWarning() {
            this.interrupt();
            try
            {
                this.join();
            }
            catch (Exception e){}
        }
    }
    public static class Thread5 extends Thread {
        @Override
        public void run() {
            int result=0;
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                while (!isInterrupted()){
                    String read = reader.readLine();
                    if (read.equals("N")) this.interrupt();
                    else {
                        result += Integer.parseInt(read);
                    }
                }
                throw new InterruptedException();
            }
            catch (IOException e){}
            catch (InterruptedException e)
            {
                System.out.println(result);
            }
        }
    }
}
