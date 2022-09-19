package hangman.model.gameScore;

public class PowerScore implements GameScore {
	private int score;
	private int penalty = 8;
	private int bonus = 5;
	private int minScore = 0;
	private int maxScore = 500;
	
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
		for (int i = 1; i <= correctCount; i++) {
			score += (Math.pow(bonus, i));
		}
		score = (score - (penalty * incorrectCount) < minScore) ? minScore : score - (penalty * incorrectCount);
		score = (score > maxScore) ? maxScore : score;
		return score;

	}

}
