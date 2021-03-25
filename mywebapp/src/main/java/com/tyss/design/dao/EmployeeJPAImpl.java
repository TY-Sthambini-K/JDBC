package com.tyss.design.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.tyss.design.dto.EmployeeInfo;

public class EmployeeJPAImpl {

	public EmployeeInfo getDetailsFromId(int eid) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manager = factory.createEntityManager();
        EmployeeInfo record = manager.find(EmployeeInfo.class,eid);
        if(record!=null) {
//        	
        }else {
        	return null;
        }
		return record;
	}

	public boolean deleteByEmployeeId(int eid) {
		EntityManager manager = null;
		EntityTransaction tx = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		try {
			manager = factory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			EmployeeInfo employee = manager.find(EmployeeInfo.class, eid);
			manager.remove(employee);
			tx.commit();
			if (employee != null) {
				return true;
			} else {
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		manager.close();
		return false;
			}
		

	public boolean createEmployeeDetail(EmployeeInfo employee) {
		boolean status = false;

		EntityManager manager = null;
		EntityTransaction transaction = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");

		try {
			manager = factory.createEntityManager();
			transaction = manager.getTransaction();
			transaction.begin();
			manager.persist(employee);
			transaction.commit();
			System.out.println("Record Inserted");
			status = true;
		} catch (Exception e) {
			transaction.rollback(); // rollback if any exception
			status = false;
			e.printStackTrace();
		}

		manager.close();

		return status;
	}


	public boolean updateEmployeeDetail(EmployeeInfo info) {
		// TODO Auto-generated method stub
		EntityManager manager = null;
		EntityTransaction tx = null;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");

		try {
			manager = factory.createEntityManager();
			tx = manager.getTransaction();
			tx.begin();
			EmployeeInfo employeePrimaryInfo = manager.find(EmployeeInfo.class,info.getEid());
			employeePrimaryInfo.setName(info.getName());
			tx.commit();
			return true;
		}catch(

	Exception e)
	{
		e.printStackTrace();
		tx.rollback();
	}manager.close();
	return false;
	}
		

	public List<EmployeeInfo> getAllEmployeeDetails() {
		// TODO Auto-generated method stub
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
//		EntityManager manager = factory.createEntityManager();
//		String jpql = "select s from EmployeeInfo s";
//		Query query = manager.createQuery(jpql);
//		List<EmployeeInfo> emp = query.getResultList();
//		return emp;
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager manger = factory.createEntityManager();
		String jpql = "select e from EmployeeInfo e";
		Query qry = manger.createQuery(jpql);
		List<EmployeeInfo> employees = qry.getResultList();
		return employees;
	}

}
