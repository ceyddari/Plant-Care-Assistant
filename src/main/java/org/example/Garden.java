package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garden {

    private final List<Plant> plants = new ArrayList<>();

    public void add(Plant p) {

        if (!plants.contains(p)) plants.add(p);

    }

    public void remove(Plant p) {plants.remove(p);}

    public List<Plant> getPlants() {

        return Collections.unmodifiableList(plants);

    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder("Garden:\n");
        for (Plant p : plants)
            sb.append("  ").append(p).append(System.lineSeparator());
        return sb.toString();

    }
}
