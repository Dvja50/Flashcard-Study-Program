import java.util.ArrayList;
import java.util.Collections;

public class FlashcardSet {
	private ArrayList<Flashcard> cards;

	public FlashcardSet(){
		cards = new ArrayList<Flashcard>();
	}

	public void addCard(Flashcard card) { 
		cards.add(card);
	}

	public void removeCard(int index){
		if (index >= 0 && index < cards.size()){
			cards.remove(index);
		}
	}

	public void editCard(int index, String newQ, String newA){
		if (index>= 0 && index < cards.size()){
			cards.set(index, new Flashcard(newQ, newA));
		}
	}

	public void shuffleCards(){
		Collections.shuffle(cards);
	}

	public void showAllCards(){
		for (int i = 0; i < cards.size(); i++){
			System.out.println((i + 1) + ". " + cards.get(i).getQuestion());
		}
	}

	public ArrayList<Flashcard> getCards(){
		return cards;
	}
}

