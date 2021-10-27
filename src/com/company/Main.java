package com.company;

public class Main {


    public static void main(String[] args) {
        int[] newArray = {5, 3, 7, 6, 2, 8};
        ForMethod(newArray);
        ForEach(newArray);
        WhileMethod(newArray);
        DoWhileMethod(newArray);
    }

    static void ForMethod(int[] newArray) {
        for (int i = 0; i < newArray.length; i++)
            System.out.println(newArray[i]);
    }


    public static void ForEach(int[] newArray) {
        for (int tempVar : newArray) {
            System.out.println(tempVar);


        }
    }

    public static void WhileMethod(int[] newArray) {


        int i = 0;
        while (i < newArray.length) {
            System.out.println(newArray[i]);
            i++;

        }
    }

    public static void DoWhileMethod(int[] newArray) {
        int i = 0;
        do {
            System.out.println(newArray[i]);
            i++;


        } while (i < newArray.length);
    }
}

