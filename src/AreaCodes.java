import java.util.Scanner;

public class AreaCodes {

    public static void intro(){
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("::: Area  🇺🇸 Codes :::");
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("(look up any area code)");
    }

    public static void atlanta(){
        System.out.println("Atlanta");
        System.out.println("Population: ");
        System.out.println("Fun fact: ");
    }

    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[][] region = {{"North", "East", "South", "West"}};
        String[][] cities = {{"Atlanta", "Chicago", "New York", "Los Angeles", "Las Vegas", "Miami"}};
        String[][] atlanta = {{"South"}, {"404, 770, 678, 470"}, {"Fun fact: Atlanta is known as the \"city in the forest\""}};
        int[] areaCodes = {404, 470, 770, 678, 312, 773, 212, 718, 917, 646, 213, 323, 702, 305};


        intro();

        int areaCode = 0;

        while(areaCode != -1) {

            // user input
            System.out.print("\nArea code: ");
            areaCode = input.nextInt();

            // invalid area code
            if (areaCode <= 100 && areaCode >= 999){
                System.out.println("Invalid area code");
            }

            // Atlanta
            if (areaCode == 404 || areaCode == 770 || areaCode == 678 || areaCode == 470){
                atlanta();
            }

        }
    }

}
