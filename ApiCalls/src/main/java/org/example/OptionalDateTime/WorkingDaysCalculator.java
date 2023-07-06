package org.example.OptionalDateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WorkingDaysCalculator {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate endOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());
        int workingDays = 0;

        while (!currentDate.isAfter(endOfMonth)) {
            if (currentDate.getDayOfWeek() != DayOfWeek.SATURDAY && currentDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
                workingDays++;
            }
            currentDate = currentDate.plusDays(1);
        }

        System.out.println(workingDays);
    }
}