package com.kurniawan.sqa;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestingKolamKeliling.class, TestingKolamVolume.class, TestingSuhu.class })
public class AllTests {

}
