package com.etyy.srm.model;

import javax.persistence.*;

/**
 * Created by chenmingjiang on 2016/7/27.
 */
@Entity
@Table(name = "city", schema = "world", catalog = "")
public class CityEntity {
    private int id;
    private String name;
    private String district;
    private int population;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }
    @Id
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "District")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "Population")
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (id != that.id) return false;
        if (population != that.population) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + population;
        return result;
    }
}
