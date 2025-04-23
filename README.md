# Flashcard-Study-Program

The flash card study program simulates an educational tool that helps users to study by displaying flashcards, allowing them to answer questions and tracking their progress over time.
Users could be Students/Learners or even Tutors/Instructors. 

# Algorithm Summary

The checkAnswer() method checks if the user’s answer matches the correct answer on the flashcard. It ignores upper/lowercase letters and extra spaces, so small mistakes don’t count against the user. The shuffleCards() method mixes up the flashcards in a random order to help users study more effectively. The startSession() method runs the actual study session. It shows each flashcard question one at a time, asks the user for their answer, checks if it’s right, and keeps track of how many answers are correct. At the end of the session, it tells the user how many they got right out of the total number of flashcards. The checkAnswer() method basically does the trimming and insensitive comparison. For the shuffleCards() it uses a java utility method in order to randomize a list. The startSession() on the other hand has multiple steps which are loop,display,check, and score.
