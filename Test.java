package BaiTapLab3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            Student[] cls = new Student[N];
            for (Student s : cls) {
                String name = scanner.next();
                int year = scanner.nextInt();
                s= new Student(year, name);
   }
   int total = 0;
   System.out.print("Danh sach lop");
   for (int i=0;i<N;i++) {
            total += 2022-cls[i].getYear();
            System.out.print(cls[i].getName());


   }
   System.out.print("Tong so tuoi:"+ total);
        }

}

