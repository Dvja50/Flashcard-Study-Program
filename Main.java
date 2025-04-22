import java.util.Scanner;

public class Main{ 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FlashcardSet set =  new FlashcardSet();


		while(true) {
			System.out.println("\nFLASHCARD MENU");
			System.out.println("1. Add Flashcard");
			System.out.println("2. Remove Flashcard");
			System.out.println("3. Edit Flashcard");
			System.out.println("4. Show all Flashcards");
			System.out.println("5. Shuffle Flashcards");
			System.out.println("6. Study");
			System.out.println("0. Exit");
			System.out.println("Choose an option: ");
			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				System.out.print("Enter question: ");
				String q = scanner.nextLine();
				System.out.print("Enter answer; ");
				String a = scanner.nextLine();
				set.addCard(new Flashcard(q,a));

			} else if (choice.equals("2")) {
				set.showAllCards();
				System.out.print("Enter index to remove: ");
				int i = Integer.parseInt(scanner.nextLine()) - 1;
				set.removeCard(i);

			}  else if (choice.equals("3")) {
				set.showAllCards();
				System.out.print("Enter index to edit: ");
				int i = Integer.parseInt(scanner.nextLine()) - 1;
				System.out.print("New question: ");
				String q = scanner.nextLine();
				System.out.print("New answer: ");
				String a =  scanner.nextLine();
				set.editCard(i, q, a);

			} else if (choice.equals("4")){
				set.showAllCards();

			} else if (choice.equals("5"))  {
				set.shuffleCards();
				System.out.println("Cards shuffled.");

			} else if (choice.equals("6")) {
				StudySession session = new StudySession(set);
				session.begin();

			}else if (choice.equals("0")){
				System.out.println("Goodbye!");
				break;
			}else {
				System.out.println("Invalid choice. ");
			}
		}
	}
}


