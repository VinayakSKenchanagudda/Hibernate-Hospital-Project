package hospital_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_project.dto.Branch;
import hospital_project.dto.Hospital;

public class BranchDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory eMFEntityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return eMFEntityManagerFactory.createEntityManager();

	}

	public void saveBranche(Branch branch, int hospital_id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Hospital getHospital = eManager.find(Hospital.class, hospital_id);
		if (getHospital != null) {
			branch.setHospital(getHospital);
			eTransaction.begin();
			eManager.merge(branch);
			eTransaction.commit();
		} else {
			System.out.println("hospital not found");
		}

	}

	public void updateBranch(int b_id, String b_name) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch branch = eManager.find(Branch.class, b_id);
		if (branch != null) {

			branch.setBranch_name(b_name);

			eTransaction.begin();

			eManager.merge(branch);

			eTransaction.commit();

		} else {

			System.out.println("Id is not found");

		}

	}

	public void deleteBranch(int b_id) {

		EntityManager eManager = getEntityManager();

		EntityTransaction eTransaction = eManager.getTransaction();

		Branch branch = eManager.find(Branch.class, b_id);

		if (branch != null) {

			eTransaction.begin();

			eManager.remove(branch);

			eTransaction.commit();

		} else {

			System.out.println("Id is not found");

		}

	}

	public void getBranchById(int b_id) {

		EntityManager eManager = getEntityManager();

		Branch branch = eManager.find(Branch.class, b_id);

		if (branch != null) {

			System.out.println(branch);

		} else {

			System.out.println("Id is not found");

		}

	}

	public List<Branch> getAllBranches() {

		EntityManager eManager = getEntityManager();

		Query query = eManager.createQuery("select h from Branch h");

		List<Branch> list1 = query.getResultList();

		return list1;

	}

}
