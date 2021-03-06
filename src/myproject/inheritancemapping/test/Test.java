package myproject.inheritancemapping.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import myproject.inheritancemapping.entity.Customer;
import myproject.inheritancemapping.entity.Employee;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction tx = null;
		
		try {
			Configuration cfg = new Configuration();
			cfg.configure("/myproject/inheritancemapping/resources/hibernate.cfg.xml");
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
			builder = builder.applySettings(cfg.getProperties());
			StandardServiceRegistry registry = builder.build();
			sessionFactory = cfg.buildSessionFactory(registry);
			session = sessionFactory.openSession();
//			tx = session.beginTransaction();
//			
//			Employee emp = new Employee();
//			emp.setPname("AAA");
//			emp.setPaddr("IND");
//			emp.setEid("E-111");
//			emp.setEsal(4000);
//			
//			Customer cust = new Customer();
//			cust.setPname("BBB");
//			cust.setPaddr("BPL");
//			cust.setCid("C-111");
//			cust.setCmobile("7458");
//			
//			String epk = (String) session.save(emp);
//			String cpk  =(String) session.save(cust);
//			
//			System.out.println(epk+" : Employee Pk");
//			System.out.println(cpk +" : Customer Pk");
//			
//			tx.commit();
			
			Employee emp = (Employee)session.get(Employee.class, "AAA");
			System.out.println("---------------------------------Employee Details----------------------------------------------");
			System.out.println(emp.getPname());
			System.out.println(emp.getPaddr());
			System.out.println(emp.getEid());
			System.out.println(emp.getEsal());
			System.out.println("---------------------------------Customer Details-----------------------------------------------");
			Customer cust = (Customer) session.get(Customer.class, "BBB");
			System.out.println(cust.getPname());
			System.out.println(cust.getPaddr());
			System.out.println(cust.getCid());
			System.out.println(cust.getCmobile());
			
			
		}catch (Exception e) {
//			tx.rollback();
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
		
		
	}
}
