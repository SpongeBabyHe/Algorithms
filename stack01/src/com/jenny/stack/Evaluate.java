/*
package com.jenny.stack;

import java.util.Scanner;
import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        Stack<Double> doubleStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        while (next != null) {
            if (next.equals ("(")) {}
            else if (next. equals ("+")) {stringStack.push("+");}
            else if (next. equals ("-")) {stringStack.push("-");}
            else if (next. equals ("*")) {stringStack.push("*");}
            else if (next. equals ("/")) {stringStack.push("/");}
            else if (next. equals (")")) {
                String str = stringStack.pop();
                Double num1 = doubleStack.pop();
                Double num2 = doubleStack.pop();
                doubleStack.push(getValue(str, num1, num2));
            }else {
                doubleStack.push(Double.parseDouble(next));
            }
            next = scanner.next();
        }
        System.out.println(doubleStack.pop());
    }

    public static Double getValue(String str, Double a, Double b) {
        if (str.equals("+")) return a + b;
        if (str.equals("-")) return a - b;
        if (str.equals("*")) return a * b;
        if (str.equals("/")) return a / b;
        return 0.0;
    }

}
*/
