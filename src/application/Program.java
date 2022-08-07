package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.print("How many people you'll type? ");
        int n = key.nextInt();

        int[] age = new int[n];
        String[] name = new String[n];

        String personOlder = "";
        int ageOlder = 0;

        for (int i = 0; i < n; i++){
            System.out.println((i+1) + "# person details");
            key.nextLine();
            System.out.print("Name: ");
            name[i] = key.nextLine();

            System.out.print("Age: ");
            age[i] = key.nextInt();


            if (age[i] > ageOlder){
                ageOlder = age[i];
                personOlder = name[i];
            }
        }

        System.out.println();
        System.out.println("Older Person: " + personOlder);

    }
}
