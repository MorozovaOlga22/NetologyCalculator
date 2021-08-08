package org.example;

public class Main {
    public static void main(String[] args) {
        final Calculator calc = Calculator.instance.get();

        testBinaryOperations(calc);
        testUnaryOperations(calc);
        testPredicateOperations(calc);
    }

    private static void testBinaryOperations(Calculator calc) {
        System.out.println("BinaryOperator");

        final int a = calc.plus.apply(1, 2);
        calc.println.accept(a);

        final int b = calc.minus.apply(1, 1);
        calc.println.accept(b);

        final int c = calc.divide.apply(a, b);
        calc.println.accept(c);

        final int c1 = calc.divide.apply(6, 2);
        calc.println.accept(c1);

        final int d = calc.multiply.apply(2, 3);
        calc.println.accept(d);
    }

    private static void testUnaryOperations(Calculator calc) {
        System.out.println("UnaryOperator");

        final int pow = calc.pow.apply(2);
        calc.println.accept(pow);

        final int abs1 = calc.abs.apply(2);
        calc.println.accept(abs1);

        final int abs2 = calc.abs.apply(-2);
        calc.println.accept(abs2);

        final int abs3 = calc.abs.apply(0);
        calc.println.accept(abs3);
    }

    private static void testPredicateOperations(Calculator calc) {
        System.out.println("Predicate");

        System.out.println(calc.isPositive.test(-1));
        System.out.println(calc.isPositive.test(1));
    }
}
