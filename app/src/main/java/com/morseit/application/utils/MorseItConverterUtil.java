package com.morseit.application.utils;

import com.morseit.application.data.MorseItStaticLibrary;

import org.apache.commons.lang3.StringUtils;

public class MorseItConverterUtil {



    public static String getMorseEncodedValuesForString(String input){
        StringBuilder resultBuilder =  new StringBuilder();
       char[] allChars =  input.toCharArray();
       for(char inputChar : allChars){
          resultBuilder.append(MorseItStaticLibrary.getMorseCodeForCharacter(inputChar));
          resultBuilder.append(" ");
       }
        return resultBuilder.toString();
    }
}
