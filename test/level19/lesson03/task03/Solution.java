package com.javarush.test.level19.lesson03.task03;

/* Адаптация нескольких интерфейсов
Адаптировать IncomeData к Customer и Contact.
Классом-адаптером является IncomeDataAdapter.
Инициализируйте countries перед началом выполнения программы. Соответствие кода страны и названия:
UA Ukraine
RU Russia
CA Canada
Дополнить телефонный номер нулями до 10 цифр при необходимости
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData incomeData;
        public IncomeDataAdapter(IncomeData data) {
            incomeData=data;
        }

        @Override
        public String getName()
        {
            return incomeData.getContactLastName()+", "+incomeData.getContactFirstName();
        }

        @Override
        public String getPhoneNumber()
        {
            String tempPhoneNumber = String.valueOf(incomeData.getPhoneNumber());

            if (tempPhoneNumber.length() < 10)
            {
                String nulls = "";
                for (int i = 0; i < (10 - tempPhoneNumber.length()); i++)
                {
                    nulls += "0";
                }
                tempPhoneNumber = nulls + tempPhoneNumber;
            }
            return "+" + incomeData.getCountryPhoneCode() + "(" + tempPhoneNumber.substring(0, 3) + ")" +
                    tempPhoneNumber.substring(3, 6) + "-" + tempPhoneNumber.substring(6, 8) + "-" + tempPhoneNumber.substring(8);
        }

        @Override
        public String getCompanyName()
        {
            return incomeData.getCompany();
        }

        @Override
        public String getCountryName()
        {
            String coutryName = "";
            for (Map.Entry<String, String> pair: countries.entrySet()) {
                if (incomeData.getCountryCode().equals(pair.getKey())) {
                    coutryName = pair.getValue();
                }
            }
            return coutryName;
        }
    }

    public static interface IncomeData {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        int getCountryPhoneCode();      //example 38
        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}