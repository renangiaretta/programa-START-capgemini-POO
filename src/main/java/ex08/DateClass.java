package ex08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateClass implements Cloneable {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public DateClass(String date) {
        LocalDate date1;
        try {
            date1 = LocalDate.parse(date, formatter);
        } catch (IllegalArgumentException e) {
            date1 = LocalDate.of(1, 1, 1);
        }
    }

    public int compare(String dateToCompare) {
        LocalDate date;
        LocalDate now = LocalDate.now();
        try {
            date = LocalDate.parse(dateToCompare, formatter);
            if (date.isBefore(now)) {
                return 1;
            } else if (date.isEqual(now)) {
                return 0;
            } else if (date.isAfter(now)) {
                return -1;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida.");
        }
        return 10;
    }

    public int getDay(LocalDate dateToVerify) {
        try {
            return dateToVerify.getDayOfMonth();
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida.");
        }
        return 0;
    }

    public int getMonth(LocalDate dateToVerify) {
        try {
            return dateToVerify.getMonthValue();
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida.");
        }
        return 0;
    }

    public String getMonthWord(LocalDate dateToVerify) {
        try {
            return dateToVerify.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault());
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida.");
        }
        return "0";
    }

    public int getYear(LocalDate dateToVerify) {
        try {
            return dateToVerify.getYear();
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida.");
        }
        return 0;
    }

    public boolean isLeapYear(LocalDate dateToVerify) {
        try {
            int year = dateToVerify.getYear();
            LocalDate date = LocalDate.of(year, 1, 1);
            return date.isLeapYear();
        } catch (IllegalArgumentException e) {
            System.out.println("Data inválida.");
        }
        return false;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
