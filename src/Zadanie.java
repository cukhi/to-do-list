import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie {

    String nazwa;
    String opis;


    boolean  zrobione = false;




    public  void dodajZadanie(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Podaj nazwę zadania");
       nazwa = userInput.nextLine();
        System.out.println("Podaj opis zadania");
         opis = userInput.nextLine();
         String zadanieString = "Zadanie " + nazwa + " Zostało dodane do listy";
        System.out.println(zadanieString);


    }
    public  void zadanieZrobione(){

       zrobione = true;
    }

    public void wyswietl(){
        String zrobioneZadanie = zrobione ? "[X]" : "[]";


        String wynik =   zrobioneZadanie + " " +  nazwa + " " + opis;
        System.out.println(wynik);

    }


}
