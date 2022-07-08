package publications;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CD extends Publication{

    private int minutes;
    private List<CD> listCD = new ArrayList<CD>();

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setCD()
    {
        boolean qs = true;
        do{
            Scanner scan1 = new Scanner(System.in);
            CD dia = new CD();

            System.out.printf("Nhap ten an pham: ");
            dia.setName(scan1.nextLine());

            System.out.printf("Nhap gia thanh cua an pham: ");
            dia.setPrice(Float.parseFloat(scan1.nextLine()));

            System.out.printf("Nhap so phut cua dia CD: ");
            dia.setMinutes(Integer.parseInt(scan1.nextLine()));


            System.out.print("Ban muon nhap tiep khong?(Nhap NO de ket thuc!!!)");
            String traloi;
            Scanner sc = new Scanner(System.in);
            traloi = sc.nextLine();
            listCD.add(dia);

            if(traloi.equalsIgnoreCase("no")) {
                qs = false;
            } else {
                System.out.println("------------------------------");
            }
        }while(qs != false);


    }

    public void getCD()
    {
        System.out.println("\n\nDanh sach dia CD: ");
        for (CD dia: listCD)
        {
            System.out.println("Ten CD: " + dia.getName());
            System.out.println("Gia thanh CD: " + dia.getPrice());
            System.out.println("Thoi gian cua CD: " + dia.getMinutes());
            System.out.println("------------------------------");
        }

    }

    public void check(String name2)
    {
        for (CD dia: listCD)
        {
            if(dia.getName().equals(name2))
            {
                System.out.printf("Trùng với tên bạn nhập!!");
            }
            else
            {
                System.out.printf("Tên bạn nhập không trùng!!!");
            }
        }
        System.out.println("\n------------------------------\n");

    }




}
