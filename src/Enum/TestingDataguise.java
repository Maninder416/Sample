package Enum;
enum CountryCurrenceyCodes{
    NEW_ZEALAND("New Zealand","NZ", "NZD"),
    AFGHANISTAN("Afghanistan","AF","AFN"),
    INDIA("India","IN","INR"),
    CHINA("China","CN","CNY"),
    UNITED_STATES("United States","US","USD"),
    CANADA("Canada","CA","CAD");

    private String Country_name;
    private String Country_code;
    private String currency_code;

     CountryCurrenceyCodes(String Country_name,String Country_code,String currency_code){
        this.Country_name=Country_name;
        this.Country_code=Country_code;
        this.currency_code=currency_code;
     }

     public String getCountry_name(){
         return Country_name;
     }

     public String getCountry_code(){
         return Country_code;
     }

     public String getCurrency_code(){
         return currency_code;
     }

     public static CountryCurrenceyCodes countryCurrenceyCodes(String country_code){
         CountryCurrenceyCodes [] ccc= values();
         for(CountryCurrenceyCodes codes: ccc){
             if(codes.getCountry_code().equalsIgnoreCase(country_code)){
                 return codes;
             }
         }
         throw new IllegalArgumentException("CountryCode "+country_code +" is not supported ");
     }
}
public class TestingDataguise {
    public static void main(String[] args) {
        CountryCurrenceyCodes countryCurrenceyCodes= CountryCurrenceyCodes.INDIA;
        System.out.println("*********");
        System.out.println("County Name is: "+countryCurrenceyCodes.getCountry_name());
        System.out.println("*********");
        CountryCurrenceyCodes usCode= CountryCurrenceyCodes.countryCurrenceyCodes("us");
        System.out.println(usCode.getCountry_code());
        System.out.println(usCode.getCountry_name());
        System.out.println(usCode.getCurrency_code());



    }
}
