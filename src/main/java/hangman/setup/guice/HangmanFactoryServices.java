/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

import com.google.inject.multibindings.MapBinder;

import hangman.model.dictionary.HangmanDictionary;
import hangman.model.gameScore.*;
import hangman.model.language.*;
import hangman.injectInterface;
import hangman.injectorFabric;
import hangman.model.dictionary.*;
import hangman.view.hangmanPanel.*;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

	@Override
	protected void configure() {

		bind(injectInterface.class).to(injectorFabric.class);
		/* Guice dependency injection */
		// bind(Interface.class).to(Concrete.class);
		MapBinder<GameScoreOption, GameScore> mapBinderGameScore = MapBinder.newMapBinder(binder(),
				GameScoreOption.class, GameScore.class);

		mapBinderGameScore.addBinding(GameScoreOption.OriginalScore).to(OriginalScore.class);
		mapBinderGameScore.addBinding(GameScoreOption.PowerScore).to(PowerScore.class);
		mapBinderGameScore.addBinding(GameScoreOption.BonusScore).to(BonusScore.class);

		MapBinder<dictionaryOption, HangmanDictionary> mapBinderDictionary = MapBinder.newMapBinder(binder(),
				dictionaryOption.class, HangmanDictionary.class);

		mapBinderDictionary.addBinding(dictionaryOption.EnglishDictionaryDataSource)
				.to(EnglishDictionaryDataSource.class);
		mapBinderDictionary.addBinding(dictionaryOption.FrenchDictionaryDataSource)
				.to(FrenchDictionaryDataSource.class);
		mapBinderDictionary.addBinding(dictionaryOption.SpanishDictionaryDataSource)
				.to(SpanishDictionaryDataSource.class);

		MapBinder<panelOption, HangmanPanel> mapBinderPanel = MapBinder.newMapBinder(binder(), panelOption.class,
				HangmanPanel.class);

		mapBinderPanel.addBinding(panelOption.HangmanColoridoPanel).to(HangmanColoridoPanel.class);
		mapBinderPanel.addBinding(panelOption.HangmanNoviolentoPanel).to(HangmanNoviolentoPanel.class);
		mapBinderPanel.addBinding(panelOption.HangmanStickmanPanel).to(HangmanStickmanPanel.class);

		MapBinder<LanguageOption, Language> mapBinderLanguage = MapBinder.newMapBinder(binder(), LanguageOption.class,
				Language.class);

		mapBinderLanguage.addBinding(LanguageOption.English).to(English.class);
		mapBinderLanguage.addBinding(LanguageOption.French).to(French.class);
		mapBinderLanguage.addBinding(LanguageOption.Spanish).to(Spanish.class);

	}

	public enum GameScoreOption {
		OriginalScore, PowerScore, BonusScore;
	}

	public enum LanguageOption {
		English, French, Spanish;
	}

	public enum dictionaryOption {
		EnglishDictionaryDataSource, FrenchDictionaryDataSource, SpanishDictionaryDataSource;
	}

	public enum panelOption {
		HangmanColoridoPanel, HangmanNoviolentoPanel, HangmanStickmanPanel;
	}
}
