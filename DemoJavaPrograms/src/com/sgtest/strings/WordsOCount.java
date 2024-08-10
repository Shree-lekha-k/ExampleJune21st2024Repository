package com.sgtest.strings;

public class WordsOCount {
    public static void main(String[] args){
        Word();
    }
    static void Word() {
        String str = "Bangalore and Mysore";
        String[] word = str.split(" ");
        String s = " ";
        for (int i = word.length - 1; i >= 0; i--) {
            s = s + word[i]+" ";
            if (i >= 0) {
                s = s + " ";
            }
        }

        System.out.println(s+" ");
        System.out.println(word.length);
    }
}
