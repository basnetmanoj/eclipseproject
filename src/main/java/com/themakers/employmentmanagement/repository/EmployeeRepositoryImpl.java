package com.themakers.employmentmanagement.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.themakers.employmentmanagement.model.Employee;
import com.themakers.employmentmanagement.util.HibernateUtil;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	private final SessionFactory sessionFactory;
	
	@Autowired
	 public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		
	}
	@Override
	public void saveEmployee(Employee employee) {
		HibernateUtil.getSession(sessionFactory).save(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		HibernateUtil.getSession(sessionFactory).update(employee);
		
	}

	@Override
	public void deleteEmployee(int id) {
		Employee employee = get_All_Info_ById(id);
		if(employee !=null) {
			HibernateUtil.getSession(sessionFactory).delete(employee);
		}
		
	}

	@Override
	public Employee get_All_Info_ById(int id) {
		return (Employee) HibernateUtil.getSession(sessionFactory).get(Employee.class, id);
	}

	@Override
	public List<Employee> get_All_Info() {
		Session session = HibernateUtil.getSession(sessionFactory);
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
	}

}
