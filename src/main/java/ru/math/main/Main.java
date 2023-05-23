package ru.math.main;

import ru.math.formatted.Decorator;
import ru.math.mathematics.Mathematics;

public class Main {
    public static void main(String[] args) {
        Decorator.consoleDecorate(Mathematics.divide(11,5));
        Decorator.consoleDecorate(Mathematics.add(15,5));
        Decorator.consoleDecorate(Mathematics.multiply(11,11));
        Decorator.consoleDecorate(Mathematics.subtract(11,5));
        Decorator.consoleDecorate(Mathematics.add(-1,1));
    }
}