package hangman.setup.factoryMethod;

import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.language.English;
import hangman.model.language.Language;
import hangman.view.hangmanPanel.HangmanPanel;
import hangman.view.hangmanPanel.HangmanStickmanPanel;

public class HangmanDefaultFactoryMethod extends HangmanFactoryMethod {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public HangmanDictionary createDictionary() {
        return new EnglishDictionaryDataSource();
    }

    @Override
    public HangmanPanel createHangmanPanel() {
        return new HangmanStickmanPanel();
    }
}
