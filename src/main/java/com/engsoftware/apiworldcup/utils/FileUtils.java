package com.engsoftware.apiworldcup.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtils {
    public static String readFromFile(String filename) {

        StringBuilder returnString = new StringBuilder();

        InputStream fIn = null;
        InputStreamReader isr = null;
        BufferedReader input = null;
        try {
            fIn = FileUtils.class.getClassLoader().getResourceAsStream(filename);
            if (fIn != null) {
                isr = new InputStreamReader(fIn);
                input = new BufferedReader(isr);
                String line;
                while ((line = input.readLine()) != null) {
                    returnString.append(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null)
                    isr.close();
                if (fIn != null)
                    fIn.close();
                if (input != null)
                    input.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        return returnString.toString();
    }
}
