import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompareDates {
    public static void CompareDates(List<LocalDate> datesList){
        LocalDate maxDate= datesList.get(0);
        LocalDate minDate=datesList.get(0);
        for (LocalDate d :datesList) {
            if(d.isAfter(maxDate)){
                maxDate=d;
            }
            if(d.isBefore(minDate)){
                minDate=d;
            }
        }
        System.out.println("Earliest Date : "+minDate+" Furthest Date :" +maxDate);
    }

    public static void main(String[] args) {
        List<LocalDate> datesList = new ArrayList<>();
        datesList.add(LocalDate.of(2022, 1, 15));
        datesList.add(LocalDate.of(2022, 3, 10));
        datesList.add(LocalDate.of(2022, 2, 5));
        datesList.add(LocalDate.of(1971, 4, 20));
        datesList.add(LocalDate.of(1971, 1, 1));
        CompareDates(datesList);
    }
}