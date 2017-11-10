package ru.maksimov.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by iMac on 10.11.2017.
 */
@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String name;
    private String secondName;
    private Date birthday;
    private String sex;
    private String snils;

    public Patient() {
    }

    public Patient(String firstName, String name, String secondName, Date birthday, String sex, String snils) {
        this.firstName = firstName;
        this.name = name;
        this.secondName = secondName;
        this.birthday = birthday;
        this.sex = sex;
        this.snils = snils;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", snils='" + snils + '\'' +
                '}';
    }
}
