public class Main {

    public static void main(String[] args) {
        int[] array_1 = {4, 3, 6, 5, 20};
        int counter = 0;
        for (int value : array_1) {
            counter += value;
        }
        System.out.print("Сумма трат за месяц составила " + counter + " рублей");
        System.out.println();
        int minimal = 100;
        int maximum = 0;
        for (int k : array_1) {
            if (k < minimal) {
                minimal = k;
            }
            if (k > maximum) {
                maximum = k;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minimal + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maximum + " рублей");


        int[] week = {4, 3, 6, 5, 20};
        int all = 0;
        for (int j : week) {
            all += j;
        }
        float middle = all / 5f;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}