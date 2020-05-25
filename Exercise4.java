
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) throws IOException {

		// Create a file instance
		File inputFile = new File("C:\\Users\\Joshua\\Documents\\exercise4.txt");

		Scanner input = new Scanner(inputFile);

		while (input.hasNext()) {

			String text = input.next();
			String pigLatinTranslation = text.toUpperCase();

			switch (text.length()) {
			case 1:
				System.out.print(text + "       ");
				break;
			case 2:
				System.out.print(text + "      ");
				break;
			case 3:
				System.out.print(text + "     ");
				break;
			case 4:
				System.out.print(text + "    ");
				break;
			case 5:
				System.out.print(text + "   ");
				break;
			case 6:
				System.out.print(text + "  ");
				break;
			case 7:
				System.out.print(text + " ");
				break;
			case 8:
				System.out.print(text);
				break;
			default:
				System.out.println("One of the words in the text file are too long to process.");
			}

			if (pigLatinTranslation.charAt(0) == 'A' || pigLatinTranslation.charAt(0) == 'E'
					|| pigLatinTranslation.charAt(0) == 'I' || pigLatinTranslation.charAt(0) == 'O'
					|| pigLatinTranslation.charAt(0) == 'U') {
				System.out.println(pigLatinTranslation + "WAY");
			} else if (pigLatinTranslation.charAt(1) == 'T') {
				System.out.println(pigLatinTranslation.substring(2) + pigLatinTranslation.substring(0, 2) + "AY");
			} else {
				System.out.println(pigLatinTranslation.substring(1) + pigLatinTranslation.substring(0, 1) + "AY");
			}
		}
	}
}
