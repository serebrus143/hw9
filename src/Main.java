import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println("Сгенерированный массив: " + Arrays.toString(arr));
        task1(arr);
        task2(arr);
        task3(arr);
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(int[] arr) {
        System.out.println("Задание 1");
        int sum = 0;
        for (int money : arr) {
            sum = sum + money;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void task2(int[] arr) {
        System.out.println("Задание 2");
        if (arr.length == 0) {
            return;
        }
        int min = arr[0];
        int max = arr[0];
        for (int money : arr) {
            if (money < min) {
                min = money;
            }
            if (money > max) {
                max = money;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task3(int[] arr) {
        System.out.println("Задание 3");
        int sum = 0;
        for (int money : arr) {
            sum = sum + money;
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}