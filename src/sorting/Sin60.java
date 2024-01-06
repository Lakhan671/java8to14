package sorting;

import java.util.*;

public class Sin60 implements Comparable<Sin60> {
    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Sin60(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
        Sin60 sin60=new Sin60("C1",10);
        Sin60 sin601=new Sin60("S1",100);
        Sin60 sin602=new Sin60("A1",1);
        Sin60 sin603=new Sin60("L1",15);
        List<Sin60> sin60s=new ArrayList<>();
        sin60s.add(sin601);
        sin60s.add(sin60);
        sin60s.add(sin602);
        sin60s.add(sin603);
        System.out.println(sin60s);
        Collections.sort(sin60s);
        Collections.sort(sin60s, new Comparator<Sin60>() {
            @Override
            public int compare(Sin60 o1, Sin60 o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(sin60s);
    }

    @Override
    public int compareTo(Sin60 o) {
        return this.id-o.id;
    }

    @Override
    public String toString() {
        return "Sin60{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
