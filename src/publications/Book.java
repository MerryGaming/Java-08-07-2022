package publications;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book extends Publication{
    private int numberpages;
    private List<Book> listBook = new ArrayList<Book>();

    public int getNumberpages()
    {
        return numberpages;
    }

    public void setNumberpages(int numberpages)
    {
        this.numberpages = numberpages;
    }

    public void setBook()
    {

        boolean qs = true;
        do{
            Scanner scan1 = new Scanner(System.in);
            Book bk = new Book();

            System.out.printf("Nhap ten an pham: ");
            bk.setName(scan1.nextLine());

            System.out.printf("Nhap gia thanh cua an pham: ");
            bk.setPrice(Float.parseFloat(scan1.nextLine()));

            System.out.printf("Nhap so trang cua sach: ");
            bk.setNumberpages(Integer.parseInt(scan1.nextLine()));


            System.out.print("Ban muon nhap tiep khong?(Nhap NO de ket thuc!!!)");
            String traloi;
            Scanner sc = new Scanner(System.in);
            traloi = sc.nextLine();
            listBook.add(bk);

            if(traloi.equalsIgnoreCase("no")) {
                qs = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(qs != false);

    }

    public void getBook()
    {
        System.out.println("\n\nDanh sach Book: ");
        for (Book bk: listBook)
        {
            System.out.println("Ten sach: " + bk.getName());
            System.out.println("Gia thanh cuon sach: " + bk.getPrice());
            System.out.println("So trang sach: " + bk.getNumberpages());
            System.out.println("------------------------------");
        }

    }



    public void getBook500()
    {
        for (Book bk: listBook)
        {
            if(bk.getNumberpages() > 500)
            {
                System.out.println("Sách có số trang lớn hơn 500 là: " + bk.getName());
            }
        }
        System.out.println("\n------------------------------\n");


    }
}
