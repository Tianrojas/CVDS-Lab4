package hangman.model.gameScore;

public class BonusScore implements GameScore {
	private int score = 0;
	private int penalty = 5;
	private int bonus = 10;
	private int minScore = 0;
	
	/**
     * Calculates the total score
     * @param correctCount, int  that represents the correct attempts of the player
     * @param incorrectCount, int that represents the incorrect attempts of the player
     * @return int ,that represents the score of the match
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws Exception {
		if( correctCount < 0 || incorrectCount <0 ) {
			throw new Exception("invalid values");
        }
		score = 0;
		score = (score + (correctCount * bonus) - (penalty * incorrectCount) < minScore) ? minScore
				: score + (correctCount * bonus) - (penalty * incorrectCount);
		return score;
	}

}
