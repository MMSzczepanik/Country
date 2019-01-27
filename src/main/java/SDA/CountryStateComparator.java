package SDA;

import java.util.Comparator;

public class CountryStateComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o1.getState().compareTo(o2.getState());
    }
}