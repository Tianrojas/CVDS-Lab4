package hangman.setup.factoryMethod;

import hangman.model.dictionary.HangmanDictionary;
import hangman.model.language.Language;
import hangman.view.hangmanPanel.HangmanPanel;

abstract public class HangmanFactoryMethod {
    abstract public Language createLanguage();
    abstract public HangmanDictionary createDictionary();
    abstract public HangmanPanel createHangmanPanel();
}
