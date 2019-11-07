package edu.mum.cs.waa.starbucks.repository.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import edu.mum.cs.waa.starbucks.domain.Advice;
import edu.mum.cs.waa.starbucks.domain.Roast;
import edu.mum.cs.waa.starbucks.domain.User;

public class Database {
	private static List<User> users = new LinkedList<User>();
	private static List<Advice> advice = new LinkedList<Advice>();
	static {
		users.add(new User("Dave", "111"));
		users.add(new User("Steve", "222"));
		users.add(new User("Ralph", "333"));
		
		// *************************************************************
		advice.add(new Advice(Roast.dark, "Sumatra"));
		advice.add(new Advice(Roast.dark, "Verona"));
		advice.add(new Advice(Roast.dark, "French Roast"));
		advice.add(new Advice(Roast.medium, "Breakfast Blend"));
		advice.add(new Advice(Roast.medium, "Colombia"));
		advice.add(new Advice(Roast.medium, "Yukon"));
		advice.add(new Advice(Roast.medium, "Pike Place"));
		advice.add(new Advice(Roast.medium, "House Blend"));

		advice.add(new Advice(Roast.light, "Willow"));
		advice.add(new Advice(Roast.light, "Aria"));
		advice.add(new Advice(Roast.light, "Bright Sky"));
		advice.add(new Advice(Roast.light, "Veranda"));
	}

	public String getPassword(String name) {
		return users.stream().filter(user -> user.getUsername().equals(name)).findFirst().get().getPassword();
	}

	public List<String> getAdviceByRoast(String roast) {
		return advice.stream().filter(ad -> ad.getRoast().equals(Roast.valueOf(roast))).map(ad -> ad.getName())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		Database data = new Database();
		System.out.print(data.getPassword("Dave"));
	}
}
