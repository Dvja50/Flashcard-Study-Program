import java.util.Scanner;

public class StudySession {
	private FlashcardSet set;

	public StudySession(FlashcardSet s){
		set = s;
	}

	public void begin(){
		Scanner input = new Scanner(System.in);
		int correct = 0;
		int total = set.getCards().size();

		for (Flashcard card : set.getCards()){
			card.showQuestion();
			System.out.print("Your answer: ");
			String answer = input.nextLine();

			if (card.isCorrect(answer)){
				System.out.println("Correct!");
				correct++;
			} else {
				System.out.println("Incorrect.");
				card.showAnswer();
			}

			System.out.println();
		}

		System.out.println("You got " + correct + " out  of " + total + "  correct.");
	}
}
