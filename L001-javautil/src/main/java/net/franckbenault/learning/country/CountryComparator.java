package net.franckbenault.learning.country;

import java.text.Collator;
import java.util.Comparator;

public class CountryComparator implements Comparator<Country> {
    private final Comparator<Object> comparator;

    CountryComparator() {
        comparator = Collator.getInstance();
    }

    public int compare(Country c1, Country c2) {
        return comparator.compare(c1.getName(), c2.getName());
    }
}
