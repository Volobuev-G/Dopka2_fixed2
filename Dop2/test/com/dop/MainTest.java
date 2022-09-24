package com.dop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testScoreCounter() {
        StudentsTasksAttempts student = new StudentsTasksAttempts("Rob",1,3,50);
        Assertions.assertEquals(Main.scoreCounter(student),50);
    }

    @Test
    void testFileReader() throws IOException{
        Map<String,Integer> mapExpected = new HashMap<>();
        mapExpected.put("Bob",90);
        mapExpected.put("Alex",25);
        Assertions.assertEquals(mapExpected,Main.fileReader(Path.of("testfile.txt")));
    }
}