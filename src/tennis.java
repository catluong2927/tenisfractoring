public class tennis {
    public static String getScore(int player_1_score, int player_2_score) {
        String score = "";
        int tempScore=0;
        if (player_1_score == player_2_score)
        {
            playerScore(score,player_1_score);
        }
        else if (player_1_score>=4 || player_2_score>=4)
        {
            howToScore(score, player_1_score, player_2_score);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = player_1_score;
                else {
                    score+="-";
                    tempScore = player_2_score;
                }
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static String playerScore(String score, int player) {
        switch (player)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static String howToScore(String score, int player_1_score, int player_2_score) {
        int minusResult = player_1_score-player_2_score;
        if (minusResult==1) score ="Advantage player1";
        else if (minusResult ==-1) score ="Advantage player2";
        else if (minusResult>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }
}