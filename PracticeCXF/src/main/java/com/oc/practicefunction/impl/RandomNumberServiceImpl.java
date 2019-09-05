package com.oc.practicefunction.impl;

import com.oc.practicefunction.RandomNumberService;

public class RandomNumberServiceImpl implements RandomNumberService {
    @Override
    public int getARandomNumber() {
        double doubleNumber = Math.random() * 100;
        long longNumber = Math.round(doubleNumber);
        int intNumber = (int) longNumber;
        return intNumber;
    }
}
