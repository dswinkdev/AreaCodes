import java.util.Scanner;

public class AreaCodes {

        // intro
        public static void intro(){
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println(":::::::: Area  🇺🇸 Codes :::::::::");
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("Major US City Area Code Directory");
        }

        // dev's city
        public static void atlanta(){
        System.out.println("City: Atlanta");
        System.out.println("Rank: 38th largest city in US");
        System.out.println("Population: 6 million (2022)");
        System.out.println("Area Codes: 404, 470, 678, 770");
        System.out.println("Fun fact: Atlanta (ATL) is known as the \"City in the Forest\".");
        }

        // Cities ranked highest to lowest
        public static void newYork(){
        System.out.println("City: New York");
        System.out.println("Rank: 1st largest city in US");
        System.out.println("Population: 19.9 million");
        System.out.println("Zip Codes: 212, 646, 332, 917, 718, 347, 929 ");
        System.out.println("Fun fact: Chicago (NY) is known as the \"Big Apple\".");
        }

        public static void losAngeles(){
        System.out.println("City: Los Angeles");
        System.out.println("Rank: 2nd largest city in US");
        System.out.println("Population: 13.2 million");
        System.out.println("Zip Codes: 212, 646, 332, 917, 718, 347, 929 ");
        System.out.println("Fun fact: Los Angeles (LA) is known as the \"City of Angels\".");
        }

        public static void chicago(){
        System.out.println("City: Chicago");
        System.out.println("Rank: 3th largest city in US");
        System.out.println("Population: 9.5 million");
        System.out.println("Zip Codes: 312, 773 ");
        System.out.println("Fun fact: Chicago (CHI) is known as the \"Windy City\".");
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

            // New York
            if (areaCode == 212 || areaCode == 646 || areaCode == 332 || areaCode == 917
                    || areaCode == 718 || areaCode == 347 || areaCode == 929){
                newYork();
            }

            // Los Angeles
            if (areaCode == 213 || areaCode == 323 || areaCode == 310 || areaCode == 424
                    || areaCode == 818 || areaCode == 747){
                losAngeles();
            }

            // Chicago
            if (areaCode == 312 || areaCode == 773){
                chicago();
            }



        }
    }

}
