import java.util.ArrayList;
import java.util.Scanner;

public class MainFilm {

    public static void main(String[] args) {

        //***Tworze referencję do nowego obiektu Klasy MetodyFilm
        MetodyFilm m = new MetodyFilm();

        //***Tworzę nowe obiekty filmów*****************************************
        Film f1 = new Film("Matrix");
        Film f2 = new Film("Terminator");
        Film f3 = new Film("Avatar");
        //**********************************************************************

        //***za pomoca metody dodaję do pustej tabeli typu Film referencje do nowo utworzonych obiektow typu Film
        m.addToTable(f1);
        m.addToTable(f2);
        m.addToTable(f3);
        //**********************************************************************************************************




        // W Mainie tworzę pętle, która będzie dawała 10 szans na odgadnięcie filmu z tablicy.
        //W poniższej pętli użyłem dekrementacji
        for (int i = 9; i >= 0; i--) {

            //warunek wyswietli się tylko na początku działania pętli for, gdy zmienna iteracyjna przyjmie wartość 9;
            if (i == 9) {
                System.out.println("Masz 10 szans na wpisanie właściwego filmu, powodzenia!");

            }

            //za pomoca skanera oraz System.in będę pobierał dane od użytkownika z konsoli, co każdą iterację pętli
            Scanner sc = new Scanner(System.in);
            System.out.println("Wpisz film. Powodzenia!");

            //w następnej linii wyslę wpisanego Sringa wpisanego 'z palca' do metody, która przeiteruje po wszystkich obiektach tablicy z Filmami
            //i zwróci true/false true jeśli odgadnęlismy film, false, jeśli nie odgadnęlismy filmu
            String wspisanyFilm = sc.nextLine();

            boolean question = m.czyZgadł(m.getFilms(), wspisanyFilm);

            //teraz uzywam return metody czy zgadłem film, jeśli
            if (question) {
                System.out.println("To juz koniec gry! Dobry jesteś!");

                break;
            }

            if (i == 0 && !question) {
                ArrayList<Film> lista = m.getFilms();
                System.out.println("NIE ZGADŁEŚ!");
                System.out.println("--------------------");

                m.wyswietl(lista);
                break;
            }
            // int count = i -1;
            System.out.println("Masz jeszcze " + i + " szans");

        }
    }



}
