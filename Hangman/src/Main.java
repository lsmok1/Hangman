import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;

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
                        """
        );


    }

    public static String getLetter() {
        return new Scanner(System.in).nextLine().substring(0,1);
    }
    public static Scanner playAgain() {
        return new Scanner(System.in);
    }


    public static void theWord() {
        intro();
        int tries = 0;
        int attempts = 7;
        Set<String> previousGuesses = new HashSet<>();
        String strWord = "";
        Random rand = new Random();
        int randomNum = rand.nextInt(3);
        randomNum += 1;
        if (randomNum == 1) {
            strWord = "dog";
            int length = strWord.length();
            char[] wordToChars = strWord.toCharArray();
            char [] censorWord = strWord.toCharArray();
            System.out.println("Word to guess: ");
            for (int i = 0; i < length; i++) {
                censorWord[i] = '_';
            }
            //while censorWord doesn't equal strWord
            while (!String.valueOf(censorWord).equals(strWord) && attempts <= 7) {
                boolean correct = false;
                boolean repeated = false;
                //printing the censored word
                for (int i = 0; i < length; i++) {
                    System.out.print(censorWord[i]);
                }
                System.out.println();
                System.out.println("Guess a letter: ");
                String currentGuess = getLetter();
                char currentGuessChar = currentGuess.charAt(0);
                //checking if letter is repeated
                if (previousGuesses.contains(currentGuess)) {
                    System.out.println("You already guessed this!");
                    System.out.println(previousGuesses.stream().reduce("", String::concat));
                    repeated = true;
                }
                previousGuesses.add(currentGuess);
                //if guess is not a repeated guess, check to see if the guess is in the strWord
                if (!repeated) {
                    int times = 0; // #of times a letter is in the word
                    for (int i = 0; i < length; i++) {
                        if(wordToChars[i] == currentGuessChar) {
                            censorWord[i] = currentGuessChar; //replaces the underscore with guessed letter
                            correct = true;
                            times++;
                        }
                    }
                    if (correct) {
                        System.out.println("The letter " + currentGuessChar + " is in the word " + times + " time(s)!");
                    } else {
                        attempts--;
                    }
                    if(attempts == 6 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                           |

                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 5 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |

                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 4 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 3 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                    /      |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 2 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 1 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                    /|     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again! Last chance!");
                    } else if (attempts == 0 && !correct){
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                    /|\\     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Oh dear, you are dead.");
                        System.out.println("Play again? (Y/N) :");
                        playAgain();
                        char yesOrNo = playAgain().nextLine().charAt(0);
                        if (yesOrNo == 'y') {
                            intro();
                            tries = 0;
                            attempts = 7;
                            previousGuesses.clear();
                            strWord = "";
                            rand = new Random();
                            randomNum = rand.nextInt(3);
                            randomNum += 1;
                        } else {
                            break;
                        }
                    }
                }
                tries++;

            }
            if (attempts != 0 ) {
                System.out.println("You got it! It took you: " + tries + " tries...");
                playAgain();
                char yesOrNo = playAgain().nextLine().charAt(0);
                if (yesOrNo == 'y') {
                    intro();
                    tries = 0;
                    attempts = 7;
                    previousGuesses.clear();
                    strWord = "";
                    rand = new Random();
                    randomNum = rand.nextInt(3);
                    randomNum += 1;

                } else {
                    System.out.println("Goodbye");;
                }
            }
        }
        if (randomNum == 2) {
            strWord = "orange";
            int length = strWord.length();
            char[] wordToChars = strWord.toCharArray();
            char [] censorWord = strWord.toCharArray();
            System.out.println("Word to guess: ");
            for (int i = 0; i < length; i++) {
                censorWord[i] = '_';
            }
            //while censorWord doesn't equal strWord
            while (!String.valueOf(censorWord).equals(strWord) && attempts <= 7) {
                boolean correct = false;
                boolean repeated = false;
                //printing the censored word
                for (int i = 0; i < length; i++) {
                    System.out.print(censorWord[i]);
                }
                System.out.println();
                System.out.println("Guess a letter: ");
                String currentGuess = getLetter();
                char currentGuessChar = currentGuess.charAt(0);
                //checking if letter is repeated
                if (previousGuesses.contains(currentGuess)) {
                    System.out.println("You already guessed this!");
                    System.out.println(previousGuesses.stream().reduce("", String::concat));
                    repeated = true;
                }
                previousGuesses.add(currentGuess);
                //if guess is not a repeated guess, check to see if the guess is in the strWord
                if (!repeated) {
                    int times = 0; // #of times a letter is in the word
                    for (int i = 0; i < length; i++) {
                        if(wordToChars[i] == currentGuessChar) {
                            censorWord[i] = currentGuessChar; //replaces the underscore with guessed letter
                            correct = true;
                            times++;
                        }
                    }
                    if (correct) {
                        System.out.println("The letter " + currentGuessChar + " is in the word " + times + " time(s)!");
                    } else {
                        attempts--;
                    }
                    if(attempts == 6 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                           |

                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 5 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |

                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 4 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 3 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                    /      |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 2 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 1 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                    /|     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again! Last chance!");
                    } else if (attempts == 0 && !correct){
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                    /|\\     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Oh dear, you are dead.");
                        System.out.println("Play again? (Y/N) :");
                        playAgain();
                        char yesOrNo = playAgain().nextLine().charAt(0);
                        if (yesOrNo == 'y') {
                            intro();
                            tries = 0;
                            attempts = 7;
                            previousGuesses.clear();
                            strWord = "";
                            rand = new Random();
                            randomNum = rand.nextInt(3);
                            randomNum += 1;
                        } else {
                            break;
                        }
                    }
                }
                tries++;

            }
            if (attempts != 0 ) {
                System.out.println("You got it! It took you: " + tries + " tries...");
                playAgain();
                char yesOrNo = playAgain().nextLine().charAt(0);
                if (yesOrNo == 'y') {
                    intro();
                    tries = 0;
                    attempts = 7;
                    previousGuesses.clear();
                    strWord = "";
                    rand = new Random();
                    randomNum = rand.nextInt(3);
                    randomNum += 1;

                } else {
                    System.out.println("Goodbye");;
                }
            }

        }
        if (randomNum == 3) {
            strWord = "goop";
            int length = strWord.length();
            char[] wordToChars = strWord.toCharArray();
            char [] censorWord = strWord.toCharArray();
            System.out.println("Word to guess: ");
            for (int i = 0; i < length; i++) {
                censorWord[i] = '_';
            }
            //while censorWord doesn't equal strWord
            while (!String.valueOf(censorWord).equals(strWord) && attempts <= 7) {
                boolean correct = false;
                boolean repeated = false;
                //printing the censored word
                for (int i = 0; i < length; i++) {
                    System.out.print(censorWord[i]);
                }
                System.out.println();
                System.out.println("Guess a letter: ");
                String currentGuess = getLetter();
                char currentGuessChar = currentGuess.charAt(0);
                //checking if letter is repeated
                if (previousGuesses.contains(currentGuess)) {
                    System.out.println("You already guessed this!");
                    System.out.println(previousGuesses.stream().reduce("", String::concat));
                    repeated = true;
                }
                previousGuesses.add(currentGuess);
                //if guess is not a repeated guess, check to see if the guess is in the strWord
                if (!repeated) {
                    int times = 0; // #of times a letter is in the word
                    for (int i = 0; i < length; i++) {
                        if(wordToChars[i] == currentGuessChar) {
                            censorWord[i] = currentGuessChar; //replaces the underscore with guessed letter
                            correct = true;
                            times++;
                        }
                    }
                    if (correct) {
                        System.out.println("The letter " + currentGuessChar + " is in the word " + times + " time(s)!");
                    }  else {
                        attempts--;
                    }
                    if(attempts == 6 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                           |

                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 5 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |

                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 4 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                           |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 3 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                    /      |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 2 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                     |     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again!");
                    } else if (attempts == 1 && !correct) {
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                    /|     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Nope! Guess again! Last chance!");
                    } else if (attempts == 0 && !correct){
                        System.out.println(
                                """
                                             H A N G M A N

                                                     +---+
                                                     O
                                                    /|\\     |
                                                     |
                                                    / \\    |

                                                           |

                                                         ===
                                        """
                        );
                        System.out.println("Oh dear, you are dead.");
                        System.out.println("Play again? (Y/N) :");
                        playAgain();
                        char yesOrNo = playAgain().nextLine().charAt(0);
                        if (yesOrNo == 'y') {
                            intro();
                            tries = 0;
                            attempts = 7;
                            previousGuesses.clear();
                            strWord = "";
                            rand = new Random();
                            randomNum = rand.nextInt(3);
                            randomNum += 1;

                        } else {
                            break;
                        }
                    }
                }

                tries++;

            }
            if (attempts != 0 ) {
                System.out.println("You got it! It took you: " + tries + " tries...");
                playAgain();
                char yesOrNo = playAgain().nextLine().charAt(0);
                if (yesOrNo == 'y') {
                    intro();
                    tries = 0;
                    attempts = 7;
                    previousGuesses.clear();
                    strWord = "";
                    rand = new Random();
                    randomNum = rand.nextInt(3);
                    randomNum += 1;
                } else {
                    System.out.println("Goodbye");
                }

            }
        }
    }


    public static void main(String[] args) {
        theWord();

    }
}
