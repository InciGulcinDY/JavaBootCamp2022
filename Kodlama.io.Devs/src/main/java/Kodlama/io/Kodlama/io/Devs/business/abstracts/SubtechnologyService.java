package Kodlama.io.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Kodlama.io.Devs.entities.concretes.Subtechnology;

public interface SubtechnologyService {
	List<Subtechnology> getAll();

	public Subtechnology add(Subtechnology subtechnology) throws Exception;

	public void delete(Subtechnology subtechnology);

	public void update(Subtechnology subtechnology, String newSubtechnology);

}
