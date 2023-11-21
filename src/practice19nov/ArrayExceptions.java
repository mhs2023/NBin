package practice19nov;

import java.util.Scanner;

public class ArrayExceptions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {0, 1, 2, 3, 4};
        int index = 5;
        String name = null;
        try {
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception");
        }
        try {
            int x, y, result;
            x = input.nextInt();
            y = input.nextInt();
            result = x / y;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("Kawwa mori giye");
        } finally {
            System.out.println("Foman ase?");
        }
        System.out.println("______1st_____");
        try {
            throwException(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("______2nd_____");
    }

    public static void throwException(int val) throws RuntimeException {

        if (val == 0) {
            throw new RuntimeException("Error----");
        }
        System.out.println("Val :" + val);
    }

}
