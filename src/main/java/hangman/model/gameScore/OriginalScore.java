package hangman.model.gameScore;

public class OriginalScore implements GameScore {

	private int score ;
	private int failure=10;
	private int minScore=0;
	
	/**
     * Calculates the total score
     * @param correctCount, int  that represents the correct attempts of the player
     * @param incorrectCount, int that represents the incorrect attempts of the player
     * @return int ,that represents the score of the match
	 * @throws Throws an exception if some count numbers are negative
     */
	@Override
	public int calculateScore(int correctCount, int incorrectCount) throws Exception {
		score = 100;
		if( correctCount < 0 || incorrectCount <0 ){
			throw new Exception();
		}
		score =( score - (failure*incorrectCount) < minScore )? minScore :  score - (failure*incorrectCount);
		return score;
	}

}
