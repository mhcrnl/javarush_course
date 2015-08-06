package com.javarush.test.level26.lesson15.big01;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CurrencyManipulatorFactory
{
    static Map<String, CurrencyManipulator> manipulatorMap = new HashMap<>();

    public static CurrencyManipulator getManipulatorByCurrencyCode(String currencyCode){
        CurrencyManipulator manipulator = null;

        if (manipulatorMap.size()==0) {
            manipulator = new CurrencyManipulator(currencyCode);
            manipulatorMap.put(currencyCode, manipulator);
        }
        else {
            for (Map.Entry<String, CurrencyManipulator> pair: manipulatorMap.entrySet()) {
                if (pair.getKey().equals(currencyCode)) manipulator = pair.getValue();
            }
        }

        if (manipulator==null) {
            manipulator = new CurrencyManipulator(currencyCode);
            manipulatorMap.put(currencyCode, manipulator);

        }

        return manipulator;
    }

    private CurrencyManipulatorFactory()
    {
    }
}
