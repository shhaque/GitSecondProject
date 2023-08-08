package com.gt.practice;

public class VariableAndParametersPractice {
    static int varPrac =75;

    public static void main(String[] args) {
      //  variablePractice();
        //parameterPractice(67);
        //add(56,43,19,17,34,23);
        //System.out.println(divisionPractice(256,4));
       // System.out.println(helloString());
        concatenationPractice();
    }

    //variable practice
    public static void variablePractice() {
    int firstVar=45;
    int secondVar=38;
    //int finalVar=varPrac-(firstVar+secondVar);
        int finalVar=varPrac+(firstVar*secondVar);
        System.out.println(finalVar);
    }

    //Parameters practice
    public static void parameterPractice(int myParameter) {
        int firstParameter=88;
        int secondParameter=125;
        int finalParameter=firstParameter+secondParameter-myParameter;
        System.out.println(finalParameter);
    }
    public static void add(int a, int b, int c, int d,int e, int f){
        int sum= (a*b)-(c+d+e+f);
        System.out.println(sum);
    }
    //types of methods
    //void
    //return type
    public static int divisionPractice(int one,int two){
        int division= one/two;
                return division;
    }
    public static String helloString() {
        String myString="253";
        return myString;
    }
    //concatenation = adding two strings
    public static void concatenationPractice(){
        String firstString="integer";
        String secondString="34";
        String concatString=firstString+secondString;
        System.out.println(concatString);
        System.out.println(34+firstString);
    }
}
