package ru.mirea.lab8;
public class Main {
    public static void main(String[] args) {
        String path="D:\\МИРЭА\\2 курс\\java\\lab8\\src\\ru\\mirea\\lab8\\text.txt";
        MyFileReader readerFile = new MyFileReader();
        readerFile.read(path);
    }
}