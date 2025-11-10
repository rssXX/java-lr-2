package lr;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        System.out.println((num / 1000) + " тысяч");

        in.close();
	}

}
