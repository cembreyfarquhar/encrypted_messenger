package encryptdecrypt;

import java.util.Hashtable;

public class Main {
    Hashtable<Character, Character> secrets = new Hashtable<Character, Character>();
    secrets.put('a', 'z');
    secrets.put('b', 'y');
    secrets.put('c', 'x');
    secrets.put('d', 'w');
    secrets.put('e', 'v');
    secrets.put('f', 'u');
    secrets.put('g', 't');
    secrets.put('h', 's');
    secrets.put('i', 'r');
    secrets.put('j', 'q');
    secrets.put('k', 'p');
    secrets.put('l', 'o');
    secrets.put('m', 'n');
    secrets.put('n', 'm');
    secrets.put('o', 'l');
    secrets.put('p', 'k');
    secrets.put('q', 'j');
    secrets.put('r', 'i');
    secrets.put('s', 'h');
    secrets.put('t', 'g');
    secrets.put('u', 'f');
    secrets.put('v', 'e');
    secrets.put('w', 'd');
    secrets.put('x', 'c');
    secrets.put('y', 'b');
    secrets.put('z', 'a');
    public static void main(String[] args) {
        String originalMessage = "we found a treasure!";
        String[] messageArr = originalMessage.split("");
        for (int i = 0; i < messageArr.length; i++) {
            
        }
        System.out.println("Hello World!");
    }
}
