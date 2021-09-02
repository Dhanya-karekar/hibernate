package com.xworkz.hibernate.camera.tester;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hibernate.camera.dao.CameraDAO;
import com.xworkz.hibernate.camera.dao.CameraDAOimpl;
import com.xworkz.hibernate.camera.entity.CameraEntity;

public class CameraTester {

	public static void main(String[] args) {

		CameraEntity entity1 = new CameraEntity(11, 100000d, 3, 10, true, "dslr", "Indonesia", 900.00f, true, "Auto");
		CameraEntity entity2 = new CameraEntity(9, 75000d, 2, 7, true, "slr", "India", 700.00f, true, "Manual");

		List<CameraEntity> cam = new ArrayList<CameraEntity>();

		CameraDAO dao = new CameraDAOimpl();

		System.out.println("save");
		dao.save(entity1);

		System.out.println("saveList:");
		cam.add(entity2);
		for (CameraEntity cameraEntity : cam) {
			System.out.println(cam);
		}

		System.out.println("read");
		dao.readbyID(11);
		System.out.println(entity1);

		System.out.println("update");
		dao.updatebytypeById(9, "Lens");

		System.out.println("delete");
		dao.deleteById(11);

		List<Integer> id = new ArrayList<Integer>();
		System.out.println("delete list");
		id.add(1);
		id.add(2);
		dao.deleteList(id);

	}
}