package net.franckbenault.learning.country;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import com.neovisionaries.i18n.CountryCode;

public class CountryListTestCase {
	
	
	private String describeCountry(CountryCode country) {
		return country+ " "+ country.getAlpha3()+ " "+country.getNumeric()+ " "+ country.getName();
	}
	
	@Test
	public void testCountryCollection() {
		
		CountryCode[] countries = CountryCode.values();
		assertNotNull(countries);
		assertTrue(countries.length>100);
		assertTrue(countries.length>250);
		
		for(CountryCode country : countries) {
			System.out.println(describeCountry(country));
		}

	}
	
	@Test
	public void testFindCountryByAlpha3Code() {
		
		CountryCode fr = CountryCode.getByAlpha3Code("FRA");
		assertNotNull(fr);
		System.out.println(describeCountry(fr));	
	
		assertNull(CountryCode.getByAlpha2Code("ZZZ"));
	}
	
	@Test
	public void testFindCountryByAlpha2Code() {
		
		CountryCode fr = CountryCode.getByAlpha2Code("FR");
		assertNotNull(fr);
		System.out.println(describeCountry(fr));	
	
		assertNull(CountryCode.getByAlpha2Code("ZZ"));
	}
	
	@Test
	public void testFindCountryByCode() {
		
		CountryCode fr = CountryCode.getByCode(250);
		assertNotNull(fr);
		System.out.println(describeCountry(fr));	
	
		assertNull(CountryCode.getByCode(999));
	}

}
