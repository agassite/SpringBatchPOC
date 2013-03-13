package ideo.springbatch.poc;

import org.springframework.batch.item.ItemProcessor;

/**
 * Processor du batch, qui va implementer les règles de gestion
 * @author trainee
 *
 */
public class PersonProcessor implements ItemProcessor<Personne, Personne>{

	public Personne process(final Personne personneInput) throws Exception {
		//si la civilite a la valeur M la personne sera ecrite en base sinon on la  rejette
		if ("M".equals(personneInput.getCivilite())) {
			return personneInput;
		}
		return null;
	}
}
