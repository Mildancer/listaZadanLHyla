import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        ArrayList<String> list = new ArrayList<String>();

        while (true) {
            System.out.println("wybierz 1, aby dodac nowa pozycje do listy");
            System.out.println("wybierz 2, aby wyswietlic liste");
            System.out.println("wybierz 3, aby wyjsc");

            choice = Integer.valueOf(in.nextInt());

            if (choice == 1) {
                System.out.println("Podaj nazwe zadania: ");

                String zadanie = String.valueOf(in.next());
                list.add(zadanie);
            } else if (choice == 2) {

                for (int i = 0; i < list.size(); i++) {

                    System.out.println(list.get(i));
                }
            } else if (choice == 3) {
                break;
            }

        }
    }
}


