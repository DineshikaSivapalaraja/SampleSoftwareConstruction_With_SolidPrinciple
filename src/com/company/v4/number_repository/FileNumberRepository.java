package com.company.v4.number_repository;

import com.company.v4.number_repository.NumberRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    public int[] read() throws IOException { //todo: change the exception handling mechanism

        //read the numbers from the text file
        List<String> lines =  Files.readAllLines(Paths.get("C:\\Users\\Haridinu\\IdeaProjects\\Software_Construction\\src\\com\\company\\numbers.txt"));
        String firstLine = lines.get(0);

        //split first line by comma
        String[] numbers = firstLine.split(","); //but don't use this kind of standard method it provides harm

        //convert this String array to Integer array
        int []  intNumbers = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        return intNumbers;
    }
}
