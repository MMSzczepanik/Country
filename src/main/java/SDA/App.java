package SDA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Countries countries = new Countries();
        countries.add(new Country("Polska","Warszawa",16000, new User("Michal", "Szczepanik")));
        countries.add(new Country("Aolska","Narszawa",16000, new User("Michal", "Szczepanik")));

        countries.getCountriesSortedBy(Sort.NAME);
    }
}
