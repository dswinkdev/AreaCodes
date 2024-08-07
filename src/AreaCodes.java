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
        System.out.println("City: Atlanta, Georgia");
        System.out.println("Rank: 38th largest city in US");
        System.out.println("Population: 6 million (2022)");
        System.out.println("Area Codes: 404, 470, 678, 770");
        System.out.println("Fun fact: Atlanta (ATL) is known as the \"City in the Forest 🌳🌳🌳\".");
        }

        // Cities ranked highest to lowest

        // 1
        public static void newYork(){
        System.out.println("City: New York, New York");
        System.out.println("Rank: 1st largest city in US");
        System.out.println("Population: 19.9 million");
        System.out.println("Zip Codes: 212, 646, 332, 917, 718, 347, 929");
        System.out.println("Fun fact: New York (NY) is known as the \"Big 🍎 Apple\".");
        }

        // 2
        public static void losAngeles(){
        System.out.println("City: Los Angeles, California");
        System.out.println("Rank: 2nd largest city in US");
        System.out.println("Population: 13.2 million");
        System.out.println("Zip Codes: 213, 323, 310, 424, 818, 747");
        System.out.println("Fun fact: Los Angeles (LA) is known as the \"City of Angels 👼🏿👼🏼👼🏾👼🏻👼🏽\".");
        }

        // 3
        public static void chicago(){
        System.out.println("City: Chicago, Illinois");
        System.out.println("Rank: 3th largest city in US");
        System.out.println("Population: 9.5 million");
        System.out.println("Zip Codes: 312, 773");
        System.out.println("Fun fact: Chicago (CHI) is known as the \"Windy 🌬️City\".");
        }

        // 4
        public static void houston(){
        System.out.println("City: Houston, Texas");
        System.out.println("Rank: 4th largest city in US");
        System.out.println("Population: 7.1 million");
        System.out.println("Zip Codes: 713, 281, 832, 346");
        System.out.println("Fun fact: Houston (HOU) is known as the \"Space 🚀City\".");
        }

        // 5
        public static void phoenix(){
        System.out.println("City: Phoenix, Arizona");
        System.out.println("Rank: 5th largest city in US");
        System.out.println("Population: 5.2 million");
        System.out.println("Zip Codes: 602, 480, 623");
        System.out.println("Fun fact: Phoenix (PHX) is known as the \"Valley of the ☀️\".");
        }

        // 6
        public static void philly(){
        System.out.println("City: Philadelphia, Pennsylvania");
        System.out.println("Rank: 6th largest city in US");
        System.out.println("Population: 6.2 million");
        System.out.println("Zip Codes: 215, 267, 445");
        System.out.println("Fun fact: Philly (PHL) is known as the \"City of Brotherly ❤️\".");
        }

        // 7
        public static void sanAntonio(){
        System.out.println("City: San Antonio, Texas");
        System.out.println("Rank: 7th largest city in US");
        System.out.println("Population: 2.6 million");
        System.out.println("Zip Codes: 210, 726");
        System.out.println("Fun fact: San Antonio (SATX) is known as the \"River 🌊 City️\".");
        }

        // 8
        public static void sanDiego(){
        System.out.println("City: San Diego, California");
        System.out.println("Rank: 8th largest city in US");
        System.out.println("Population: 3.4 million");
        System.out.println("Zip Codes: 619, 858");
        System.out.println("Fun fact: San Diego (SD) is known as the \"🇺🇸's Finest City\".");
        }

        // 7
        public static void dallas(){
        System.out.println("City: Dallas, Texas");
        System.out.println("Rank: 9th largest city in US");
        System.out.println("Population: 7.5 million");
        System.out.println("Zip Codes: 214, 469, 972, 945");
        System.out.println("Fun fact: Dallas (DAL) is known as the \"Big D\".");
        }



    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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

            // Houston
            if (areaCode == 713 || areaCode == 281 || areaCode == 832 || areaCode == 346){
                houston();
            }

            // Phoenix
            if (areaCode == 602 || areaCode == 480 || areaCode == 623){
                phoenix();
            }

            // Philly
            if (areaCode == 215 || areaCode == 267 || areaCode == 445){
                philly();
            }

            // San Antonio
            if (areaCode == 210 || areaCode == 726){
                sanAntonio();
            }

            // Dallas
            if (areaCode == 214 || areaCode == 469 || areaCode == 972 || areaCode == 945){
                dallas();
            }

            // San Diego
            if (areaCode == 619 || areaCode == 858){
                sanDiego();
            }


        }
    }

}
