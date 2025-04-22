all: 
	javac Main.java Flashcard.java FlashcardSet.java StudySession.java

run: all
	java Main

clean: 
	rm -f *.class
