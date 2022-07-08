package publications;

import java.util.List;
import java.util.Scanner;

public class MainPublication {
    public static void main(String[] args) {

        Book bk = new Book();
        CD dia = new CD();

        System.out.println("Nhap Sach");
        bk.setBook();
        bk.getBook();


        System.out.println("Sách có số trang >500 la: \n");
        bk.getBook500();

        System.out.println("Nhap dia CD");
        dia.setCD();
        dia.getCD();

        String name2;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Nhap dia CD cần tìm: ");
        name2 = scan.nextLine();

        dia.check(name2);





    }
}
