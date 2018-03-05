package com.yolkin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 24.01.2018.
 */
public class Series {

    public static int nSum(int n) {
        int s = 0;
        for (int i = 0; i <=n; i++){
            s += i;
        }
        return s;
    }

    public static int factorial(int n) {
        int s = 1;
        for (int i = 1; i <=n; i++){
            s *= i;
        }
        return s;
    }

    public static int fibonacci(int n) {
        int s = 1;
        int l = 0;
        int r = 1;
        if (n != 0) {
            for (int i = 1; i <n; i++) {
                s = l + r;
                l = r;
                r = s;
            }
        } else { s = 0;}
        return s;
    }



}
