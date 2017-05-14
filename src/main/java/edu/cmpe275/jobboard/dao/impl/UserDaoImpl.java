/**
 * 
 */
package edu.cmpe275.jobboard.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.cmpe275.jobboard.dao.UserDao;

/**
 * @author amayd
 *
 */
@Repository
@Transactional
@Service
public class UserDaoImpl implements UserDao {
	@PersistenceContext
	private EntityManager entityManager;
}
