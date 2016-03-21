package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.eNums.eTitle;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		ArrayList<Course>Courses=new ArrayList();
		
		Course Stats= new Course();
		UUID MID=UUID.randomUUID();
		Stats.setCourseID(MID);
		Stats.setCourseName("Math");
		Stats.setGradePoints(4);
		Stats.setMajor(eMajor.BUSINESS);
		
		Course Orgo=new Course();
		UUID OID=UUID.randomUUID();
		Orgo.setCourseID(OID);
		Orgo.setCourseName("Orgo");
		Orgo.setGradePoints(4);
		Stats.setMajor(eMajor.CHEM);
		
		Course Java=new Course();
		UUID JID=UUID.randomUUID();
		Java.setCourseID(JID);
		Java.setCourseName("Orgo");
		Java.setGradePoints(3);
		Java.setMajor(eMajor.COMPSI);
		
		Courses.add(Java);
		Courses.add(Stats);
		Courses.add(Orgo);
		
		ArrayList<Semester>Year=new ArrayList();
		
		Semester Fall=new Semester();
		UUID FID=UUID.randomUUID();
		Fall.setSemesterID(FID);
		Fall.setEndDate(endDate);
		Fall.setStartDate(startDate);
		
		Semester Spring=new Semester();
		UUID SID=UUID.randomUUID();
		Spring.setSemesterID(SID);
		Spring.setEndDate(endDate);
		Spring.setStartDate(startDate);
		
		Year.add(Spring);
		Year.add(Fall);
		
		ArrayList<Section>Sections=new ArrayList();
		
		Section SF=new Section();
		UUID SFID=UUID.randomUUID();
		SF.setCourseID(SFID);
		SF.setRoomID(2);
		SF.setSectionID(UUID.randomUUID());
		SF.setSemesterID(UUID.randomUUID());
		
		Section SS=new Section();
		SS.setCourseID(UUID.randomUUID());
		SS.setRoomID(2);
		SS.setSectionID((UUID.randomUUID()));
		SS.setSemesterID(UUID.randomUUID());
		
		Section OF=new Section();
		OF.setCourseID(UUID.randomUUID());
		OF.setRoomID(3);
		OF.setSectionID((UUID.randomUUID()));
		OF.setSemesterID(UUID.randomUUID());
		Section OS=new Section();
		OS.setCourseID(UUID.randomUUID());
		OS.setRoomID(3);
		OS.setSectionID((UUID.randomUUID()));
		OS.setSemesterID(UUID.randomUUID());
		
		Section JF=new Section();
		JF.setCourseID(UUID.randomUUID());
		JF.setRoomID(4);
		JF.setSectionID((UUID.randomUUID()));
		JF.setSemesterID(UUID.randomUUID());
		
		Section JS=new Section();
		JS.setCourseID(UUID.randomUUID());
		JS.setRoomID(4);
		JS.setSectionID((UUID.randomUUID()));
		JS.setSemesterID(UUID.randomUUID());
		
		Sections.add(JS);
		Sections.add(JF);
		Sections.add(OF);
		Sections.add(OS);
		Sections.add(SS);
		Sections.add(SF);
		
		
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}