package com.dsimon;

public class LastDigitChecker {
    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        }
        return true;
    }

    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }

        int firstLastDigit = firstNumber % 10;
        int secondLastDigit = secondNumber % 10;
        int thirdLastDigit = thirdNumber % 10;

        if (firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit || secondLastDigit == thirdLastDigit) {
            return true;
        }
        return false;
    }
}
