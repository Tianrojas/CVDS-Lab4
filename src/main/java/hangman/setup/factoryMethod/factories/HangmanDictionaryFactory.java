package hangman.setup.factoryMethod.factories;

import com.google.inject.ImplementedBy;
import hangman.model.dictionary.HangmanDictionary;

@ImplementedBy(InputHangmanDictionaryFactory.class)
public interface HangmanDictionaryFactory {
	public HangmanDictionary getHangmanDictionary(String value);
}

