package com.dop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(fileReader(Path.of("results.txt")));
    }
    public static Map<String, Integer> fileReader(Path file) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        List<StudentsTasksAttempts> list = new ArrayList<>();
        Files.lines(file).map(s -> s.split("\\s+"))
                .forEach(array -> {StudentsTasksAttempts student = new StudentsTasksAttempts(array[0]
                        ,Integer.parseInt(array[1])
                        ,Integer.parseInt(array[2])
                        ,Integer.parseInt(array[3]));
                    boolean bol = true;
                    for (StudentsTasksAttempts s : list) {
                        if (Objects.equals(s.getLastName(), student.getLastName()) && s.getTaskNumber() == student.getTaskNumber()) {
                            s.setAttemptNumber(Math.max(s.getAttemptNumber(), student.getAttemptNumber()));
                            s.setScore(Math.max(s.getScore(), student.getScore()));
                            bol = false;
                        }
                    }
                    if (bol) {
                        list.add(student);
                    }
                });
        for (StudentsTasksAttempts s : list) {
            if (map.containsKey(s.getLastName())){
                map.put(s.getLastName(),map.get(s.getLastName()) + scoreCounter(s));
            } else {
                map.put(s.getLastName(),scoreCounter(s));
            }
        }
        return map;
    }
    public static int scoreCounter(StudentsTasksAttempts student) {
        if (student.getAttemptNumber() < 5) {
            return student.getScore();
        } else if (student.getAttemptNumber() >=5 && student.getAttemptNumber() < 10) {
            return student.getScore()/2;
        } else {
            return 1;
        }
    }
}
