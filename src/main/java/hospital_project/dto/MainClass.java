package hospital_project.dto;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//
//public class MainClass {
//public static void main(String[] args) {
//	Hospital hospital=new Hospital();
//	hospital.setHospital_id(2);
//	hospital.setHospital_name("applo");
//	hospital.setGst("hos123");
//	
//	Branch branch1=new Branch();
//	branch1.setBranch_id(104);
//	branch1.setBranch_name("Applomar");
//	branch1.setPhoneno(23415678);
////	
//	Branch branch2=new Branch();
//	branch2.setBranch_id(105);
//	branch2.setBranch_name("Applotcpalya");
//	branch2.setPhoneno(3415678);
//	
//	Branch branch3=new Branch();
//	branch3.setBranch_id(106);
//	branch3.setBranch_name("ApploKrpuram");
//	branch3.setPhoneno(415678);
//	
//	Address address1=new Address();
//	address1.setAddress_id(2001);
//	address1.setAddress("marathale");
//	
//	Address address2=new Address();
//	address2.setAddress_id(2002);
//	address2.setAddress("Tc palya");
//	
//	Address address3=new Address();
//	address3.setAddress_id(2003);
//	address3.setAddress("Krpuram");
//	
//	branch1.setAddress(address1);
//	branch2.setAddress(address2);
//	branch3.setAddress(address3);
//	
//	List<Branch> branchs=new ArrayList<Branch>();
//	branchs.add(branch1);
//	branchs.add(branch2);
//	branchs.add(branch3);
////	
//	hospital.setBranch(branchs);
////	
//	Person person=new Person();
//	person.setPerson_id(401);
//	person.setPerson_name("smith");
//	person.setPerson_address("banglore");
//	person.setPerson_contact_number(45673);
//	
//	Encounter encounter=new Encounter();
//	encounter.setEncounter_id(501);
//	encounter.setReason("kidney stone");
////	
//	List<Encounter> encounters=new ArrayList<Encounter>();
//	encounters.add(encounter);
////	
//	person.setEncounter(encounters);
////	
//	Branch branch2=new Branch();
//	branch2.setBranch_id(205);
//	branch2.setBranch_name("Applotcpalya");
//	branch2.setPhoneno(3415678); 
////	
//	encounter.setBranch(branch2);
//	Med_Orders med_Orders=new Med_Orders();
//	med_Orders.setMed_orders_id(10001);
//	
//	List<Med_Orders> med_OrdersList=new ArrayList<Med_Orders>();
//	med_OrdersList.add(med_Orders);
////	
//	encounter.setMed_orders(med_OrdersList);
////	
//	Med_Items med_Items1=new Med_Items();
//	med_Items1.setMed_item_id(2002);
//	med_Items1.setMed_item_name("Tablets");
//	med_Items1.setMed_item_price(100);
//	
//	Med_Items med_Items2=new Med_Items();
//	med_Items2.setMed_item_id(2003);
//	med_Items2.setMed_item_name("tonic");
//	med_Items2.setMed_item_price(200);
////	
//	List<Med_Items> med_ItemsList=new ArrayList<Med_Items>();
//	med_ItemsList.add(med_Items1);
//	med_ItemsList.add(med_Items2);
//	
//	med_Orders.setMed_items(med_ItemsList);
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinayak");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
////	entityManager.persist(hospital);
////	entityManager.persist(branch1);
////	entityManager.persist(branch2);
////	entityManager.persist(branch3);
////	entityManager.persist(address1);
////	entityManager.persist(address2);
////	entityManager.persist(address3);
//	entityManager.persist(person);
////	entityManager.persist(encounter);
////	entityManager.persist(med_Orders);
////	entityManager.persist(med_Items1);
////	entityManager.persist(med_Items2);
//	entityTransaction.commit();
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinayak");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	Person person=entityManager.find(Person.class, 401);
//	System.out.println(person);
//} 
//}
















