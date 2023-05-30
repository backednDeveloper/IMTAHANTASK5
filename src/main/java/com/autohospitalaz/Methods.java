package com.autohospitalaz;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Methods {
    public static Integer findMinInt(List<Integer> list) {
        Optional<Integer> min = list.stream()
                .min(Integer::compareTo);
        return min.orElse(null);
    }

    public static Integer findMaxInt(List<Integer> list) {
        Optional<Integer> max = list.stream()
                .max(Integer::compareTo);
        return max.orElse(null);
    }

    public static Double findAvrage(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public static boolean fileMethod(File file) throws IOException {
        boolean created = false;
        if (!file.exists()) {
            created = file.createNewFile();
        }
        return created;
    }

    public static List<Integer> bolunenMethodu(List<Integer> list) {
        return list.stream()
                .filter(s -> s % 3 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> splitMethod(String title) {
        return Arrays.stream(title.split("-")).map(String::toString).collect(Collectors.toList());
    }

    public static List<String> deleteAbsent(String title) {
        return Arrays.stream(new String[]{title.trim().replace(" ", " ")}).map(String::toString).collect(Collectors.toList());
    }

    public static Double findAverage1(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public static List<String> arrayDoldurmag(String title) {
        return Arrays.stream(title.split(" ")).map(String::toString).collect(Collectors.toList());
    }

    public static List<String> stringarrayDetected(List<String> list) {
        return list.stream()
                .filter(s -> s.toUpperCase().startsWith("J") && s.toUpperCase().endsWith("A")).collect(Collectors.toList());
    }

    public static Integer stringLenght(List<String> list) {
        return list.stream()
                .map(s -> s.length())
                .reduce((integer, integer2) -> integer + integer2).orElse(0);
    }

}
