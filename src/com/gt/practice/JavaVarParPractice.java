package com.gt.practice;

public class JavaVarParPractice {
    static int ab = 34;

    public static void main(String[] args) {
        varPrac();
        parPrac(67);
        parPrac(78);
        parPrac(56);
        add(3, 5, 7, 9);
        add(11, 45, 34, 987);
        System.out.println(divPrac(5,8));
        System.out.println(apple());
        conctprac();

    }

    //variable practice
    public static void varPrac() {
        int bc = 87;
        int cd = 76;
        int abcd = ab * bc - cd;
        System.out.println(abcd);

    }

    //parameter practice
    public static void parPrac(int z) {
        int xy = 89;
        int yz = 45;
        int zz = z + xy - yz;
        System.out.println(zz);
    }

    //add parameter practice
    public static void add(int s, int t, int u, int v) {
        int w = (s + t) * u - v;
        System.out.println(w);
    }

    //division Practice
    public static int divPrac(int q, int r) {
        int s=ab/(q+r);
        return s;

    }
    //string practice
    public static String apple(){
        String mac=ab+"786";
        return mac;

    }
    //concatenation practice;
    public static void conctprac(){
        String g="1971";
        String h="Bangladesh";
        String i=g+h;
        System.out.println(i);
        String j=h+g;
        System.out.println(j);

    }

}
