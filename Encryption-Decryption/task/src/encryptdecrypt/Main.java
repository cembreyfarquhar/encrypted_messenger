package encryptdecrypt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String operation = scanner.nextLine();
//        String message = scanner.nextLine();
//        String keyInput = scanner.nextLine();

        String operation;
        String message;
        String keyInput;

        List<String> argList = Arrays.asList(args);
        if (!argList.contains("-mode")) {
            operation = "enc";
        } else {
            int modeIndex = argList.indexOf("-mode");
            operation = args[modeIndex + 1];
        }

        if (!argList.contains("-data")) {
            message = "";
        } else {
            int dataIndex = argList.indexOf("-data");
            message = args[dataIndex + 1];
        }

        if (!argList.contains("-key")) {
            keyInput = "5";
        } else {
            int keyIndex = argList.indexOf("-key");
            keyInput = args[keyIndex + 1];
        }

        int key = Integer.parseInt(keyInput);

        String output;

        if (operation.equals("enc")) {
            output = encryptMessage(message, key);
        } else {
            output = decryptMessage(message, key);
        }


        System.out.println(output);
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

