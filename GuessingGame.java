import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {

		int num1 = (int) (1 + Math.random() * 9);
		int num2 = (int) (1 + Math.random() * 9);
		int num3 = (int) (1 + Math.random() * 9);
		int num4 = (int) (1 + Math.random() * 9);
		int num5 = (int) (1 + Math.random() * 9);

		int sum = 0;
		int tries = 10;

		boolean win = false;

		System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);
		System.out.println("Please Enter The 5-Digit Code: ");


		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);

		while (win != true && tries != 0) {


			try {
				sum = 0;
				String guess = userInput.nextLine();

				char n1 = guess.charAt(0);
				char n2 = guess.charAt(1);
				char n3 = guess.charAt(2);
				char n4 = guess.charAt(3);
				char n5 = guess.charAt(4);

				String nums1 = Character.toString(n1);
				String nums2 = Character.toString(n2);
				String nums3 = Character.toString(n3);
				String nums4 = Character.toString(n4);
				String nums5 = Character.toString(n5);

				int guess1 = Integer.parseInt(nums1);
				int guess2 = Integer.parseInt(nums2);
				int guess3 = Integer.parseInt(nums3);
				int guess4 = Integer.parseInt(nums4);
				int guess5 = Integer.parseInt(nums5);

				if (guess1 == 0 || guess2 == 0 || guess3 == 0 || guess4 == 0 || guess5 == 0 || guess.length() > 5) {
					throw new IndexOutOfBoundsException();
				}

				if (guess1 != num1 || guess2 != num2 || guess3 != num3 || guess4 != num4 || guess5 != num5) {

					if (guess1 == num1) {
						System.out.println(guess1 + " is correct at position 1.");
						sum = sum + guess1;
					}
					if (guess2 == num2) {
						System.out.println(guess2 + " is correct at position 2.");
						sum = sum + guess2;
					}
					if (guess3 == num3) {
						System.out.println(guess3 + " is correct at position 3.");
						sum = sum + guess3;
					}
					if (guess4 == num4) {
						System.out.println(guess4 + " is correct at position 4.");
						sum = sum + guess4;
					}
					if (guess5 == num5) {
						System.out.println(guess5 + " is correct at position 5.");
						sum = sum + guess5;
					}
					if (sum != 0) {
						System.out.println("And their sum is " + sum);
					}else {
						System.out.println("None of your guesses are correct.");
					}

					tries--;
					if (tries != 0) {
						System.out.println("Try Again!");
						System.out.println("Think carefully, you have " + tries + " tries left.");
					}else {
						System.out.println("Game Over!");
					}

				}
				else if (guess1 == num1 && guess2 == num2 && guess3 == num3 && guess4 == num4 && guess5 == num5) {
					System.out.println("Congrats! You Win!");
					win = true;
				}

			}catch(Exception e) {
				tries--;
				if (tries != 0) {
					System.out.println("Error: You must enter 5-digit number, 1 - 9");
					System.out.println("Now you have " + tries + " tries left!");
				}
				else if (tries >= 0) {
					System.out.println("Game Over!");
				}

			}
		}


	}
}
