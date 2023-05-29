package refactoring;

public class TennisGame {

    private static final String LOVE = "Love";
    private static final String FIFTEEN = "Fifteen";
    private static final String THIRTY = "Thirty";
    private static final String FORTY = "Forty";
    private static final String ALL = "All";
    private static final String DEUCE = "Deuce";
    private static final String ADVANTAGE = "Advantage";
    private static final String WIN = "Win";
    private static final String PLAYER_1 ="player1";
    private static final String PLAYER2 = "player2";

    public static String getScore(int scoreOfPlayer1, int scoreOfPlayer2) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if ( scoreOfPlayer1== scoreOfPlayer2) {
            switch (tempScore) {
                case 0:
                    score = new StringBuilder(LOVE + "-" + ALL);
                    break;
                case 1:
                    score = new StringBuilder(FIFTEEN + "-" + ALL);
                    break;
                case 2:
                    score = new StringBuilder(THIRTY + "-" + ALL);
                    break;
                case 3:
                    score = new StringBuilder(FORTY + "-" + ALL);
                    break;
                default:
                    score = new StringBuilder(DEUCE);
                    break;
            }
        } else if ( scoreOfPlayer1>= 4 || scoreOfPlayer2 >= 4) {
            int minusResult =  - scoreOfPlayer2;
            if (minusResult == 1) {
                score = new StringBuilder(ADVANTAGE + " " + PLAYER_1);
            } else if (minusResult == -1) {
                score = new StringBuilder(ADVANTAGE + " " + PLAYER2);
            } else if (minusResult >= 2) {
                score = new StringBuilder(WIN + " " + PLAYER_1);
            } else {
                score = new StringBuilder(WIN + " " + PLAYER2);
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = scoreOfPlayer1 ;
                } else {
                    score.append("-");
                    tempScore = scoreOfPlayer2;
                }
                switch (tempScore) {
                    case 0:
                        score.append(LOVE);
                        break;
                    case 1:
                        score.append(FIFTEEN);
                        break;
                    case 2:
                        score.append(THIRTY);
                        break;
                    case 3:
                        score.append(FORTY);
                        break;
                }
            }
        }
        return score.toString();
    }
}
