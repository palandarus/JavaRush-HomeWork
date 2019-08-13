package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine(); //читаю первое имя


        InputStream fileInputStream;

        //Перехватываю исключение 1 файла
        try {
            fileInputStream = getInputStream(sourceFileName);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует");
            sourceFileName = reader.readLine();

        }
        fileInputStream = getInputStream(sourceFileName); //создаю первый поток
        String destinationFileName = reader.readLine();//читаю второе имя
        OutputStream fileOutputStream;
        //Перехватываю исключение 2 файла
        try {
            fileOutputStream = getOutputStream(destinationFileName);
        } catch (IOException e) {
            System.out.println("Файл не существует");
            destinationFileName = reader.readLine();

        }

        fileOutputStream = getOutputStream(destinationFileName); // создаю второй поток
        //Копирую содержимое файлов
        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }
        //закрываю потоки
        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}


