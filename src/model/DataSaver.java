package model;

import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {
    public void saveData(String[] strArray) {
        try (FileWriter writer = new FileWriter(strArray[0] + ".txt",true)) {
            StringBuilder stringBuilder = new StringBuilder();
            for (String item: strArray) {
                stringBuilder.append(item).append(" ");
            }
            stringBuilder.append("\n");
            writer.write(stringBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException("Saving failed");
        }
    }
}
