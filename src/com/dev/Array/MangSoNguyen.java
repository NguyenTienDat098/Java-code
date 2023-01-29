package com.dev.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MangSoNguyen {
    private final ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void nhapMang() {
        System.out.println("Nhap vao danh sach cac so nguyen");
        do {
            int value;
            System.out.print("Nhap so: ");
            value = sc.nextInt();
            this.list.add(value);
            sc.nextLine();
            System.out.print("Nhap tiep du lieu (Y/N): ");
        } while (!sc.nextLine().equals("N"));
    }

    public void xuatMang() {
        System.out.println("Danh sach cac so nguyen: ");
        for (int item : this.list) {
            System.out.print(item + " ");
        }
    }
}
