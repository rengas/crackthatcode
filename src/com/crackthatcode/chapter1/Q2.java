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

    @Test
    public void testreverseStringArr(){
        Q2 q2 = new Q2();
        String str = "mystring\n";
        assertEquals("gnirtsym",q2.reverseStringArrImpl(str));
    }

    @Test
    public void testreverseStringStack(){
        Q2 q2 = new Q2();
        String str = "mystring\n";
        assertEquals("gnirtsym",q2.reverseStringStackImpl(str));
    }

}

