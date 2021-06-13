import java.util.ArrayList;

public class MetodyFilm {


    //Pusta tabela, która będzie przyjmowała obiekty typu Film
    static ArrayList<Film> tablicaFilmow = new ArrayList<>();

    //metoda, która dodaja obiekty typu Film do Tabeli
    public void addToTable(Film film) {

        tablicaFilmow.add(film);
    }

    //getter tablicy z Filmami
    public static ArrayList<Film> getTablicaFilmow() {
        return tablicaFilmow;
    }

    //metoda zwróci tablicę, w której są obiekty typu Filmów
    public ArrayList<Film> getFilms() {

        return tablicaFilmow;

    }

    //Dzięki skróconej pętli for, wyświetlę filmy w konsoli
    //uwzględnię tę metodę w Mainie, gdy nie uda się odgadnac filmu
    public void wyswietl(ArrayList<Film> film) {

        System.out.println("Poniżej wyswietlono filmy z tabeli:");

        for(Film aaa: film){

            System.out.println(aaa.getTytuł());
        }

    }


    //ta metoda zwraca mi boolean czy zgadł czy nie, na poczatku inicjuję zmienną typu boolean na false, po czym będę iterował po tablicy z filmami, pobierając
    //tytuł i porównując go do wpisanego przez uzytkownika 'z palca' - jako inputa uzyję Scannera
    public boolean czyZgadł(ArrayList<Film> arrayFilm, String input) {

        boolean czyTak = false;


        for(int i = 0; i <= arrayFilm.size() - 1; i++) {

            //Sprawdzam w pętli czy

            if(arrayFilm.get(i).getTytuł().equals(input)) {

                czyTak = true;

                System.out.println("\nZgadłeś film: " + arrayFilm.get(i).getTytuł());
                break;

            }

        }

        return czyTak;
    }

}
