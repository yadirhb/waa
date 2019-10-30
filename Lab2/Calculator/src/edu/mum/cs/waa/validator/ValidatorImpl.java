package edu.mum.cs.waa.validator;

import java.util.ArrayList;
import java.util.List;

import edu.mum.cs.waa.domain.Calculator;

public class ValidatorImpl implements Validator {

	@Override
	public List<String> validate(Object obj) {
		List<String> errors = new ArrayList<String>();
		
		Calculator model = (Calculator) obj;

		if (model.getAdd1() == null) {
			errors.add("Number 1 must have a value");
		}
		
		if (model.getAdd2() == null) {
			errors.add("Number 2 must have a value");
		}
		
		if (model.getMult1() == null) {
			errors.add("Number 3 must have a value");
		}
		
		if (model.getMult2() == null) {
			errors.add("Number 4 must have a value");
		}
		
		return errors;
	}

}
