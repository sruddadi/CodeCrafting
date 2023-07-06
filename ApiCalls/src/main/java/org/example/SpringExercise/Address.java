package org.example.SpringExercise;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private int zip;
    private String address;

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
