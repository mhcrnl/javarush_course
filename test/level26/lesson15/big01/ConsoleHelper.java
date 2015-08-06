package com.javarush.test.level26.lesson15.big01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper
{
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static String readString() throws IOException {
        return reader.readLine();
    }
    public static String askCurrencyCode() throws IOException {
        System.out.println("Введите код валюты");
        String currenccyCode = reader.readLine();
        while (currenccyCode.length()!=3) {
            System.out.println("Введите правильный код валюты");
            currenccyCode = reader.readLine();
        }
        return currenccyCode.toUpperCase();
    }
    public static String[] getValidTwoDigits(String currencyCode) throws IOException {
        System.out.println("Введите через пробел две цифры: номинал банкноты и количество");
        String twoDigits = reader.readLine();
        return twoDigits.split(" ");
    }
    public static Operation askOperation() {
        Operation operation=null;
        System.out.println("Пожалуйста выберите операцию");
        System.out.println("1-информация, 2-внести деньги, 3-получить деньги, 4-выход");
        while (operation==null) {
            try {
                int operationNumber = Integer.parseInt(reader.readLine());
                operation = Operation.getAllowableOperationByOrdinal(operationNumber);
            }
            catch (IllegalArgumentException  e) {
                System.out.println("Введите правильный код операции");
                operation = null;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        return operation;
    }
}
