public class Book{

    String titre, auteur;
    Long isbn;
    boolean dispo = true;


    @Override
    public String toString() {
        return "Book{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn=" + isbn +
                ", dispo=" + dispo +
                '}';
    }
}