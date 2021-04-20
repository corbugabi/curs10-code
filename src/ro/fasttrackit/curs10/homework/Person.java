package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Person {
    String getFirstname();
    String getLastname();
    LocalDate getBirthday();
    String getAddress();
}
