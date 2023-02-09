//package hospital_project.controller;
//
//import java.util.Scanner;
//
//import hospital_project.dao.AddressDao;
//import hospital_project.dao.BranchDao;
//import hospital_project.dao.EncounterDao;
//import hospital_project.dao.HospitalDeo;
//import hospital_project.dao.MedItemsDao;
//import hospital_project.dao.MedOrdersDao;
//import hospital_project.dao.PersonDao;
//import hospital_project.dto.Address;
//import hospital_project.dto.Branch;
//import hospital_project.dto.Encounter;
//import hospital_project.dto.Hospital;
//import hospital_project.dto.Med_Items;
//import hospital_project.dto.Med_Orders;
//import hospital_project.dto.Person;
//
//public class MainClassHospital {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		HospitalDeo hDao = new HospitalDeo();
//		BranchDao bDao = new BranchDao();
//		AddressDao aDao = new AddressDao();
//		PersonDao personDao = new PersonDao();
//		EncounterDao encounterDao = new EncounterDao();
//		MedOrdersDao medOrdersDao = new MedOrdersDao();
//		MedItemsDao medItemsDao = new MedItemsDao();
//		boolean repeat = true;
//		while (repeat!=false) {
//			System.out.println(
//					"Enter Deatails for \n 1.Hospital \n 2.Branch \n 3.Address \n 4.Person \n 5.Encounter \n 6.MedOrders \n 7.MedItems \n 8.Exit ");
//			int choice = scanner.nextInt();
//			switch (choice) {
//			case 1: {
//				System.out.println("Enter hospital name");
//				String hospital_name = scanner.next();
//				System.out.println("Enter gst number");
//				String hopital_gst = scanner.next();
//				Hospital hospital = new Hospital();
//				hospital.setHospital_name(hospital_name);
//				hospital.setGst(hopital_gst);
//				hDao.saveHospital(hospital);
//			}
//				break;// case1
//			case 2: {
//				System.out.println("Enter branch name");
//				String branch_name = scanner.next();
//				System.out.println("Enter phone number");
//				long phone = scanner.nextLong();
//				System.out.println("Enter the hospital id");
//				int hospital_id = scanner.nextInt();
//				Branch branch = new Branch();
//				branch.setBranch_name(branch_name);
//				branch.setPhoneno(phone);
//				bDao.saveBranche(branch, hospital_id);
//			}
//				break;// case2
//			case 3: {
//				System.out.println("Enter branch address");
//				String branch_address = scanner.next();
//				System.out.println("Enter branch id");
//				int branch_id = scanner.nextInt();
//				Address address = new Address();
//				address.setAddress(branch_address);
//				aDao.saveAddress(address, branch_id);
//			}
//				break;// case3
//			case 4: {
//				System.out.println("Enter the Person name");
//				String name = scanner.next();
//				System.out.println("Enter the Person address");
//				String address = scanner.next();
//				System.out.println("Enter the Person contact number");
//				Long contact = scanner.nextLong();
//				Person person = new Person();
//				person.setPerson_name(name);
//				person.setPerson_address(address);
//				person.setPerson_contact_number(contact);
//				personDao.savePerson(person);
//			}
//				break;// case4
//			case 5: {
//				System.out.println("enter reason: ");
//				String reason = scanner.next();
//				System.out.println("enter branch id ");
//				int branch_id = scanner.nextInt();
//				System.out.println("enter person id: ");
//				int person_id = scanner.nextInt();
//				Encounter encounter=new Encounter();
//				encounter.setReason(reason);
//				encounterDao.saveEncounter(person_id, branch_id, encounter);
//			}
//				break;// case5
//			case 6: {
//				 System.out.println("enter the doctor name:");
//                 String name=scanner.next();
//                 System.out.println("enter the encounter id");
//                 int encounter_id=scanner.nextInt();
//                 Med_Orders med_Orders=new Med_Orders();
//                 med_Orders.setDoctor(name);
//                 medOrdersDao.saveMedOrders(med_Orders, encounter_id);
//			}
//				break;// case6
//			case 7: {
//				System.out.println("Enter the med_item name");
//                String name = scanner.next();
//                System.out.println("Enter the med_item price");
//                double price = scanner.nextDouble();
//                System.out.println("Enter the med_Oders id");
//                int m_id = scanner.nextInt();
//                Med_Items med_Items=new Med_Items();
//                med_Items.setMed_item_name(name);
//                med_Items.setMed_item_price(price);
//                medItemsDao.saveMedItems(med_Items, m_id);
//                
//			}
//				break;// case7
//			case 8: {
//				repeat =false;
//			}
//				break;// case8
//			default: {
//				System.out.println("enter valid password");
//			}
//				break;
//			}
//		}
//	}
//}
