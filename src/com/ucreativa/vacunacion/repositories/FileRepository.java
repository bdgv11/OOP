package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.Persona;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    String FILE_PATH="";

    @Override
    public void save(Persona persona, String marca, Date fecha) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String text = "A " + persona.getNombre() + " le pusieron la vacuna " + marca + " el dia " + format.format(fecha) + "\n";

        try {
            BufferedWriter writter = new BufferedWriter(new FileWriter("db.txt",true));
            writter.append(text);
            writter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<String> get() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}