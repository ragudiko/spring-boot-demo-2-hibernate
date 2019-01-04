package com.sb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sb.model.Blogger;

@Repository
@Transactional
public class BloggerDao {
	
//	@Autowired
//    private SessionFactory sessionFactory;
	
	
	
	@PersistenceContext
	private EntityManager em;

//	private Session getSession() {
//        return sessionFactory.getCurrentSession();
//    }

//    public String saveBlogger(Blogger blogger) {
//        Long isSuccess = (Long)getSession().save(blogger);
//        if(isSuccess >= 1){
//            return "Success";
//        }else{
//            return "Error while crteating new Blogger";
//        }
//        
//    }
//
//    public boolean delete(Blogger blogger) {
//        getSession().delete(blogger);
//        return true;
//    }
	
	public void save(Blogger blogger) {
	      em.persist(blogger);
	   }
	
	public boolean delete(Blogger blogger) {
		em.remove(blogger);
		return true;
	}

    @SuppressWarnings("unchecked")
    public List findAll() {
    	CriteriaQuery<Blogger> criteriaQuery = em.getCriteriaBuilder().createQuery(Blogger.class);
        @SuppressWarnings("unused")
        Root<Blogger> root = criteriaQuery.from(Blogger.class);
        return em.createQuery(criteriaQuery).getResultList();
    }
    
    /* Named Query */
    
//	Session session = sessionFactory.openSession();
//	List<Blogger> bloggerList = null;
//
//	@SuppressWarnings("rawtypes")
//	public List<Blogger> findAll() {
//
//		try {
//			session.beginTransaction();
//			Query query = session.getNamedQuery("findAll");
//			
//			//List list = Arrays.asList(namedQueryRepository.getResultSetMappingDefinition("findAll").getQueryReturns()); 
//			bloggerList = query.list();
//		} catch (HibernateException e) {
//				e.printStackTrace();
//				} finally {
//				session.close();
//		}
//		return bloggerList;
//	}
//
//	public List<Blogger> findById(long bloggerid) {
//		try {
//			session.beginTransaction();
//			Query query = session.getNamedQuery("findByBloggerId");
//			
//			//List list = Arrays.asList(namedQueryRepository.getResultSetMappingDefinition("findAll").getQueryReturns()); 
//			bloggerList = query.list();
//		} catch (HibernateException e) {
//				e.printStackTrace();
//				} finally {
//				session.close();
//		}
//		return bloggerList;
//	}
//
//	public List<Blogger> findByLastName(String lastName) {
//		try {
//			session.beginTransaction();
//			Query query = session.getNamedQuery("findByLastName");
//			
//			//List list = Arrays.asList(namedQueryRepository.getResultSetMappingDefinition("findAll").getQueryReturns()); 
//			bloggerList = query.list();
//		} catch (HibernateException e) {
//				e.printStackTrace();
//				} finally {
//				session.close();
//		}
//		return bloggerList;
//	}
//
//	@SuppressWarnings("deprecation")
//	public void save(Blogger blogger) {
//		try {
//			session.beginTransaction();
//			Query query = session.createNativeQuery("INSERT INTO BLOGGER (FIRSTNAME, LASTNAME) VALUES (:firstName, :lastName);");
//			query.setParameter("firstName","IBM");
//			query.setParameter("lastName", "India");
//			query.executeUpdate();
//		} catch (HibernateException e) {
//				e.printStackTrace();
//				} finally {
//				session.close();
//		}
//		
//	}
	
	

}
