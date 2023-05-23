package ru.math.mathematics;

/**
 * Класс, содержащий методы для выполнения математических операций (+, -, *, /).
 */
public class  Mathematics {

    /**
     * Метод, выполняющий сложение двух чисел.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return Результат сложения a и b.
     */
    public static double add(int a, int b) {
        return a + b;
    }

    /**
     * Метод, выполняющий вычитание двух чисел.
     *
     * @param a Уменьшаемое.
     * @param b Вычитаемое.
     * @return Результат вычитания b из a.
     */
    public static double subtract(int a, int b) {
        return a - b;
    }

    /**
     * Метод, выполняющий умножение двух чисел.
     *
     * @param a Первый множитель.
     * @param b Второй множитель.
     * @return Результат умножения a на b.
     */
    public static double multiply(int a, int b) {
        return a * b;
    }

    /**
     * Метод, выполняющий деление двух чисел.
     *
     * @param a Делимое.
     * @param b Делитель.
     * @return Результат деления a на b.
     * @throws ArithmeticException Если делитель b равен нулю.
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно!");
        }
        return (double) a / b;
    }
}
