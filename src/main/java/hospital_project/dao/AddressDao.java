package hospital_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_project.dto.Address;
import hospital_project.dto.Branch;
import hospital_project.dto.Hospital;

public class AddressDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory eMFEntityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return eMFEntityManagerFactory.createEntityManager();

	}

	public void saveAddress(Address address, int branch_id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Branch getbranch = eManager.find(Branch.class, branch_id);
		if (getbranch != null) {
			address.setBranch(getbranch);
			eTransaction.begin();
			eManager.merge(address);
			eTransaction.commit();
		} else {
			System.out.println("branch not found");
		}

	}

	public void updateAddress(int a_id, String a_address) {

		EntityManager eManager = getEntityManager();

		EntityTransaction eTransaction = eManager.getTransaction();

		Address address = eManager.find(Address.class, a_id);

		if (address != null) {

			address.setAddress(a_address);

			eTransaction.begin();

			eManager.merge(address);

			eTransaction.commit();

		} else {

			System.out.println("Id is not found");

		}

	}

	public void deleteAddress(int a_id) {

		EntityManager eManager = getEntityManager();

		EntityTransaction eTransaction = eManager.getTransaction();

		Address address = eManager.find(Address.class, a_id);

		if (address != null) {

			eTransaction.begin();

			eManager.remove(address);

			eTransaction.commit();

		} else {

			System.out.println("Id is not found");

		}

	}

	public void getAddressById(int a_id) {

		EntityManager eManager = getEntityManager();

		Address address = eManager.find(Address.class, a_id);

		if (address != null) {

			System.out.println(address);

		} else {

			System.out.println("Id is not found");

		}

	}

	public List<Address> getAllAddress() {

		EntityManager eManager = getEntityManager();

		Query query = eManager.createQuery("select h from Address h");

		List<Address> list1 = query.getResultList();

		return list1;

	}
}
