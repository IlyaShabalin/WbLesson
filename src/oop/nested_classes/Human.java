package oop.nested_classes;

public class Human {
    private Passport passport;

    public Human(String series, String number, PassportType passportType) {
        this.passport = new Passport(series, number, passportType);
    }

    public static class Passport {
        private String series;
        private String number;
        private PassportType passportType;

        public Passport(String series, String number, PassportType passportType) {
            this.series = series;
            this.number = number;
            this.passportType = passportType;
        }

        @Override
        public String toString() {
            return "Passport{" +
                    "series='" + series + '\'' +
                    ", number='" + number + '\'' +
                    ", passportType=" + passportType +
                    '}';
        }
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Human{" +
                "passport=" + passport +
                '}';
    }
}
