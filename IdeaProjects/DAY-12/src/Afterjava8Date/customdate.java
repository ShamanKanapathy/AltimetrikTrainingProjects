package Afterjava8Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class customdate {

        public static void main(String[] args) {
            LocalDate ld = LocalDate.of(2000,8,9);
            System.out.println(ld);
            LocalTime lt = LocalTime.of(21,7,6);
            System.out.println(lt);
            LocalDateTime ldt = LocalDateTime.of(2003,12,12,5,56,45                          );
            System.out.println(ldt);

        }
    }

