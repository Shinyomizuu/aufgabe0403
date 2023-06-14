import java.util.Scanner;

public class Kundenumfrage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein wie viele Bewertungen Sie haben möchten: ");
        int anzahl_bewertung = scanner.nextInt();

        int [] gesamt_auswertung_array = new int [anzahl_bewertung];
        int [] auswertungen_array  = {0, 0, 0};

        for(int i = 0; i < anzahl_bewertung; i++) {
            int randomNum = (int)(Math.random() * 3 + 1);  // 1 to 3

            gesamt_auswertung_array[i] = randomNum;
            if (randomNum == 1) {
                auswertungen_array[0] += 1;
            } else if (randomNum == 2) {
                auswertungen_array[1] += 1;
            } else {
                auswertungen_array[2] += 1;
            }
        }

        double prozent_nicht_empfehlenswert = (auswertungen_array[0] * 100.0) / anzahl_bewertung;
        double prozent_akzeptabel = (auswertungen_array[1] * 100.0) / anzahl_bewertung;
        double prozent_hervorragend = (auswertungen_array[2] * 100.0) / anzahl_bewertung;


        System.out.println("Von " +gesamt_auswertung_array.length +" Testern fanden: ");
        System.out.println(auswertungen_array[0] + " Testpersonen fanden das Produkt als nicht empfehlenswert!  " +
                prozent_nicht_empfehlenswert + "%");

        System.out.println(auswertungen_array[1] + " Testpersonen fanden das Produkt als akzeptabel!  " +
                prozent_akzeptabel + "%");

        System.out.println(auswertungen_array[2] + " Testpersonen fanden das Produkt als hervorragend!  " +
                prozent_hervorragend + "%");

        if (prozent_hervorragend > prozent_nicht_empfehlenswert) {
            System.out.print("Produkt hat größenteils positive Bewertungen! ");
        }
        else if (prozent_hervorragend == prozent_nicht_empfehlenswert){
            System.out.print("Neutrale Bewertung ");
        }
        else {
            System.out.print("Produkt hat größenteils negative Bewertungen!  ");
        }
    }
}