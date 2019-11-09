package edu.mum.cs.waa.starbucks.repository;

import java.util.List;

public interface DataFacade {
	String findPassword(String name);
	List<String> getAdviceByRoast(String roast);
}
