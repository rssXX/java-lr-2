package lr;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        boolean dividingFive = num % 5 == 2;
        boolean dividingSeven = num % 7 == 1;

        if (dividingFive && dividingSeven) {
            System.out.println("Данное число подходит");
        } else {
            System.out.println("Данное число не подходит");
        }

        in.close();
	}

}
