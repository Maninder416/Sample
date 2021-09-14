package Enum;

enum Country{
    INDIA("India","In","INR"),
    USA("America","us","Dollar");

    private String Country_Name;
    private String Country_Code;
    private String Country_currencey;


    Country(String Country_Name, String Country_Code, String Country_currencey) {
        this.Country_Name=Country_Name;
        this.Country_Code=Country_Code;
        this.Country_currencey=Country_currencey;
    }

    public String get_CountryName(){
        return this.Country_Name;
    }

    public String getCountry_Code(){
        return this.Country_Code;
    }

    public String getCountry_currencey(){
        return this.Country_currencey;
    }

    public Country countryTesting(String country_Code){
        Country[] temp= values();
        for(Country country: temp){
            if(country.Country_Code.equalsIgnoreCase(country_Code)){
                return country;
            }
            }
        throw new IllegalArgumentException("Country code: "+country_Code+" do not exist");
        }
    }

public class PracticeExercise {
    public static void main(String[] args) {
        Country country = Country.INDIA;
        System.out.println("Country name is: "+country.get_CountryName());
        Country testing= country.countryTesting("in");
        System.out.println("Country name is: "+testing.get_CountryName());
        System.out.println("Country code is: "+testing.getCountry_Code());
        System.out.println("Currency is: "+testing.getCountry_currencey());
    }
}