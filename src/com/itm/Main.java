package com.itm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * DCCLXXXIX = 789
         * MMCDXXI = 2421
         * CCXLVI = 246
         * CCVII = 207
         * XXXIX = 39
         * CLX = 160
         */
        Scanner scanner = new Scanner(System.in);

        String romanNumber = "";

        System.out.println("////////////////////////////////\n");

        while (romanNumber != "exit") {
            System.out.println("Ingrese un número romano: ");
            romanNumber = scanner.nextLine();

            Context context = new Context(romanNumber);

            ArrayList<Expression> expressions = new ArrayList<>();
            expressions.add(new ThousandExpression());
            expressions.add(new HundredExpression());
            expressions.add(new TenExpression());
            expressions.add(new UnitExpression());

            Iterator<Expression> iterator = expressions.iterator();
            while (iterator.hasNext()) {
                Expression expression = iterator.next();
                expression.interpret(context);
            }

            String output = String.format("Número arábigo: %s\n", context.output);

            System.out.println(output);
            System.out.println("////////////////////////////////\n");
        }
    }
}