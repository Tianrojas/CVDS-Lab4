package hangman;

import com.google.inject.Inject;

import hangman.model.dictionary.HangmanDictionary;
import hangman.model.language.Language;
import hangman.setup.guice.factories.*;
import hangman.view.hangmanPanel.HangmanPanel;

public class injectorFabric implements injectInterface {

	@Inject
	private HangmanDictionaryFactory dictFact;
	@Inject
	private HangmanPanelFactory panlFact;
	@Inject
	private LanguageFactory langFact;

	private HangmanDictionary dict;
	private HangmanPanel panl;
	private Language lang;

	public injectorFabric() {
		this.dict = dictFact.getHangmanDictionary("FD");
		this.panl = panlFact.getHagnmanPanel("WP");
		this.lang = langFact.getLanguage("FR");
	}

	public Language getLanguage() {
		return lang;
	}

	public HangmanDictionary getDictionary() {
		return dict;
	}

	public HangmanPanel getPanel() {
		return panl;
	}
}
