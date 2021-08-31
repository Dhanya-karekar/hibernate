package com.xworkz.hibernate.dryfruits;

public class DryFruitsTester {

	public static void main(String[] args) {
		DryFruitsDTO entity = new DryFruitsDTO(1, "Pista", "RichObites", "India", 560.00,
				"Health and safety Department");

		DryFruitsDAO dao = new DryFruitsDAOimpl();
		dao.save(entity);

	}

}
