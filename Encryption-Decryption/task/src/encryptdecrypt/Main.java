package encryptdecrypt;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        String operation = scanner.nextLine();
//        String message = scanner.nextLine();
//        String keyInput = scanner.nextLine();

        String operation;
        StringBuilder message;
        String keyInput;
        String in;
        String out;

        List<String> argList = Arrays.asList(args);
        if (!argList.contains("-mode")) {
            operation = "enc";
        } else {
            int modeIndex = argList.indexOf("-mode");
            operation = args[modeIndex + 1];
        }

        if (!argList.contains("-in")) {
            in = "std";
        } else {
            int inIndex = argList.indexOf("-in");
            in = args[inIndex + 1];
        }

        if (!argList.contains("-out")) {
            out = "std";
        } else {
            int outIndex = argList.indexOf("-out");
            out = args[outIndex + 1];
        }

        if (!argList.contains("-data")) {
            message = new StringBuilder(" ");
        } else {
            int dataIndex = argList.indexOf("-data");
            message = new StringBuilder(args[dataIndex + 1]);
        }

        if (!argList.contains("-key")) {
            keyInput = "5";
        } else {
            int keyIndex = argList.indexOf("-key");
            keyInput = args[keyIndex + 1];
        }

        int key = Integer.parseInt(keyInput);

        String output;

        if (!in.equals("std")) {
            File file = new File(in);
            final Scanner readScanner = new Scanner(file);
            while (readScanner.hasNextLine()) {
                message.append(readScanner.nextLine());
            }
        }

        if (operation.equals("enc")) {
            output = encryptMessage(message.toString(), key);
        } else {
            output = decryptMessage(message.toString(), key);
        }

        if (!out.equals("std")) {
            System.out.println(output);
        } else {
            BufferedWriter writer = new BufferedWriter(new FileWriter(out, true));
            writer.write(output);
        }
    }
    public static String encryptMessage(String message, int key){

        char[] messageArr = message.toCharArray();

        for (int i = 0; i < messageArr.length; i++) {
            char letter = messageArr[i];
            int asciiCode = letter;
            int newAsciiCode = asciiCode + key;
            char newLetter = (char) newAsciiCode;
            messageArr[i] = newLetter;
        }
        return new String(messageArr);
    }

    private static String decryptMessage(String message, int key) {

        char[] messageArr = message.toCharArray();

        for (int i = 0; i < messageArr.length; i++) {
            char letter = messageArr[i];
            int asciiCode = letter;

            int newAsciiCode = asciiCode - key;
            char newLetter = (char) newAsciiCode;
            messageArr[i] = newLetter;
            }
        return new String(messageArr);
    }
}

/*
  a - z
  b - y
  c - x
  d - w
  e - v
  f - u
  g - t
  h - s
  i - r
  j - q
  k - p
  l - o
  m - n
 */

