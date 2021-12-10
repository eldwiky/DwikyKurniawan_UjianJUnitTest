package com.kurniawan.sqa;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.kurniawan.main.function.HitungKolam;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class TestingKolamKeliling {

	HitungKolam function;
	@Before
	public void setUp() throws Exception {
	
		function = new HitungKolam();
	}

	@After
	public void tearDown() throws Exception {
	}
//	Nomor 1
	@Test
	@FileParameters ("src/test/resources/Skenario_Keliling.csv")
	public void testHitungKeliling(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.HitungKeliling(panjang, lebar, tinggi), 0.0001);
	}
	
	
//	Nomor 2
	@Test
	public void testHitungKelilingBukanAngka () {
		assertEquals(0, function.HitungKeliling(Double.parseDouble("a"), Double.parseDouble("b"), Double.parseDouble("c")), 0.0001);
	}
	
	
	
//	Nomor 3
	@Test
	public void testHitungKelilingAngkaAbsolut () {
		assertEquals(82, function.HitungKeliling(Math.abs(-5.5), Math.abs(-12), Math.abs(-3)), 0.0001);
	}

	
//	Nomor 4
	@Test
	public void testHitungKelilingExpected0 () {
		assertEquals(0, function.HitungKeliling(0, 0, 0), 0.0001);
	}
}
