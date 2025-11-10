package lr;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.println("Число нам подходит");
        } else {
            System.out.println("Число нам не подходит");
        }

        in.close();
	}

}
