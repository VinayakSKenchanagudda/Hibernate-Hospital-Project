package hospital_project.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import hospital_project.dto.Encounter;
import hospital_project.dto.Med_Orders;

public class MedOrdersDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory eMFEntityManagerFactory = Persistence.createEntityManagerFactory("vinayak");
		return eMFEntityManagerFactory.createEntityManager();

		}

		public void saveMedOrders(Med_Orders medOrder, int  encounter_id) {
		EntityManager eManager = getEntityManager();
		EntityTransaction eTransaction = eManager.getTransaction();
		Encounter getEncounter = eManager.find(Encounter.class, encounter_id);
		medOrder.setEncounter(getEncounter);

		eTransaction.begin();
		eManager.persist(medOrder);
		eTransaction.commit();
		}
		
		public void updateMedOrder(int med_orders_id, String doctor_name) {
			EntityManager eManager = getEntityManager();
			EntityTransaction eTransaction = eManager.getTransaction();
			Med_Orders getMedOrder = eManager.find(Med_Orders.class, med_orders_id);
			if(getMedOrder!=null) {
			getMedOrder.setDoctor(doctor_name);
			eTransaction.begin();

			eManager.merge(getMedOrder);

			eTransaction.commit();
			}
			else
			System.out.println("id not found");
			}

			public void deleteMedOrder(int med_orders_id) {
			EntityManager eManager = getEntityManager();
			EntityTransaction eTransaction = eManager.getTransaction();
			Med_Orders getMedOrder = eManager.find(Med_Orders.class, med_orders_id);
			if(getMedOrder!=null) {
			eTransaction.begin();

			eManager.remove(getMedOrder);

			eTransaction.commit();
			}
			else
			System.out.println("id not found");
			}

			public void getMedOrderById(int med_orders_id) {
			EntityManager eManager = getEntityManager();
			Med_Orders getMedOrder = eManager.find(Med_Orders.class, med_orders_id);
			System.out.println(getMedOrder);
			}
			public List<Med_Orders> getAllMedorders(){
			EntityManager eManager = getEntityManager();
			Query query= eManager.createQuery("select m from Med_orders m");
			List<Med_Orders> list=query.getResultList();
			 return list;


			}

			}

