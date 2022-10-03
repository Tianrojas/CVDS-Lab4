package hangman.setup.factoryMethod;

import com.google.inject.Inject;
import hangman.model.gameScore.GameScore;
import hangman.model.language.Language;
import hangman.model.dictionary.HangmanDictionary;
import hangman.view.hangmanPanel.HangmanPanel;
import hangman.setup.factoryMethod.factories.*;


public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Inject
    private LanguageFactory lanFact;

    @Inject
    private HangmanDictionaryFactory dictFact;

    @Inject
    private HangmanPanelFactory panlFact;

    @Inject
    private GameScoreFactory scoreFactory;

    @Override
    public Language createLanguage() {
        return lanFact.getLanguage("FR");
    }

    @Override
    public HangmanDictionary createDictionary() { return dictFact.getHangmanDictionary("SD");}

    @Override
    public HangmanPanel createHangmanPanel() {
        return panlFact.getHagnmanPanel("CP");
    }

    @Override
    public GameScore createHangmanScore() {
        return scoreFactory.getGameScore("QS");
    }
}
