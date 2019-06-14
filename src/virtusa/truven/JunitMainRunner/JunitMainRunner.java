package virtusa.truven.JunitMainRunner;

import virtusa.truven.junit.Junit;

public class JunitMainRunner {

	public static void main(String[] args) {
		Junit junit=new Junit();
		junit.setId(1);
		junit.setName("Sri Lakshmi");
		junit.setSalary(32000);
		junit.setPhoneNum(9902620462L);
		
		for (String string : args) {
			System.out.println(junit.getId());
			System.out.println(junit.getName());
			System.out.println(junit.getPhoneNum());
			System.out.println(junit.getSalary());
		}
	}
}
