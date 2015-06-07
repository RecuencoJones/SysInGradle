package com.gradle.test.sys.in;

import java.util.Scanner;

/**
 * Created by david on 07/06/2015.
 */
public class Reader {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Input? ");
        String line = s.nextLine();
        System.out.println("Output: "+line);
    }
}
