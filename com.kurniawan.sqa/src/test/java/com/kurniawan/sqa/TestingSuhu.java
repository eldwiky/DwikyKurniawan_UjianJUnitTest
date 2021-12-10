package com.kurniawan.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.kurniawan.main.function.KonversiSuhu;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)
public class TestingSuhu {

	KonversiSuhu function;
	@Before
	public void setUp() throws Exception {
	
		function = new KonversiSuhu();
	}

	@After
	public void tearDown() throws Exception {
	}

//	Nomor 1
	@Test
	@FileParameters ("src/test/resources/Skenario_Suhu.csv")
	public void testFarenKeCelci(double suhu, double hasil) {
		assertEquals(hasil, function.FarenKeCelci(suhu), 0.0001);
	}

//	Nomor 2
	@Test
	public void testFarenKeCelciBukanAngka() {
		assertEquals(0, function.FarenKeCelci(Double.parseDouble("f")));
		
	}
	
	
//	Nomor 3
	@Test
	public void testFarenKeCelciAbsolutAngka() {
		assertEquals(-2.222222222, function.FarenKeCelci(Math.abs(28)), 0.0001);
		
	}
	
//	Nomor 4
	@Test
	public void testFarenKeCelciExpected0() {
		assertEquals(0, function.FarenKeCelci(0), 0.0001);
	}
}
