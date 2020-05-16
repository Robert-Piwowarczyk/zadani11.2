import java.util.Scanner;

public class EnteringNumbers {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Wpisz dowolną liczbę dodatnią i wciśnij enter:");
        Integer[] numbers = new Integer[10];
        for (int i = 0; i < numbers.length; ) {
            int number = sc.nextInt();
            if (number > 0) {
                numbers[i] = number;
                i++;
            } else {
                if (number < 0) {
                    System.out.println("Liczba ta NIE powinna być dodana do listry");
                    break;
                }
            }
            for (int i = numbers.length - 1; i >= 0; i--) ;
        }
        for (int i = numbers.length){
            System.out.println("Największa wprowadzona cyfra to: " + Integer.MAX_VALUE);
            break;
        }
        for (int i = numbers.length){
            System.out.println("Najmniejsza wprowadzona cyfra to: " + Integer.MIN_VALUE);
            break;
        }
        System.out.println("Suma cyfr a+b+c = " + (numbers[0] + numbers[1] + numbers[2]));
        sc.close();
    }
}





