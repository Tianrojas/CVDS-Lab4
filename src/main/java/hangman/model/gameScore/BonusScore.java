package hangman.model.gameScore;

public class BonusScore implements GameScore {
	private int score = 0;
	private int failure = 5;
	private int bonus = 10;
	private int minScore = 0;

	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		score = 0;
		score = (score + (correctCount * bonus) - (failure * incorrectCount) < minScore) ? minScore
				: score + (correctCount * bonus) - (failure * incorrectCount);
		return score;
	}

}
