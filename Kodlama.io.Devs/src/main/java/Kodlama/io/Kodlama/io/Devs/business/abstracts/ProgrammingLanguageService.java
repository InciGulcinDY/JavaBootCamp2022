package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Subtechnology;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguage> getAll();

	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception;

	public void delete(ProgrammingLanguage programmingLanguage);

	public void update(ProgrammingLanguage programmingLanguage, String newProgrammingLanguage);

	public String findById(ProgrammingLanguage programmingLanguage, int id);
	
	public void addSubtechnology(ProgrammingLanguage programmingLanguage, Subtechnology subtechnology1,Subtechnology subtechnology2);

}
