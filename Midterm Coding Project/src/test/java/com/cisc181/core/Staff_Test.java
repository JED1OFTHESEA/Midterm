package com.cisc181.core;

import static org.junit.Assert.*;
import com.cisc181.eNums.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setup() {

	}
	
	@Test
	public void test() throws PersonException {
		final eTitle MRS = null;
		Staff Stacy=new Staff(MRS);
		Stacy.setAddress("Narnia");
		Stacy.setEmail("stacymail");
		Stacy.setFirstName("Stacy");
		Stacy.setHire(null);
		Stacy.setLastName("Smith");
		Stacy.setMiddleName("Sally");
		Stacy.setOffice("Here");
		Stacy.setPhone("222-222-2222");
		Stacy.setSalary(40000);
		Stacy.setTitle(MRS);
		
		final eTitle MR = null;
		Staff John=new Staff(MR);
		John.setAddress("Tatooine");
		John.setEmail("johnmail");
		John.setFirstName("John");
		John.setHire(null);
		John.setLastName("Smith");
		John.setMiddleName("Johnny");
		John.setOffice("There");
		John.setPhone("322-222-2222");
		John.setSalary(30000);
		John.setTitle(MR);
		
		Staff Sue=new Staff(MRS);
		Sue.setAddress("Neverland");
		Sue.setEmail("suemail");
		Sue.setFirstName("Sue");
		Sue.setHire(null);
		Sue.setLastName("Smith");
		Sue.setMiddleName("Sally");
		Sue.setOffice("Everywhere");
		Sue.setPhone("422-222-2222");
		Sue.setSalary(45000);
		Sue.setTitle(MRS);
		
		Staff Joe=new Staff(MR);
		Joe.setAddress("UD");
		Joe.setEmail("joemail");
		Joe.setFirstName("Joe");
		Joe.setHire(null);
		Joe.setLastName("Smith");
		Joe.setMiddleName("Joseph");
		Joe.setOffice("Nowhere");
		Joe.setPhone("522-222-2222");
		Joe.setSalary(40000);
		Joe.setTitle(MR);
		
		final eTitle MS = null;
		Staff Lucy=new Staff(MS);
		Lucy.setAddress("Wonderland");
		Lucy.setEmail("lucymail");
		Lucy.setFirstName("Lucy");
		Lucy.setHire(null);
		Lucy.setLastName("Smith");
		Lucy.setMiddleName("Judy");
		Lucy.setOffice("None");
		Lucy.setPhone("62-222-2222");
		Lucy.setSalary(35000);
		Lucy.setTitle(MS);
		
		ArrayList<Staff>StaffList= new ArrayList();
		StaffList.add(Stacy);
		StaffList.add(John);
		StaffList.add(Sue);
		StaffList.add(Joe);
		StaffList.add(Lucy);
		
		double Average=(Lucy.getSalary()+Joe.getSalary()+Sue.getSalary()+John.getSalary()+Stacy.getSalary())/5;
		
		assertEquals(Average,38000);
	}	
	
}
