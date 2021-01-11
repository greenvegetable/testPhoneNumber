package com.demo;

import java.util.ArrayList;
import java.util.List;

public class PhoneCombination {


    public static List<String> phoneNumberCombinations(Integer[] numberStrArr) {

        //adjust whether the char in numberStrArr is int .
        StringBuffer tmpStr = new StringBuffer();
        for (int i = 0; i < numberStrArr.length; i++) {
            tmpStr.append(numberStrArr[i]);

        }
       String numbers= tmpStr.toString();


        List<String> list = new ArrayList<String>();
        if (numbers.length() == 0) {
            return list;
        }
        backtracking("", numbers, 0, list);//回溯


        for (String s : list) {
            System.out.print(s + "   ");
        }

        return list;
    }

    /*
     *core code:nested call  method
     */
    public static void backtracking(String s, String digits, int flag, List<String> list) {
        String[] strings = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (flag >= digits.length()) {
            list.add(s);//add the results to the list
            return;
        }

        String chars = strings[digits.charAt(flag) - '0'];
        for (int i = 0; i < chars.length(); i++) {//traverse all  chars corresponding to the number:2-->"abc",3-->"def"

            backtracking(s + chars.charAt(i), digits, flag + 1, list);
        }
    }

   /* public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        //For Example,input :{2,3},output :"ad   ae   af   bd   be   bf   cd   ce   cf"
        Integer[] numberStr = {2, 3};
//        For Example,input :{9},output :"w x y z"
//        Integer[] numberStr = {9};
        //adjust whether the char in numberStr is int .
      *//*  StringBuffer tmpStr = new StringBuffer();
        for (int i = 0; i < numberStr.length; i++) {
            tmpStr.append(numberStr[i]);

        }
*//*
        phoneNumberCombinations(numberStr);

//adjust whether the integer is from 0-99
        int numInt=45;
        String numStr =String.valueOf(numInt);
        String patternStr="^([1-9]\\d|\\d)$";
        //创建Pattern对象
             Pattern p= Pattern.compile(patternStr);
        boolean isIntergerStr=p.matcher(numStr).matches();
        System.out.println("isIntergerStr: "+isIntergerStr);

    }*/
}