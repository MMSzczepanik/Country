package SDA;

import java.util.Comparator;

public enum Sort {
    NAME(new CountryNameComparator()),STATE(new CountryStateComparator());

    private Comparator<Country> comparator;

    Sort(Comparator<Country> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Country> getComparator() {
        return comparator;
    }
}
