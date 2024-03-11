package lr2.example3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();
        Encrypt encryptedText = new Encrypt(text, key);
        System.out.println("Текст после преобразования: " + encryptedText.getEncryptString());
        System.out.println("Выполнить обратное преобразование? (y/n)");
        in.nextLine();
        String response = in.nextLine();
        if (response.equalsIgnoreCase("y")) {
            String decryptedText = encryptedText.getDecryptString();
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (response.equalsIgnoreCase("n")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }
        in.close();
    }
}






