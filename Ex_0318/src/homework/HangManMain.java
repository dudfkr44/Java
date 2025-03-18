package homework;

import java.util.Random;

public class HangManMain {
	
	public static void main(String[] args) {
		
		String[] word = {"apple", "game"};
		int rnd = new Random().nextInt(word.length);
		
		System.out.println("*** HangMan ***");
		
		PlayHangMan phm = new PlayHangMan(word[rnd]);
		phm.play();
		
	} // main

}
