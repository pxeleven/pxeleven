package com.pxeleven.java;

import java.util.Objects;

/**
 * @author pxeleven
 * @create 2020-05-07- 11:21
 */
public class persons {
    int id;
    String name;


    public persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        persons persons = (persons) o;
        return id == persons.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}