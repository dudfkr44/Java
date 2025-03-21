package ex1_input;

import java.io.IOException;
import java.util.Scanner;

public class Ex1_Input {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		byte[] keyboard = new byte[100];

		System.out.print("값 : ");
		try {
			System.in.read(keyboard);

			String res = new String(keyboard);
			System.out.println(res.trim());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	} // main

}
