
public class Flashcard {
	private String question;
	private String answer;


	public Flashcard(String q, String a) {
		question = q;
		answer = a;
	}

	public void showQuestion() {
		System.out.println("Question: " + question);
	}

	public void showAnswer(){
		System.out.println("Answer: " + answer);
	}

	public boolean isCorrect(String userAnswer){
		return answer.equalsIgnoreCase(userAnswer.trim());
	}

	public String getQuestion(){
		return  question;
	}
}
