package ru.gb.elfimova;

import ru.gb.elfimova.DateFix;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFile {
    public void writeInFile() {
        DateFix dateFix = new DateFix();
        String text = dateFix.currentDateTime + "-> Hello, world";
        String fileName = "File.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}