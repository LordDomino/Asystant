package main;

public class Main {
    public static void main(String[] args) {
        scan_image(new Image("Hello world!"));
    }
    public static void scan_image(Image image) {
        System.out.println(image);
    }
}
