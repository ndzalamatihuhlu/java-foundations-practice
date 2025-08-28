import java.util.Random;

class RollADieGame {

    static boolean showExpectedResult = true;
    static boolean showHints = true;

    static String playGame() {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        String tooLow = "You're on space %d. Sorry, you lose!";
        String tooHigh = "You've exceeded %d spaces. Sorry, you lose!";
        String justRight = "You're on space %d. Congrats, you win!";

        for (int i = 0; i < maxRolls; i++) {
            int die = random.nextInt(6) + 1;   // roll the die
            currentSpace += die;               // move forward

            // check conditions
            if (currentSpace == lastSpace) {
                return String.format(justRight, currentSpace);
            } else if (currentSpace > lastSpace) {
                return String.format(tooHigh, lastSpace);
            }
        }

        // if loop ends without exact 20
        return String.format(tooLow, currentSpace);
    }

}
