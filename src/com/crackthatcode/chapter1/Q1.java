package com.crackthatcode.chapter1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Find unique characters in String
 */
public class Q1 {

    public static void main(String[] args) {

    }
    /**
     * Implemention using HashMap
     * @param str string to test
     * @return unique or not
     */
    public  boolean hashMapImpl(String str){
        HashMap<String,Integer> charCount = new HashMap<>();

        boolean flag =true;
        for(int i=0; i<str.length();i++){
            String getChar =str.charAt(i)+"";

           if(charCount.get(getChar)==null){
               charCount.put(getChar,1);
           }else if(charCount.get(getChar)!=null&&charCount.get(getChar)>1){
               flag=false;
           }else{
               charCount.put(getChar,charCount.get(getChar)+1);
           }
        }
        return flag;
    }

    /**
     * Implemention using Set
     * @param str string to test
     * @return unique or not
     */
    public boolean setImpl(String str){

        Set<String> chars = new HashSet<>();
        for (int i=0; i<str.length();i++){
            chars.add(str.charAt(i)+"");
        }
        return (chars.size()==str.length());
    }

    /**
     * Brut Force method
     */

    public boolean brutImpl(String str){
        boolean flag=true;
        for(int i=0; i<str.length();i++){
            for (int j=0;j<str.length();j++){
                if(i!=j&&str.charAt(i)==str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        return flag;
    }

   @Test
    public void testUniqueCharsHashMap(){
        Q1 q1 = new Q1();
        String noUnique = "tttwwww";
        String uniQue1 ="Test123";
        String uniQue2 ="est123";
        assertFalse(q1.hashMapImpl(noUnique));
        assertTrue(q1.hashMapImpl(uniQue1));
        assertTrue(q1.hashMapImpl(uniQue2));

    }

    @Test
    public  void testUniqueCharsSet(){
        Q1 q1 = new Q1();
        String noUnique = "tttwwww";
        String uniQue1 ="Test123";
        String uniQue2 ="est123";

        assertFalse(q1.setImpl(noUnique));
        assertTrue(q1.hashMapImpl(uniQue1));
        assertTrue(q1.hashMapImpl(uniQue2));

    }

    @Test
    public void testUniqueCharsBrutForce(){
        Q1 q1 = new Q1();
        String noUnique = "tttwwww";
        String uniQue1 ="Test123";
        String uniQue2 ="est123";

        assertFalse(q1.brutImpl(noUnique));
        assertTrue(q1.brutImpl(uniQue1));
        assertTrue(q1.brutImpl(uniQue2));
    }

}
