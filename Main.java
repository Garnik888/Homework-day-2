import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Insert number from console
        System.out.print("Insert first number : ");
        byte num1 = in.nextByte();
        System.out.print("Insert second number : ");
        short num2 = in.nextShort();
        System.out.print("Insert third number: ");
        int num3 = in.nextInt();
        in.close();

        // 2-th exercises
        numberToTime(num3);
        // 3-th exercises
        sumOfOddEvenNumbers(num3);
        // 4-th exercises
        twoNumbersProduct(num2, num3);
        // 5-th exercises
        threeNumbersSumAverage(num1, num2, num3);
        // 6-th exercises
        areaCalculate(num2, num3);
        // 7-th exercises
        anyVariableNumberProdAverage(num1, num2, num3);
        // 8-th exercises
        System.out.println("S 15 = " + arithmeticSequence(10));
        System.out.println("S 10 = " + arithmeticSequence(15));
        //9-th exercises
        lastDigit(num3);
        // 11-th exercises
        divOfTwiNumbers(num3, num2);

        //Insert random numbers
        Random rand = new Random();
        // 12-th exercises
        for (int i = 0; i < 4; i++) {

            System.out.println("Insert random number " + (i + 1) + "  - " + rand.nextInt(100));
        }
        // 13 -th  exercises
        System.out.println("Insert random number from diapason 0 - 15 - " + rand.nextInt(15));
        // 14-th exercises
        System.out.println("Insert random number from diapason 15 - 30  - " + (rand.nextInt(30 - 15) + 15));
        // 15-th exercises
        isNumberOdd(num3);
        // 16-th exercises
        detSecondDig(num3);
        // 17-th exercises
        detFirstDig(num3);
        // 18-th exercises
        sumOfNumDig(num3);
        swapNumbers(num3, num2);

    }


    public static void numberToTime(int num) {

        int hour;
        int minutes;

        hour = num / 60;
        minutes = num % 60;

        System.out.println(hour + " Hour " + minutes + " minutes.");
    }

    public static void sumOfOddEvenNumbers(int firstNum) {

        int oddSum;
        int evenSum;

        // Check is the number even or odd
        if (firstNum % 2 == 0) {

            // if number even
            evenSum = firstNum * 4 + 4 * 3;
            oddSum = (firstNum + 1) * 4 + 4 * 3;

        } else {

            //if number odd
            oddSum = firstNum * 4 + 4 * 3;
            evenSum = (firstNum + 1) * 4 + 4 * 3;

        }

        System.out.println("The first 4 consecutive odd numbers - " + oddSum);
        System.out.println("The first 4 consecutive even numbers - " + evenSum);

    }

    public static void twoNumbersProduct(int firstNum, int secondNum) {

        System.out.println("The product of two numbers = " + firstNum * secondNum);
    }

    public static void threeNumbersSumAverage(int firsNum, int secondNum, int thirdNum) {

        int sumNumbers = firsNum + secondNum + thirdNum;
        double averageNumbers = sumNumbers / 3;

        System.out.println("The sum of three numbers = " + sumNumbers);
        System.out.println("The average of three numbers = " + averageNumbers);
    }

    public static void areaCalculate(int firstSide, int secondSid) {

        if (firstSide == secondSid) {
            System.out.println("Area of square = " + firstSide * secondSid);
        } else {
            System.out.println("Area of rectangle = " + firstSide * secondSid);
        }

        System.out.println("Area of right-angled triangle = " + firstSide * secondSid / 2);
    }

    public static void anyVariableNumberProdAverage(byte num1, short num2, int num3) {

        int product = num1 * num2 * num3;
        int sum = num1 + num2 + num3;
        double average = sum / 3;

        System.out.println("Average of any variable numbers = " + average);
        System.out.println("Average of any variable product = " + product);

    }

    public static int arithmeticSequence(int number) {

        int seq = 3 * number * number - 12 * number;

        return seq;
    }

    public static void lastDigit(int number) {

        int lastDigit = number % 10;

        System.out.printf("Last digit of %d is %d.", number, lastDigit);
    }

    public static void divOfTwiNumbers(int firstNum, int secondNum) {

        int div = firstNum % secondNum;

        System.out.println("The remainder from  a to b = " + div);
    }

    public static void isNumberOdd(int number) {

        System.out.println("Are the " + number + " is odd ? - " + (number % 2 != 0));

    }

    public static void detSecondDig(int number) {

        int digit = number / 10;
        digit = digit % 10;

        System.out.println("The second digit of " + number + " = " + digit);
    }

    public static void detFirstDig(int number) {

        int digit = number / 100;

        System.out.println("The first digit of " + number + " = " + digit);
    }

    public static void sumOfNumDig(int number) {

        int sumDigit = 0;
        int digit = number;

        for (int i = 0; i < 3; i++) {

            sumDigit = sumDigit + digit % 10;
            digit = digit / 10;
        }

        System.out.println("The sum of digit " + number + " = " + sumDigit);
    }

    public static void swapNumbers(int firstNum, int secondNum) {

        System.out.println("Firs number = " + firstNum + ". Second number = " + secondNum + ".");
        int temp = firstNum;
        firstNum = secondNum;
        secondNum = temp;
        System.out.println("Firs number = " + firstNum + ". Second number = " + secondNum + ".");

    }

}
