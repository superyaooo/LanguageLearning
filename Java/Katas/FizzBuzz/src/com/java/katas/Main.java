package com.java.katas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(27));
    }

    public static List<String> fizzBuzz(int n){
        List<String> numList = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%15==0){
                numList.add("FizzBuzz");
            }
            else if(i%3==0){
                numList.add("Fizz");
            }
            else if(i%5==0){
                numList.add("Buzz");
            }
            else{
                numList.add(Integer.toString(i));
            }
        }

        return numList;
    }
}
