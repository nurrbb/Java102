import java.util.*;

public class Brand implements Comparable<Brand> {

    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    @Override
    public int compareTo(Brand o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Brand{id=" + id + ", name='" + name + "'}";

    }
}
