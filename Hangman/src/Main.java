import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void intro() {
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

    public static ArrayList<Character> theWord() {
        ArrayList<Character> guessThisWord = new ArrayList<>();
        ArrayList<Character> chArrDash = new ArrayList<>();
        String strWord = "";
        String strDisplay = "";
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        randomNum += 1;
        if (randomNum == 1) {
            strWord = "dog";
            char[] chArrWord = strWord.toCharArray();
            strDisplay = "___";
            char[] chArrDisplay = strDisplay.toCharArray();
            for (char c : chArrWord) {
                guessThisWord.add(c);
            }
            for (char c :  chArrDisplay) {
                chArrDash.add(c);
            }
        }
        if (randomNum == 2) {
            strWord = "cat";
            char[] chArrWord = strWord.toCharArray();
            strDisplay = "___";
            char[] chArrDisplay = strDisplay.toCharArray();
            for (char c : chArrWord) {
                guessThisWord.add(c);
            }
            for (char c :  chArrDisplay) {
                chArrDash.add(c);
            }
        }
        if (randomNum == 3) {
            strWord = "orange";
            char[] chArrWord = strWord.toCharArray();
            strDisplay = "______";
            char[] chArrDisplay = strDisplay.toCharArray();
            for (char c : chArrWord) {
                guessThisWord.add(c);
            }
            for (char c :  chArrDisplay) {
                chArrDash.add(c);
            }
        }
        System.out.println("Word to Guess: " + chArrDash.toString()
                .replace(",", "")
                .replace("[","")
                .replace("]",""));
    return guessThisWord;
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
        theWord();
//        missedLetters(getLetter());
    }
}
