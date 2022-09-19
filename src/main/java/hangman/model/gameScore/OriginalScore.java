package hangman.model.gameScore;

public class OriginalScore implements GameScore {

	private int gameScore = 100;
	private int penalty = 10;
	
	/**
     * Calculates the total score
     * @param correctCount, int  that represents the correct attempts of the player
     * @param incorrectCount, int that represents the incorrect attempts of the player
     * @return int ,that represents the score of the match
	 * @throws Exception 
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws Exception {
		if( correctCount < 0 || incorrectCount <0 ){
			throw new Exception("invalid values");
        }
		return gameScore - (incorrectCount * penalty);
	}

}
