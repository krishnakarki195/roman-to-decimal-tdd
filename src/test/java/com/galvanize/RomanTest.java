package com.galvanize;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class RomanTest {

    @Test
    public void canWeHaveRoman(){

        Roman roman = new Roman();
        assertNotNull(roman);

    }

    @Test
    public void convertRomanToOne(){
        Roman roman = new Roman();
        String actual = "I";
        BigDecimal expected = BigDecimal.valueOf(1);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToFive(){
        Roman roman = new Roman();
        String actual = "V";
        BigDecimal expected = BigDecimal.valueOf(5);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToTen(){
        Roman roman = new Roman();
        String actual = "X";
        BigDecimal expected = BigDecimal.valueOf(10);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToFifty(){
        Roman roman = new Roman();
        String actual = "L";
        BigDecimal expected = BigDecimal.valueOf(50);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToHundred(){
        Roman roman = new Roman();
        String actual = "C";
        BigDecimal expected = BigDecimal.valueOf(100);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToFiveHundred(){
        Roman roman = new Roman();
        String actual = "D";
        BigDecimal expected = BigDecimal.valueOf(500);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToThousand(){
        Roman roman = new Roman();
        String actual = "M";
        BigDecimal expected = BigDecimal.valueOf(1000);
        assertEquals(roman.convert(actual),expected);
    }

    @Test
    public void convertRomanToDecimal(){
        Roman roman = new Roman();
        String actual = "MMVI";
        BigDecimal expected = BigDecimal.valueOf(2006);
        assertEquals(roman.calculateRomanToDecimal(actual),expected);

        actual = "MCMXLIV";
        expected = BigDecimal.valueOf(1944);
        assertEquals(roman.calculateRomanToDecimal(actual),expected);

    }

}
