package com.systechafrica.part3.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) {
        // workingWithFile();
        workingWithFileStreams();

    }

    private static void workingWithFileStreams() {
        String fileSeparator = System.getProperty("file.separator");
        File quoteFile = new File("java-se-training" + fileSeparator + "quotes.txt");
        if (quoteFile.exists() && quoteFile.isFile()) {
            try (
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(quoteFile));
                    Scanner scanner = new Scanner(System.in)) {
                String line;
                List<String> lines = new ArrayList<>();
                while ((line = bufferedReader.readLine()) != null) {
                    lines.add(line);
                }

                System.out.print("Enter a number btn (1-10): ");
                int quoteIndex = scanner.nextInt();
                System.out.println(lines.get(quoteIndex - 1));
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }

        }

    }

    private static void workingWithFile() throws IOException {
        String fileSeparator = System.getProperty("file.separator");

        String absolutePath = "C:\\Users\\HP\\Desktop\\workings\\Java-Se-Training\\java-se-training\\src\\main\\java\\com\\systechafrica\\part3\\inputoutput\\WorkingWithFiles.java";
        String relativePath = "java-se-training\\src\\main\\java\\com\\systechafrica\\part3\\inputoutput\\WorkingWithFiles.java";

        System.out.println(fileSeparator);
        File logFile = new File("C:\\Users\\HP\\Desktop\\workings\\Java-Se-Training\\log.txt");
        System.out.println(logFile.exists()); // check if file exists
        System.out.println(logFile.isFile());
        System.out.println(logFile.isDirectory());
        System.out.println(Instant.ofEpochMilli(logFile.lastModified()));
        System.out.println(logFile.getFreeSpace());

        File baseDirectory = new File("C:\\Users\\HP\\Desktop\\workings\\Java-Se-Training\\java-se-training");
        File tmpFile = new File(baseDirectory, "tmp");
        tmpFile.mkdir();
        File log = new File(tmpFile, "log.txt");
        log.createNewFile();
        if (baseDirectory.exists() && baseDirectory.isDirectory()) {
            File[] listFiles = baseDirectory.listFiles();

            for (File file : listFiles) {
                System.out.println(file.getName());

            }
        }
        // log.delete();
        File temporaryLog = new File(tmpFile + fileSeparator + "temporaryLog.txt");
        log.renameTo(temporaryLog);
    }
}
