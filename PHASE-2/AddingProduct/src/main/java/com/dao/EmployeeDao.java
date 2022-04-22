package com.dao;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.bean.Employee;
import com.resource.DbResource;
public class EmployeeDao {
	public int storeEmployeeDetails(Employee emp) {
		try {
			SessionFactory sf = DbResource.getSessionFactory();
			Session session = sf.openSession();
			Transaction tran = session.getTransaction();
			tran.begin();
					session.save(emp);
			tran.commit();
			return 1;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	public List<Employee> getAllEmployee() {
		SessionFactory sf = DbResource.getSessionFactory();
		Session session = sf.openSession();
		Query<Employee> qry = session.createQuery("select e from Employee e");
		List<Employee> listOfEmp = qry.list();
		return listOfEmp;
	}
}
