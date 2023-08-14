import java.util.Scanner;

import model1.Person;

public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //instance
        Person person = new Person();

        //inpput output
        System.out.println("Nama Depan : ");
        person.setFirstName(sc.nextLine());

        System.out.println("Nama Belakang : ");
        person.setLastName(sc.nextLine());

        System.out.println("Alamat : ");
        person.setDomisili(sc.nextLine());

        System.out.println("Bahasa Pemrogramman Terfavorit : ");
        person.setProgrLangFav(sc.nextLine());

        System.out.println("Tahun Lahir : ");
        person.setBirthYear(sc.nextInt());
        
        //output hasil
        System.out.println("=== Data Diri ===");
        System.out.println("Nama Lengkap : " + person.getNamaLengkap());
        System.out.println("Alamat : "+ person.getDomisili());
        System.out.println("Usia : " + person.getUsia());
        System.out.println("Bahasa Pemrogramman Terfaforit : " + person.getProgrLangFav());

        sc.close();
    }
}
