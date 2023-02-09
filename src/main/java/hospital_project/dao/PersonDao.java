package hospital_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_project.dto.Person;

public class PersonDao {

	public EntityManager getEntityManager() {
		EntityManagerFactory eMFEntityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return eMFEntityManagerFactory.createEntityManager();

	}

	public void savePerson(Person person) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		eTransaction.begin();
		eManager.persist(person);
		eTransaction.commit();
		
	}

	public void updatePerson(String name,int id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Person person = eManager.find(Person.class, id);
		person.setPerson_name(name);
		eTransaction.begin();
		eManager.merge(person);
		eTransaction.commit();

	}

	public void deletePerson(int id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Person person = eManager.find(Person.class, id);
		eTransaction.begin();
		eManager.remove(person);
		eTransaction.commit();

	}

	public void getPersonById(int id) {
		EntityManager eManager = getEntityManager();
		Person person = eManager.find(Person.class, id);
		System.out.println(person);

	}

	public List<Person> getAllPerson() {
		EntityManager eManager = getEntityManager();
		Query query = eManager.createQuery("select p from Person p");
		List<Person> list1 = query.getResultList();
		return list1;

	}

}
