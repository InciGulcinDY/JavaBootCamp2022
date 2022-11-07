package Kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Kodlama.io.Kodlama.io.Devs.business.abstracts.SubtechnologyService;
import Kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.SubtechnologyRepository;
import Kodlama.io.Kodlama.io.Devs.entities.concretes.Subtechnology;

public class SubtechnologyManager implements SubtechnologyService {
	SubtechnologyRepository subtechnologyRepository;

	@Autowired
	public SubtechnologyManager(SubtechnologyRepository subtechnologyRepository) {
		super();
		this.subtechnologyRepository = subtechnologyRepository;
	}

	@Override
	public List<Subtechnology> getAll() {
		return subtechnologyRepository.findAll();
	}

	@Override
	public Subtechnology add(Subtechnology subtechnology) throws Exception {
		// Business Rule1:Subtechnology can not be repeated.
		List<Subtechnology> subtechnology2 = subtechnologyRepository.findAll();
		for (Subtechnology subtechnology3 : subtechnology2) {
			if (subtechnology3.getSubtechnology().equals(subtechnology.getSubtechnology())) {
				throw new Exception("Subtechnology can not be repeated");
			}
		}
		return subtechnologyRepository.save(subtechnology);

	}

	@Override
	public void delete(Subtechnology subtechnology) {
		subtechnologyRepository.delete(subtechnology);
	}

	@Override
	public void update(Subtechnology subtechnology, String newSubtechnology) {
		subtechnology.setSubtechnology(newSubtechnology);

	}

}
