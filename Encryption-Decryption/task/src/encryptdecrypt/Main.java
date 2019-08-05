package encryptdecrypt;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String message = scanner.nextLine();
        String keyInput = scanner.nextLine();
        int key = Integer.parseInt(keyInput);

        char[] messageArr = message.toCharArray();

        for (int i = 0; i < messageArr.length; i++) {
            char letter = messageArr[i];
            int asciiCode = letter;

            if (asciiCode >= 97 && asciiCode <= 122) {
                int newAsciiCode = asciiCode + key;
                if (newAsciiCode > 122) {
                    newAsciiCode = 96 + (newAsciiCode % 122);
                }
                char newLetter = (char) newAsciiCode;
                messageArr[i] = newLetter;
            }
        }
        String encryptedMessage = new String(messageArr);
        System.out.println(encryptedMessage);
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

