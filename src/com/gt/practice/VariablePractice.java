package com.gt.practice;

public class VariablePractice{
    static int bangladesh=432;
    public static void main(String[] args) {
        //varPractice();
        //parameterPracticeA(98);
        //parameterPracticeA(76);
        //add (34,23,87);
       // add(28,37,98);
        //System.out.println(hiString());
        //System.out.println(divPractice(21,22));
        concatPrac();
    }
        //variable Practice
        public static void varPractice(){
        int pakistan=371;
        int india= 325;
        int british=(pakistan+india+bangladesh);
            System.out.println(british);

    }
    //parameter practice
    public static void parameterPracticeA(int para){
        int a=20;
        int b=45;
        int f=para-(a+b);
        System.out.println(f);
    }
    public static void add (int x, int y, int z) {
        int addition = (x*y)-z;
        System.out.println(addition);
    }
    public static String hiString(){
        String firstString="123"+bangladesh;
        return firstString;
    }
    public static int divPractice(int firstNum, int secondNum){
        int div=bangladesh/(firstNum+secondNum);
        return div;
    }
    public static void concatPrac(){
        String s="47";
        String t="is an integer";
        String u=s+t;
        System.out.println(u);
        String v=t+s;
        System.out.println(v);

    }
}
