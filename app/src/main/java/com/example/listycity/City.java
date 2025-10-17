package com.example.listycity;


import java.util.Objects;

/**
 * Represents a city with a name and province.
 */
public class City implements Comparable<City>{
    private String city;
    private String province;
    /**
     * Creates a new City object.
     * @param city The name of the city.
     * @param province The name of the province.
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    /**
     * Gets the name of the city.
     * @return The city name.
     */
    String getCityName(){
        return this.city;
    }
    /**
     * Gets the name of the province.
     * @return The province name.
     */
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // same object
        if (o == null || getClass() != o.getClass()) return false; // different types

        City city = (City) o;
        // check if both city name and province are equal
        return this.city.equals(city.city) && this.province.equals(city.province);
    }

    @Override
    public int hashCode() {
        // generate a consistent hash based on both fields
        return Objects.hash(city, province);
    }

}
