package net.franckbenault.learning.country;

import java.text.Collator;
import java.util.*;

public class CountryList {
    public static List<Country> getCountries() {
        // A collection to store our country object
        List<Country> countries = new ArrayList<>();

        // Get ISO countries, create Country object and
        // store in the collection.
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            Locale locale = new Locale("en", country);
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            if (!"".equals(iso) && !"".equals(code) && !"".equals(name)) {
                countries.add(new Country(iso, code, name));
            }
        }

        // Sort the country by their name and then display the content
        // of countries collection object.
        countries.sort(new CountryComparator());
        
        return countries;


    }




}
