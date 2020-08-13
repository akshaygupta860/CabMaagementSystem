package org.codejudge.sb.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * @author akshaygupta01
 */
@Entity
@Table(name = "DriverRegistration")
//@Getter
//@Setter
public class DriverRegistration implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "email",unique=true)
    private String email;

    @Column(name = "phone_number",unique=true)
    private BigInteger phone_number;

    @Column(name = "license_number",unique=true)
    private String license_number;

    @Column(name = "car_number",unique=true)
    private String car_number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(BigInteger phone_number) {
        this.phone_number = phone_number;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }
}
