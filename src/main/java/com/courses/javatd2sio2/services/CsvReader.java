package com.courses.javatd2sio2.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class CsvReader {

    public ArrayList<HashMap<String, String>> readCsvFile(File file, String csvSeparator) {
        ArrayList<HashMap<String,String>> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            short lineCounter = 0;
            String[] headers = null;
            while ((line = br.readLine()) != null) {
                System.out.println("Reading line: " + line);
                // Transformation de la ligne en tableau de String réprésentant les colonnes
                String[] columns = line.split(csvSeparator);

                if(lineCounter == 0) {
                    // Récuperation du headers afin de les utiliser comme clés dans le HashMap
                    headers = columns;
                }else{
                    // Creation du hashMap pour stocker les données de la ligne et ajout dans la liste
                    HashMap<String, String> row = new HashMap<>();
                    for (int i = 0; i < columns.length; i++) {
                        row.put(headers[i], columns[i]);
                    }
                    data.add(row);

                }
                lineCounter++;
            }
            return data;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
