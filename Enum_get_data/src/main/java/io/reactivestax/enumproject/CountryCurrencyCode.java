package io.reactivestax.enumproject;

public enum CountryCurrencyCode {
    NEWZEALAND("New Zealand", "NZ", "New Zealand Dollars", "NZD"),
    AUSTRALIA("Australian", "AU", "Australian Dollars", "AUD"),
    AUSTRIA("Austria", "AT", "Euros", "EUR"),
    FRANCE("France", "FR", "Euros", "EUR"),
    GERMANY("Germany", "DE", "Euros", "EUR"),
    GREECE("Greece", "GR", "Euros", "EUR"),
    UNITEDKINGDOM("United Kingdom", "GB", "Sterling", "GBP"),
    UNITED("United States", "US", "USD", "USD"),
    HONGKONG("Hong Kong", "HK", "HKD", "HKD"),
    CANADA("Canada", "CA", "Canadian Dollar", "CAD");

    private String country;
    private String countryCode;
    private String currency;
    private String currencyCode;

    CountryCurrencyCode(String country, String countryCode, String currency, String currencyCode) {
        this.country = country;
        this.countryCode = countryCode;
        this.currency = currency;
        this.currencyCode = currencyCode;
    }

    public static CountryCurrencyCode getCountryCodeByCurrencyCode(String currencyCode) {
        CountryCurrencyCode.values();
        for (CountryCurrencyCode country : CountryCurrencyCode.values()) {
            if (country.getCurrencyCode().equalsIgnoreCase(currencyCode)) {
                return country;
            }
        }
        throw new IllegalArgumentException(String.format("The Country code %s is invalid ",currencyCode));
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCurrency() {
        return currency;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public static CountryCurrencyCode getCurrencyCodeByCountryCode(String countryCurrency) {
        for (CountryCurrencyCode country : CountryCurrencyCode.values()) {
            if (country.getCountryCode().equalsIgnoreCase(countryCurrency)) {
                return country;
            }
        }
        throw new IllegalArgumentException(String.format("The currency code %s is invalid ",countryCurrency));
    }
}
