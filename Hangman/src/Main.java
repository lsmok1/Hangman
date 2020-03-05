import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void intro(){
        System.out.println(
                """
                             H A N G M A N

                                     +---+

                                           |

                                           |

                                           |

                                         ===

                                     Missed letters:

                                     _ _ _

                                     Guess a letter.
                        """
        );
        System.out.println(allLetters());

    }
    public static char getLetter() {
        return new Scanner(System.in).nextLine().charAt(0);
    }
    public static ArrayList<Character> missedLetters(char letter){
        int guesses = 0;
        ArrayList<Character> missedLetter = new ArrayList<>();
        ArrayList<Character> correctLetters = new ArrayList<>();
        ArrayList<Character> correctGuesses = new ArrayList<>();
        char[] correct = "cat".toCharArray();
//        missedLetter.add(getLetter());
////        guesses.add(getLetter());
        for (char c : correct) {
            correctLetters.add(c);

            while (correctLetters.size() != correctGuesses.size() && correctLetters.contains(c) != correctGuesses.contains(c)) {

                if (correctLetters.contains(letter)) {
                    correctGuesses.add(letter);
                    System.out.println("correct: " + correctGuesses);
                    guesses += 1;
                    letter = getLetter();
                    if (correctGuesses.contains(letter) && guesses > 1 && !correctGuesses.contains(correctLetters)) {
                        System.out.println("Already guessed that letter! Guess again!");
                        letter = getLetter();
                    }
                } else {
                    guesses += 1;
                    missedLetter.add(letter);
                    System.out.println("incorrect: " + missedLetter);
                    if (missedLetter.contains(letter)) {
                        letter = getLetter();
                    }
                }
            }
        }

        return missedLetter;
    }
    public static ArrayList<Character> allLetters() {
        ArrayList<Character> allLetters = new ArrayList<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i < alphabet.length; i++) {
            allLetters.add(alphabet[i]);
        }
        return allLetters;
    }

    public static void main(String[] args) {
        intro();
        missedLetters(getLetter());
    }
}
