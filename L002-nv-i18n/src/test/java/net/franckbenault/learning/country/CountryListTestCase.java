package net.franckbenault.learning.country;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.neovisionaries.i18n.CountryCode;

public class CountryListTestCase {
	
	@Test
	void testCountryCollection() {
		
		CountryCode[] countries = CountryCode.values();
		assertNotNull(countries);
		assertTrue(countries.length>100);
		assertTrue(countries.length>250);
		
		for(CountryCode country : countries) {
			System.out.println(country+ " "+ country.getAlpha3()+ " "+country.getNumeric()+ " "+ country.getName());
		}
	}

}
