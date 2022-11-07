package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLangugeRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Subtechnology;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLangugeRepository programmingLangugeRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLangugeRepository programmingLangugeRepository) {
		super();
		this.programmingLangugeRepository = programmingLangugeRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// Business rules
		return programmingLangugeRepository.findAll();
	}

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage programmingLanguage) throws Exception {
		// Business rule1 : Programming language cannot be blank!
		if (programmingLanguage.getProgrammingLanguage().equals(" ")) {
			throw new Exception("Programming language cannot be blank!");
		}
		// Business rule2 : Programming languages can not be repeated.
		List<ProgrammingLanguage> programmingLanguages2 = programmingLangugeRepository.findAll();

		for (ProgrammingLanguage programmingLanguage2 : programmingLanguages2) {
			if (programmingLanguage2.getProgrammingLanguage().equals(programmingLanguage.getProgrammingLanguage())) {
				throw new Exception("Programming languages can not be repeated!");
			}
		}
		return programmingLangugeRepository.save(programmingLanguage);
	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {
		// Business rules
		programmingLangugeRepository.delete(programmingLanguage);
	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage, String newProgrammingLanguage) {
		// Business rules
		programmingLanguage.setProgrammingLanguage(newProgrammingLanguage);
	}

	@Override
	public String findById(ProgrammingLanguage programmingLanguage, int id) {
		// Business rules
		programmingLangugeRepository.findById(id);
		return programmingLanguage.getProgrammingLanguage();
	}

	@Override
	public void addSubtechnology(ProgrammingLanguage programmingLanguage, Subtechnology subtechnology1,
			Subtechnology subtechnology2) {
		programmingLanguage.setSubtechnology1(subtechnology1);
		programmingLanguage.setSubtechnology2(subtechnology2);
	}

}
