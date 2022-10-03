/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.model.language.*;
import hangman.model.language.Language;
import hangman.setup.factoryMethod.*;
import com.google.inject.multibindings.MapBinder;
import hangman.setup.factoryMethod.factories.GameScoreFactory;
import hangman.view.hangmanPanel.HangmanPanel;
import hangman.view.hangmanPanel.*;
import hangman.model.gameScore.*;
import hangman.setup.factoryMethod.factories.*;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);

        bind(HangmanFactoryMethod.class).to(HangmanDefaultFactoryMethod.class);

        MapBinder<LanguageOption, Language> mapBinderLanguage = MapBinder.newMapBinder(binder(), LanguageOption.class,
                Language.class);

        mapBinderLanguage.addBinding(LanguageOption.English).to(English.class);
        mapBinderLanguage.addBinding(LanguageOption.French).to(French.class);
        mapBinderLanguage.addBinding(LanguageOption.Spanish).to(Spanish.class);

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

        MapBinder<GameScoreOption, GameScore> mapBinderGameScore = MapBinder.newMapBinder(binder(),
                GameScoreOption.class, GameScore.class);

        mapBinderGameScore.addBinding(GameScoreOption.OriginalScore).to(OriginalScore.class);
        mapBinderGameScore.addBinding(GameScoreOption.PowerScore).to(PowerScore.class);
        mapBinderGameScore.addBinding(GameScoreOption.BonusScore).to(BonusScore.class);
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

    public enum GameScoreOption {
        OriginalScore, PowerScore, BonusScore;
    }
}
