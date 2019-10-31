package edu.mum.cs.waa.starbucks.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.mum.cs.waa.starbucks.repository.DataFacade;

@Repository
public class InMemoryDataFacadeImpl implements DataFacade {
	
	private static final Database data = new Database();

	public String findPassword(String name) {
		String expectedPassword = data.getPassword(name);
		return expectedPassword;
	}

	public List<String> getAdviceByRoast(String roast) {
		return data.getAdviceByRoast(roast);
	}
}
