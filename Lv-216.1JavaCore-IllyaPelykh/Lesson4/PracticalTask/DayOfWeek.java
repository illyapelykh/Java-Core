package Lesson4;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		int dayOfWeek;

		Scanner sc = new Scanner(System.in);

		System.out.println("Type Day of Week");

		dayOfWeek = sc.nextInt();

		switch (dayOfWeek) {
		case 1:
			System.out.println("��/Sun/��");
			break;
		case 2:
			System.out.println("��/Mon/��");
			break;
		case 3:
			System.out.println("��/Tue/��");
			break;
		case 4:
			System.out.println("��/Wed/��");
			break;
		case 5:
			System.out.println("��/Thr/��");
			break;
		case 6:
			System.out.println("��/Fri/��");
			break;
		case 7:
			System.out.println("��/Sat/��");
			break;
		default:
			System.out.println("Type number of day 1...7");
			break;

		}

	}

}

