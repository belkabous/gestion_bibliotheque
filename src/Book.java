public class Book extends Main{

    String titre, auteur;
    Long isbn;
    boolean dispo = true;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

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