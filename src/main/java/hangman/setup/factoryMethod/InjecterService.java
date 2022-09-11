package hangman.setup.factoryMethod;

import com.google.inject.Inject;

import hangman.model.dictionary.HangmanDictionary;
import hangman.model.language.Language;
import hangman.setup.guice.factories.*;
import hangman.view.hangmanPanel.HangmanPanel;

public class InjecterService extends HangmanFactoryMethod {
	
	@Inject
	private LanguageFactory lanFact;
	@Inject
	private HangmanDictionaryFactory hanDict;
	@Inject
	private InputHangmanPanelFactory hanPanl;
	
	@Override
	public Language createLanguage() {
		return lanFact.getLanguage("FR");
	}

	@Override
	public HangmanDictionary createDictionary() {
		return hanDict.getHangmanDictionary("FD");
	}

	@Override
	public HangmanPanel createHangmanPanel() {
		return hanPanl.getHagnmanPanel("CP");
	}
	
}
