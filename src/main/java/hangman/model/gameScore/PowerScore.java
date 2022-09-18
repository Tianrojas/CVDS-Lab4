package hangman.model.gameScore;

public class PowerScore implements GameScore {
	private int score;
	private int failure = 8;
	private int bonus = 5;
	private int minScore = 0;
	private int maxScore = 500;

	@Override
	public int calculateScore(int correctCount, int incorrectCount) {
		score = 0;
		for (int i = 1; i <= correctCount; i++) {
			score += (Math.pow(bonus, i));
		}
		score = (score - (failure * incorrectCount) < minScore) ? minScore : score - (failure * incorrectCount);
		score = (score > maxScore) ? maxScore : score;
		return score;

	}

}
