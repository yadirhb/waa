package edu.mum.cs.waa.starbucks.service;

import java.util.List;

import edu.mum.cs.waa.starbucks.domain.Roast;

public interface AdviceService {
	List<String> getAdvicesByRoast(Roast roast);
}
