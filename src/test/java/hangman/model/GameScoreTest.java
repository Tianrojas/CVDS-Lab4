package hangman.model;

import org.junit.Test;
import hangman.model.*;
import org.junit.Assert;

public class GameScoreTest {
	// arrange
	private GameScore original = new OriginalScore();
	private GameScore bonus = new BonusScore();
	private GameScore power = new PowerScore();

	// -------------------------------OriginalScore----------------------------

	@Test
	public void GivenNegativeValuesAsParamsThenThrowsException() {
		try {
			// Act
			original.calculateScore(-1, -1);
		} catch (Exception e) {
			// Assert
			Assert.assertTrue(true);
		}
	}

	@Test
	public void GivenNoActionThenReturnOriginalScore() throws GameScoreException {
		// Act
		int score = original.calculateScore(100, 0);
		// Assert
		Assert.assertEquals(score, 100);

	}

	@Test
	public void GivenNormalValuesThenActNormal1() throws GameScoreException {
		// Act
		int score = original.calculateScore(0, 5);
		// Assert
		Assert.assertEquals(score, 50);

	}

	@Test
	public void GivenNormalValuesThenActNormal2() throws GameScoreException {
		// Act
		int score = original.calculateScore(0, 10);
		// Assert
		Assert.assertEquals(score, 0);

	}

	// Limit test with incorrectCount = 10
	@Test
	public void GivenNormalValuesThenShouldMini1() throws GameScoreException {
		// Act
		int score = original.calculateScore(26, 11);
		// Assert
		Assert.assertEquals(score, 0);

	}

	@Test
	public void GivenNormalValuesThenShouldMini2() throws GameScoreException {
		// Act
		int score = original.calculateScore(34, 40);
		// Assert
		Assert.assertEquals(score, 0);

	}

	// -------------------------BonusScore-------------------------------
	@Test
	public void GivenNegativeValuesAsParamsThenThrowsException2() {
		try {
			// Act
			bonus.calculateScore(-1, -1);
		} catch (Exception e) {
			// Assert
			Assert.assertTrue(true);
		}
	}

	@Test
	public void GivenNoActionThenReturnOriginalScore12() throws GameScoreException {
		// Act
		int score = bonus.calculateScore(10, 20);
		// Assert
		Assert.assertEquals(score, 0);

	}

	@Test
	public void GivenNormalValuesThenShouldMini12() throws GameScoreException {
		// Act
		int score = bonus.calculateScore(0, 0);
		// Assert
		Assert.assertEquals(score, 0);

	}

	@Test
	public void GivenNormalValuesThenShouldMini22() throws GameScoreException {
		// Act
		int score = bonus.calculateScore(20, 20);
		// Assert
		Assert.assertEquals(score, 100);

	}

	// --------------------------------PowerScore--------------------------------------
	@Test
	public void GivenNegativeValuesAsParamsThenThrowsException3() {
		try {
			// Act
			power.calculateScore(-1, -1);
		} catch (Exception e) {
			// Assert
			Assert.assertTrue(true);
		}
	}

	// Limit test with incorrectCount = 0 ^ correctCount = 4
	@Test
	public void GivenNoActionThenReturnOriginalScore13() throws GameScoreException {
		// Act
		int score = power.calculateScore(4, 0);
		// Assert
		Assert.assertTrue(score == 500);
	}

	@Test
	public void GivenNormalValuesThenShouldMini13() throws GameScoreException {
		// Act
		int score = power.calculateScore(0, 15);
		// Assert
		Assert.assertEquals(score, 0);

	}

	@Test
	public void GivenNormalValuesThenShouldMini23() throws GameScoreException {
		// Act
		int score = power.calculateScore(4, 63);
		// Assert
		Assert.assertEquals(score, 276);

	}
}
