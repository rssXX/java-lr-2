package timus;

import java.util.Scanner;

public class task_1068 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        int sum = 0;

        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= a; i--) {
                sum += i;
            }
        }

        System.out.println(sum);

        in.close();
	}

}
