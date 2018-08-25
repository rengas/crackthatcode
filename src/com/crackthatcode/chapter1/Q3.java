package com.crackthatcode.chapter1;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Remove duplicate characters in a string
 */
public class Q3 {

    /**
     * Brute Force Implementtion
     */
    public String brutImpl(String str){
        StringBuilder bulid = new StringBuilder(str);
        for (int i=0; i <bulid.length() ; i++) {
            for (int j=0; j <bulid.length() ; j++) {
                if(i!=j&&(bulid.charAt(i)==bulid.charAt(j))){
                    bulid.deleteCharAt(i);
                }
            }
        }
        return bulid.toString();
    }

    /**
     *Using property of Set
     */
    public String setImpl(String str){
        Set<Character> strChars = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0; i <str.length() ; i++) {
            if(strChars.add(str.charAt(i))){
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    @Test
    public void brutImplTest(){
        String str= "AAA";
        assertEquals("A",brutImpl(str));

        String str2 ="ABCD";
        assertEquals("ABCD",brutImpl(str2));

    }

    @Test
    public void setImplTest(){
        String str= "AAA";
        assertEquals("A",setImpl(str));

        String str2 ="ABCD";
        assertEquals("ABCD",setImpl(str2));

    }


}
