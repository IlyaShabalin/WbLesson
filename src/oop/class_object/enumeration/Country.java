package oop.class_object.enumeration;

public enum Country {
    JAPAN("Япония",147_000_00l,"японский"),
    GREECE("Греция",10_000_00l,"греческий"),
    ARGENTINA("Аргентина",47_000_00,"испанский");
    private String name;
    private long peopleCount;
    private String language;

    Country(String name, long peopleCount, String language) {
        this.name = name;
        this.peopleCount = peopleCount;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", peopleCount=" + peopleCount +
                ", language='" + language + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public String getLanguage() {
        return language;
    }
}
