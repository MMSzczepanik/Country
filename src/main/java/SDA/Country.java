package SDA;

public class Country implements Comparable{
    private String name;
    private String state;
    private int count;
    private User president;

    public User getPresident() {
        return president;
    }

    public void setPresident(User president) {
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", count=" + count +
                ", president=" + president +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Country(String name, String state, int count, User president) {
        this.name = name;
        this.state = state;
        this.count = count;
        this.president = president;
    }
}
