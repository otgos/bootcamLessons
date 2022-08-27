package day20;
/*
        1) String Class gives you "immutable Strings".
        If you need mutable class you can you use StringBuffer class.

        2) When Java was created, Java created "StringBuffer" Class.
        But then in Java 1.5 "StringBuilder" came to stage.

        3) "StringBuffer" Class is multi-thread and synchronized
        but "StringBuilder" is not multi-thread and not synchronized
        Java did that to provide faster mutable Strings to developers

        4) When to use "String", "StringBuilder" and "StringBuffer"?
        "String" --> for small amount of data

        "StringBuilder"-->single thread  operations with large data in fast pace

        "StringBuffer" --> multi thread operations with large data

 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class StringBuffer01 {
    public static void main(String[] args) {
        LocalDateTime time1 = LocalDateTime.now();
        System.out.println(performanceOfStringBuffer("Otgo"));
        LocalDateTime time2 = LocalDateTime.now();
        System.out.println(performanceOfStringBuilder("Otgo"));
        LocalDateTime time3 = LocalDateTime.now();
        System.out.println(time1.until(time2, ChronoUnit.NANOS));
        System.out.println(time2.until(time3, ChronoUnit.NANOS));
    }
    public static StringBuffer performanceOfStringBuffer(String str){
        StringBuffer stringBuffer  = new StringBuffer(str);
        for(int i = 0; i<100000; i++){
            stringBuffer.append("abc");
        }
        return stringBuffer;
    }
    public static StringBuilder performanceOfStringBuilder(String str){
        StringBuilder stringBuilder  = new StringBuilder(str);
        for(int i = 0; i<100000; i++){
            stringBuilder.append("abc");
        }
        return stringBuilder;
    }
}
