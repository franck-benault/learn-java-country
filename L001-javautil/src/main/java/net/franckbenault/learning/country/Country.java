package net.franckbenault.learning.country;

public class Country {
    public String getName() {
		return name;
	}

	private final String iso;
    private final String code;
    private final String name;

    Country(String iso, String code, String name) {
        this.iso = iso;
        this.code = code;
        this.name = name;
    }

    public String toString() {
        return iso + " - " + code + " - " + name;
    }
}
