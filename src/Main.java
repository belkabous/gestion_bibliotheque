import java.util.ArrayList;
import java.util.Scanner;

public class Main{
   static ArrayList<Book> books = new ArrayList<>();
   static  Scanner scanner = new Scanner(System.in);





   static void menu(){
       System.out.println("options:\n" + "1-ajouter :\n2-afficher :\n3-supprimer:\n4- rechercher\n" );
       System.out.println("choisir une option:");
   }






    public static void addBook(){
        Book mybook1 = new Book();
        System.out.println("enter le nom de livre ");
        mybook1.titre = scanner.next();
        System.out.println("enter le nom de auteur");
        mybook1.auteur = scanner.next();
        System.out.println("enter isbn de livre");
        mybook1.isbn = scanner.nextLong();
        System.out.println("disponibilite");
        mybook1.dispo = scanner.nextBoolean();

        books.add(mybook1);

    }


    public static void displaybook(){

        for( int i=0; i<books.size() ; i++){
            System.out.println(books.get(i).toString());
        }

    }

    public static void removebook(){
        System.out.println("enter le nom de livre :");
         String titre = scanner.nextLine();


         Book mybook1 = new Book();

        for (int i = 0 ; i < books.size() ; i++){
            if (titre.equals(books.get(i).titre)){

                mybook1 = books.get(i);
             }
         }

        books.remove(mybook1);
    }


    public static void searchbook(){

        String titre = scanner.nextLine();
        Book mybook1 = new Book();

        for (int i = 0 ; i < books.size() ; i++){
            if (titre.equals(books.get(i).titre)){

                mybook1 = books.get(i);

            }
        }
        System.out.println(mybook1.toString());
    }



    public static void editbook(){


       String titre = scanner.nextLine();
        Book mybook1 = new Book();


        for (int i = 0 ; i < books.size() ; i++){
            if (titre.equals(books.get(i).titre)) {
                mybook1 = books.get(i);
            }

            }
        }



    public static void main(String[] args){


       int choix;


       while (true){

           menu();

           choix = scanner.nextInt();

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
           }


       }




    }



}