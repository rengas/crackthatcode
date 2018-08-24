package com.crackthatcode.chapter1;

import org.junit.Test;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Reverse a c-style string
 */
public class Q2 {
    /**
     * Character array Implementation
     */
    public static String reverseStringArrImpl(String str){
        char[] chararr = str.toCharArray();
        String newStr = "";
        for (int i=chararr.length-2;i>-1;i--) {
            newStr=newStr+chararr[i];
        }
        return newStr;
    }

    /**
     * Stack Implementation
     */
    public static String reverseStringStackImpl(String str){
        Stack<String> stringStack = new Stack<>();
        //Push it to a stack at the end it
        String newStr ="";
        for(int i=0;i<str.length()-1;i++){
            stringStack.push(""+str.charAt(i));
        }

        while(!stringStack.isEmpty()){
            newStr=newStr+stringStack.pop();
        }
        return newStr;
    }

    /**
     * Convert String to chararray and swap at each step
     */
    public static String swapCharImpl(String str){
        String newStr =str.substring(0,str.length()-1);
        int start=0;
        int end=newStr.length()-1;
        int count=newStr.length()/2;
        char[] charStr = newStr.toCharArray();
        char temp;
        while(count!=0){
            temp=charStr[start];
            charStr[start]=charStr[end];
            charStr[end]=temp;
            start++;
            end--;
            count--;
        }
        return String.valueOf(charStr);
    }

    @Test
    public void testreverseStringArr(){
        String str = "mystring\n";
        assertEquals("gnirtsym",reverseStringArrImpl(str));
    }

    @Test
    public void testreverseStringStack(){
        String str = "mystring\n";
        assertEquals("gnirtsym",reverseStringStackImpl(str));
    }

    @Test
    public void testSwapChar(){
        String str = "mystrin\n";
        assertEquals("nirtsym",swapCharImpl(str));
    }

}

