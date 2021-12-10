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
public class TestingKolamVolume {

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
	@FileParameters ("src/test/resources/Skenario_Volume.csv")
	public void testHitungVolume(double panjang, double lebar, double tinggi, double hasil) {
		assertEquals(hasil, function.HitungVolume(panjang, lebar, tinggi), 0.0001);

}
	
//	Nomor 2
	@Test
	public void testHitungVolumeBukanAngka() {
		
		assertEquals(0, function.HitungKeliling(Double.parseDouble("d"), Double.parseDouble("b"), Double.parseDouble("c")), 0.0001);
	}
	
	
//	Nomor 3
	@Test
	public void testHitungVolumeAngkaAbsolut() {
		assertEquals(875, function.HitungVolume(Math.abs(-7), Math.abs(-25), Math.abs(-5)), 0.0001);
	}
	
	
//	Nomor 4
	@Test
	public void testHitungVolumeExpected0() {
		assertEquals(0, function.HitungVolume(0, 0, 0), 0.0001);
	}

}