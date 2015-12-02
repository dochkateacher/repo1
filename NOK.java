package com.clouway.intro.mathdemo;

import java.util.Scanner;

/**
 * Created by clouway on 15-10-5.
 */
public class NOK {

    public int nok(int a, int b) {
        return a * (b / nod(a, b));
    }

    public int nod(int a, int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;

                return b;
            }
        }
        return a;
    }

}
