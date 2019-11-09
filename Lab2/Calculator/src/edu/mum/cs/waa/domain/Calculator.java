package edu.mum.cs.waa.domain;

import java.io.Serializable;

public class Calculator implements Serializable {
	private static final long serialVersionUID = 748392348L;
	private Integer add1;
	
	private Integer add2;
	
	private Integer mult1;
	
	private Integer mult2;
	
	public Calculator() {
		super();
	}
	
	public Calculator(Integer add1, Integer add2, Integer mult1, Integer mult2) {
		super();
		this.add1 = add1;
		this.add2 = add2;
		this.mult1 = mult1;
		this.mult2 = mult2;
	}
		
	public Integer getSum() {
		return this.add1 + this.add2;
	}
	
	public Integer getProduct() {
		return this.mult1 * this.mult2;
	}

	public Integer getAdd1() {
		return add1;
	}

	public void setAdd1(Integer add1) {
		this.add1 = add1;
	}

	public Integer getAdd2() {
		return add2;
	}

	public void setAdd2(Integer add2) {
		this.add2 = add2;
	}

	public Integer getMult1() {
		return mult1;
	}

	public void setMult1(Integer mult1) {
		this.mult1 = mult1;
	}

	public Integer getMult2() {
		return mult2;
	}

	public void setMult2(Integer mult2) {
		this.mult2 = mult2;
	}
}
