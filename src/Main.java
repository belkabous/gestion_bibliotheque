import java.util.ArrayList;
import java.util.Scanner;
import java.util.Timer;

public class Main{
   static ArrayList<Book> books = new ArrayList<>();
   static  Scanner scanner = new Scanner(System.in);





   static void menu(){
       System.out.println("options:\n" + "1-ajouter :\n2-afficher :\n3-supprimer:\n4-rechercher\n5-modifier:\n" );
       System.out.println("choisir une option:");
   }






    public static void addBook(){
        Book mybook1 = new Book();
        System.out.println("enter le nom de livre ");
        mybook1.titre = scanner.nextLine();
        System.out.println("enter le nom de auteur");
        mybook1.auteur = scanner.nextLine();
        System.out.println("enter isbn de livre");
        mybook1.isbn = scanner.nextLong();
        mybook1.dispo = true;

        books.add(mybook1);

    }


    public static void displaybook(){

        for( int i=0; i<books.size() ; i++){
            System.out.println(books.get(i).toString());
        }

    }

    public static void removebook(){
        Book mybook1 = new Book();
        System.out.println("enter le nom de livre :");
         String titre = scanner.nextLine();

        for (int i = 0 ; i < books.size() ; i++){
            if (titre.equals(books.get(i).titre)){
                mybook1 = books.get(i);
                break;
             }
         }

        if (books.isEmpty()) {
            System.out.println("Livre introuvable.");
            return;
        }

        books.remove(mybook1);
        System.out.println("Livre supprimé avec succès!");
    }






    public static void searchbook(){
        if (books.isEmpty()){
            System.out.println("la biblioteque est vide");
            return;
        }

        System.out.println("enter le nom de livre :");
        String titre = scanner.nextLine();
        Book mybook1 = new Book();

        for (int i = 0 ; i < books.size() ; i++){
            if (titre.equals(books.get(i).titre)){
                mybook1 = books.get(i);
                System.out.println(mybook1.toString());
            }else System.out.println("le livre introuvable");
        }

    }



    public static void editbook() {
        System.out.println("Enter le ISBN de livre à modifier: ");
        Long isbn = scanner.nextLong();


        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("1 - titre\n2 - auteur\n3 - disponible\n4 - emprunté");

                int choix = scanner.nextInt();
                scanner.nextLine();
                switch (choix) {
                    case 1:
                        System.out.println("enter le titre de livre:");
                        book.titre = scanner.nextLine();
                     break;
                     case 2:
                         System.out.println("enter le nom de l'auteur de livre:");
                         book.auteur= scanner.nextLine();
                     break;
                     case 3:
                         System.out.println("enter la disponibilité de livre:");
                         book.dispo = scanner.nextBoolean();
                         break;

                    default:
                        System.out.println("introuvable");
                }


            }
        }
    }
        /*
         public static void editBook() {
        System.out.println("Enter le nom de livre à modifier: ");
        String title = scanner.nextLine();

        Book bookToEdit = null;
        for (int i = 0; i < books.size(); i++) {
            if (title.equals(books.get(i).titre)) {
                bookToEdit = books.get(i);
                break;
            }
        }
         */



    public static void main(String[] args){


       int choix;


       while (true){

           menu();

           choix = scanner.nextInt();
           scanner.nextLine();

           switch (choix){
               case 1:
                   addBook();
                   break;
               case 2:
                   displaybook();
                   break;
               case 3:
                   removebook();
                   break;
               case 4:
                   searchbook();
                   break;
               case 5:
                   editbook();
                   break;
           }


       }




    }



}