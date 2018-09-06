package com.example.jnhvic001.wifimapperv1;

import java.util.List;

public class ListUtil {

    private static long sum = 0 ;

    public static long sum(List<Long> list){
        for (long i: list) {
            sum += i;
        }
        return sum;
    }
}
