package SDA;

import java.util.*;

public class Countries {

    private TreeSet<Country> countySet = new TreeSet<>();

    public Country getCountry(String name){

        for(Country country : countySet){
            if(country.getName().equals(name)){
                return country;
            }
        }
        return null;
    }

    public Country getCapacityCountry(String name){

        for(Country country : countySet){
            if(country.getState().equals(name)){
                return country;
            }
        }
        return null;
    }

    public void add(Country country){
        countySet.add(country);
    }

    public void showCountry(){
        for (Country country : countySet){
            System.out.println(country);
        }
    }

    public void getCountriesSortedBy(Comparator<Country> comparator){

        for (Country country : countySet){
            System.out.println(country);
        }


    }



}
