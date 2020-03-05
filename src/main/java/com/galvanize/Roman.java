package com.galvanize;

import java.math.BigDecimal;

public class Roman {

    public BigDecimal convert(String roman){
        switch(roman) {
            case "I":
                return BigDecimal.valueOf(1);
            case "V":
               return BigDecimal.valueOf(5);
            case "X":
                return BigDecimal.valueOf(10);
            case "L":
                return BigDecimal.valueOf(50);
            case "C":
                return BigDecimal.valueOf(100);
            case "D":
                return BigDecimal.valueOf(500);
            case "M":
                return BigDecimal.valueOf(1000);
            default:
                return null;
        }
    }

    public BigDecimal calculateRomanToDecimal(String actual) {

        if(actual == null){
            return BigDecimal.valueOf(0);
        }
        int length = actual.length();
        int sum = 0;
        int pre = 0;

        for(int i = length - 1; i >= 0; i--){
            BigDecimal bd = convert(Character.toString(actual.charAt(i)));
            int cur = bd.intValue();

            if(i == length - 1){
                sum = sum + cur;
            }else{
                if(cur < pre){
                    sum = sum - cur;
                }else{
                    sum = sum + cur;
                }
            }
            pre = cur;
        }
        return BigDecimal.valueOf(sum);
    }


}
