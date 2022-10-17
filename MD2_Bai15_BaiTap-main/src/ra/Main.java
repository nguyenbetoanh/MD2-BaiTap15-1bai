package ra;

import ra.IllegalTriangleException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap vao canh a");
            double a = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap vao canh b");
            double b = Double.parseDouble(sc.nextLine());
            System.out.println("Nhap vao canh c");
            double c = Double.parseDouble(sc.nextLine());
            if (a + b < c || a + c < b || b + c < a||a<0||b<0||c<0) {
                throw new IllegalTriangleException("day khong phai la 3 canh 1 tam giac");
            }else {
                System.out.println("day la 1 tam giac");
            }
        } catch (NumberFormatException e) {
            throw new IllegalTriangleException("nhap vao 1 so.");
        }
    }
}