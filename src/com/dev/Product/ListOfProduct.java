package com.dev.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOfProduct {
    private final ArrayList<Product> list = new ArrayList<>();

    private void enterList() {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach san pham");

        do {
            System.out.printf("Nhap vao ten san pham %d: ", i);
            String nameProduct = sc.nextLine();

            if (nameProduct.isEmpty()) {
                break;
            }

            System.out.printf("Nhap vao gia san pham %d: ", i);
            double price = sc.nextDouble();

            i++;

            sc.nextLine();
            list.add(new Product(nameProduct, price));
            System.out.print("Nhap tiep tuc (y/n): ");
        } while (!sc.nextLine().equals("n"));
    }

    private void editProduct() {
        printList();
        Scanner sc = new Scanner(System.in);
        String nameProductEdit;
        String newProductName;
        double newPrice;
        int choose;
        boolean existsProduct = false;
        int positionExists = 0;
        System.out.println("Nhap vao ten san pham ban muon sua: ");
        nameProductEdit = sc.nextLine();
        // Check if the product to be edited already exists
        for (Product item :
                list) {
            if (nameProductEdit.equals(item.getProductName())) {
                existsProduct = true;
                positionExists = list.indexOf(item);
                break;
            }
        }
        // Menu edit
        if (existsProduct) {
            System.out.println("=============================");
            System.out.println("Ban muon chinh sua: ");
            System.out.println("1. Ten san pham");
            System.out.println("2. Gia san pham");
            System.out.println("3. Ca ten va gia cua san pham");
            System.out.println("=============================");
            System.out.print("Nhap vao lua chon cua ban: ");
            choose = sc.nextInt();


            switch (choose) {
                case 1 -> {
                    sc.nextLine();
                    System.out.print("Nhap vao ten moi: ");
                    newProductName = sc.nextLine();
                    list.get(positionExists).setProductName(newProductName);
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.print("Nhap vao gia moi: ");
                    newPrice = sc.nextDouble();
                    list.get(positionExists).setPrice(newPrice);
                }
                case 3 -> {
                    sc.nextLine();
                    System.out.print("Nhap vao ten moi: ");
                    newProductName = sc.nextLine();
                    System.out.print("Nhap vao gia moi: ");
                    newPrice = sc.nextDouble();
                    list.get(positionExists).setProductName(newProductName);
                    list.get(positionExists).setPrice(newPrice);
                }
                default -> {
                }
            }
        } else {
            System.out.println("Khong ton tai san pham tren !!!");
        }
    }

    private void printList() {
        System.out.println("Danh sach san pham");
        for (Product item :
                list) {
            System.out.println("Ten san pham: " + item.getProductName());
            System.out.println("Gia san pham: " + item.getPrice());
        }
    }

    public void menu() {
        int choose = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Nhap vao lua chon cua ban: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1 -> enterList();
                case 2 -> printList();
                case 3 -> editProduct();
                default -> {
                    break;
                }
            }
        } while (choose != 0);
    }
}


