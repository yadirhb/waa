/**
 * 
 */
package edu.mum.cs.waa.starbucks.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.waa.starbucks.repository.DataFacade;
import edu.mum.cs.waa.starbucks.service.UserService;

/**
 * @author yadir
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	DataFacade repository;
	
	@Override
	public String findPassword(String username) {
		return repository.findPassword(username);
	}
}
