package org.example;

import java.util.function.*;

public class Calculator {
    static final Supplier<Calculator> instance = Calculator::new;

    final BinaryOperator<Integer> plus = (x, y) -> x + y;
    final BinaryOperator<Integer> minus = (x, y) -> x - y;
    final BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //Старый вариант кода. Ошибка заключается в том, что не проверяется сценарий деления на 0
    //final BinaryOperator<Integer> divide = (x, y) -> x / y;
    //В текущей реализации в случае деления на 0 выводим 0. Наверно, правильнее было бы выводить ошибку
    final BinaryOperator<Integer> divide = (x, y) -> y == 0 ? 0 : x / y;

    final UnaryOperator<Integer> pow = x -> x * x;
    final UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    final Predicate<Integer> isPositive = x -> x > 0;

    final Consumer<Integer> println = System.out::println;
}
