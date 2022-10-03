package hangman.setup.factoryMethod.factories;

import com.google.inject.ImplementedBy;
import hangman.model.language.Language;

@ImplementedBy(InputLanguageFactory.class)
public interface LanguageFactory {
	public Language getLanguage(String value);
}

