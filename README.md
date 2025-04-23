# Flashcard-Study-Program

The flash card study program simulates an educational tool that helps users to study by displaying flashcards, allowing them to answer questions and tracking their progress over time.
Users could be Students/Learners or even Tutors/Instructors. 

# Algorithm Summary

The isCorrect() method in the Flashcard class checks if the user's answer matches the correct one. It ignores extra spaces and whether the letters are uppercase or lowercase. The shuffleCards() method in FlashcardSet mixes up the flashcards in random order using a built-in shuffle tool. The editCard() method lets the user change the question and answer of a flashcard, and removeCard() deletes one from the list if the index is valid.

The begin() method in the StudySession class starts the study session. It goes through each flashcard, shows the question, and gets the user’s answer. If the answer is correct, it says “Correct!”  otherwise, it shows the right answer. It keeps track of how many the user gets right and shows the final score at the end.
