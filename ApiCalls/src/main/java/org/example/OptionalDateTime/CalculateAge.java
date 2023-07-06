package org.example.OptionalDateTime;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1990, 01, 29);
        Period age = Period.between(birthdate, currentDate);
        System.out.println(age.getYears());
    }

}