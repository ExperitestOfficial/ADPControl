package com.experitest.adp;

import java.io.FileReader;
import java.util.Properties;

import org.junit.Test;

public class ADPControlTest {
	
	@Test
	public void resetPort() throws Exception {
		Properties props = new Properties();
		FileReader fr = new FileReader("unit.properties");
		props.load(fr);
		fr.close();
		new ADPControl(props.getProperty("url"), props.getProperty("username"), props.getProperty("password")).resetPort(2);
	}
}
