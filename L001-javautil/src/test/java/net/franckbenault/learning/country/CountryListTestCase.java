package net.franckbenault.learning.country;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class CountryListTestCase {

	@Test
	void testCountryCollection() {
		List<Country> countries = CountryList.getCountries();
		assertNotNull(countries);
		assertTrue(countries.size()>100);
		assertTrue(countries.size()<250);
		
		countries.stream().forEach(s -> System.out.println(s));
	
	}

}
