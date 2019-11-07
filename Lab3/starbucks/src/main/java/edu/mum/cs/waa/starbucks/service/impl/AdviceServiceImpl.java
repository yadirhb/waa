package edu.mum.cs.waa.starbucks.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.waa.starbucks.domain.Roast;
import edu.mum.cs.waa.starbucks.repository.DataFacade;
import edu.mum.cs.waa.starbucks.service.AdviceService;

/**
 * @author yadir
 *
 */
@Service
public class AdviceServiceImpl implements AdviceService {

	@Autowired
	DataFacade repository;

	@Override
	public List<String> getAdvicesByRoast(Roast roast) {
		return repository.getAdviceByRoast(roast.toString());
	}

}
