package encryptdecrypt;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String operation = scanner.nextLine();
        String message = scanner.nextLine();
        String keyInput = scanner.nextLine();
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

//        for (int i = 0; i < messageArr.length; i++) {
//            char letter = messageArr[i];
//            int asciiCode = letter;
//
//            if (asciiCode >= 97 && asciiCode <= 122) {
//                int newAsciiCode = asciiCode + key;
//                if (newAsciiCode > 122) {
//                    newAsciiCode = 96 + (newAsciiCode % 122);
//                }
//                char newLetter = (char) newAsciiCode;
//                messageArr[i] = newLetter;
//            }
//        }
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

