package hangman.setup.guice.factories;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import hangman.model.gameScore.GameScore;
import hangman.setup.guice.HangmanFactoryServices.GameScoreOption;
import java.util.Map;

@Singleton
public class InputGameScoreFactory implements GameScoreFactory{
	
	Map<GameScoreOption, GameScore> mapBinderGameScore;
	
	@Inject
	public InputGameScoreFactory(Map<GameScoreOption, GameScore> mapBinderGameScore) {
		this.mapBinderGameScore = mapBinderGameScore;
	}
	
	@Override
	public GameScore getGameScore(String value) {
		GameScore sco = null;
		if(value.equals("BS")){
			sco = mapBinderGameScore.get(GameScoreOption.BonusScore);
		}else if (value.equals("PS")){
			sco = mapBinderGameScore.get(GameScoreOption.PowerScore);
		}else {
			sco = mapBinderGameScore.get(GameScoreOption.OriginalScore);
		}
		return sco;
	}
	
}
