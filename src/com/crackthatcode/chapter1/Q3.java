package com.crackthatcode.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Remove duplicate characters in a string
 */
public class Q3 {

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

    @Test
    public void brutImplTest(){
        String str= "AAA";
        assertEquals("A",brutImpl(str));

        String str2 ="ABCD";
        assertEquals("ABCD",brutImpl(str2));

    }

}
