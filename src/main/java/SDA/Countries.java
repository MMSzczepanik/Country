package SDA;

import java.util.*;
import java.util.stream.Collectors;

public class Countries {

    private Set<Country> countySet = new HashSet<>();

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

    public void getCountriesSortedBy(Sort sort){
//        countySet.stream()
//                .sorted(comparator)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);


        Set<Country> set = new TreeSet<>(sort.getComparator());
        set.addAll(countySet);

        for (Country country : set){
            System.out.println(country);
        }


    }



}
