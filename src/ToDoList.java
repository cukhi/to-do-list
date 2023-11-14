import java.util.ArrayList;
import java.util.Scanner;


public class ToDoList {



    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        ArrayList<Zadanie> zadania = new ArrayList<Zadanie>();
        int numerZadania;

        while(true){
            System.out.println("podaj numer ktory chcesz aby wykonano");
            System.out.println("1. Dodaj nowe zadanie \n 2. Oznacz zadanie jako zakończone \n 3.Usuń zadanie \n 4.Wyswietl liste zadan \n 5.Wyjscie");

            numerZadania = userInput.nextInt();

            switch (numerZadania){
                case 1:
                    Zadanie noweZadanie = new Zadanie();
                    noweZadanie.dodajZadanie();
                    zadania.add(noweZadanie);
                    break;

                case 2:
                    System.out.println("Podaj numer zadania do oznaczenia jako zakończone (od 0) ");
                    int numerZadaniaOznacz = userInput.nextInt();
                    if(numerZadaniaOznacz >= 0 && numerZadaniaOznacz < zadania.size()){
                        zadania.get(numerZadaniaOznacz).zadanieZrobione();
                    }else{
                        System.out.println("Brak zadań do oznaczenia (od 0) ");
                    }
                    break;

                case 3:
                    System.out.println("Podaj numer zadania do usuniecia");
                    int numerZadaniaUsun = userInput.nextInt();
                    if(numerZadaniaUsun >= 0 && numerZadaniaUsun < zadania.size()){
                        zadania.remove(numerZadaniaUsun);
                    }else{
                        System.out.println("Brak zadan do usuniecia");
                    }
                    break;


                case 4:
                    for(int i=0; i< zadania.size(); i++){
                        zadania.get(i).wyswietl();
                    }
                    break;


                case 5:
                    System.exit(0);
                    break;



            }

        }


    }

}
