import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class OrderArray {
    private static final Random random = new Random();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Diziniz kaç rakam içersin? ");
        int arrayLength = input.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i < numbers.length; i++) {
            int randomNumber = getRandomNumber();

            while (isInArray(numbers, randomNumber)) {
                randomNumber = getRandomNumber();
            }
            numbers[i] = randomNumber;
        }
        System.out.println(Arrays.toString(numbers));

        while (!isSorted(numbers)) {
            System.out.println("Hangi iki sayının yerini değiştirmek istersiniz?");
            int firstNumber = input.nextInt();
            int secondNumber = input.nextInt();
            int firstIndex = getIndex(numbers, firstNumber);
            int secondIndex = getIndex(numbers, secondNumber);
            if (firstIndex == -1 || secondIndex == -1) {
                continue;
            }
            swap(numbers, firstIndex, secondIndex);
            System.out.println(Arrays.toString(numbers));
        }
        System.out.println("Tebrikler, diziyi sıraladınız.");
    }

    private static boolean isInArray(int[] numbers, int randomNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == randomNumber) {
                return true;
            }
        }
        return false;
    }

    public static int getRandomNumber() {
        return random.nextInt(10);

    }

    public static int getIndex(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

}