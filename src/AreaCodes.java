import java.util.Scanner;

public class AreaCodes {

    public static void intro(){
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println(":::::::: Area  🇺🇸 Codes :::::::::");
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("Major US City Area Code Directory");
    }

    public static void atlanta(){
        System.out.println("City: Atlanta");
        System.out.println("Rank: 8th largest city in US");
        System.out.println("Population: 6 million (2022)");
        System.out.println("Area Codes: 404, 470, 678, 770");
        System.out.println("Fun fact: Atlanta (ATL) is known as the \"City in the Forest\".");
    }

    public static void newYork(){
        System.out.println("City: New York");
        System.out.println("Rank: 4th largest city in US");
        System.out.println("Population: 8.336 million (2022)");
        System.out.println("Zip Codes: 212, 646, 332, 917, 718, 347, 929 ");
        System.out.println("Fun fact: Chicago (CHI) is known as the \"Big Apple\".");
    }

    public static void chicago(){
        System.out.println("City: Chicago");
        System.out.println("Rank: 3th largest city in US");
        System.out.println("Population: 2.665 million (2022)");
        System.out.println("Zip Codes: 312, 773 ");
        System.out.println("Fun fact: Chicago (CHI) is known as the \"Windy City\".");
    }

    public static void losAngeles(){
        System.out.println("City: Los Angeles");
        System.out.println("Rank: 4th largest city in US");
        System.out.println("Population: 3.822 million (2022)");
        System.out.println("Zip Codes: 212, 646, 332, 917, 718, 347, 929 ");
        System.out.println("Fun fact: Chicago (CHI) is known as the \"City of Angels\".");
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
            System.out.println("\npress -1 to exit");
            System.out.print("Area code: ");
            areaCode = input.nextInt();

            // invalid area code
            if (areaCode < 100 || areaCode > 999){
                System.out.println("Oops... try using only 3 digits");
            }

            // Atlanta
            if (areaCode == 404 || areaCode == 770 || areaCode == 678 || areaCode == 470){
                atlanta();
            }

            // Chicago
            if (areaCode == 312 || areaCode == 773){
                chicago();
            }

            // New York
            if (areaCode == 212 || areaCode == 646 || areaCode == 332 || areaCode == 917
            || areaCode == 718 || areaCode == 347 || areaCode == 929){
                newYork();
            }

        }
    }

}
