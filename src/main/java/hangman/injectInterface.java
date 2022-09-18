package hangman;

import hangman.model.dictionary.HangmanDictionary;
import hangman.model.language.Language;
import hangman.view.hangmanPanel.HangmanPanel;

public interface injectInterface {
	public Language getLanguage();

	public HangmanDictionary getDictionary();

	public HangmanPanel getPanel();
}
