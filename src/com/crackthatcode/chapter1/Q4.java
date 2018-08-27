package com.crackthatcode.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
=
/**
 * Check a method anagram or not.
 */
public class Q4 {

    public boolean stringContainsImpl(String str1, String str2){

        boolean flag= false;
        if(str1.length()==str2.length()&&str1.contains(str2)) {
            flag=true;
        }
        return flag;
    }

    @Test
    public void stringContainsImplTest(){
        //positive case
        String str1= "AAB";
        String str2 = "BAA";

        assertFalse(stringContainsImpl(str1,str2));

        // Test for false
        String str3= "Reverse";
        String str4= "esreveL";
        assertFalse(stringContainsImpl(str3,str4));

        // Test for Length
        String str5= "Reverse";
        String str6= "esrevellR";
        assertFalse(stringContainsImpl(str5,str6));

    }

}
