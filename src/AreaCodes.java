import java.util.Scanner;

public class AreaCodes {

    // intro
    public static void intro(){
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println(":::::::: Area  🇺🇸 Codes :::::::::");
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("Major US City Area Code Directory");
    }

    // Cities ranked highest to lowest

    public static void newYork(){
        System.out.println("City: New York, New York");
        System.out.println("Rank: 1st largest city in US");
        System.out.println("Population: 19.9 million");
        System.out.println("Area Codes: 212, 646, 332, 917, 718, 347, 929");
        System.out.println("Fun fact: New York (NY) is known as the \"Big 🍎 Apple\".");
    }

    public static void losAngeles(){
        System.out.println("City: Los Angeles, California");
        System.out.println("Rank: 2nd largest city in US");
        System.out.println("Population: 13.2 million");
        System.out.println("Area Codes: 213, 323, 310, 424, 818, 747");
        System.out.println("Fun fact: Los Angeles (LA) is known as the \"City of Angels 👼🏿👼🏼👼🏾👼🏻👼🏽\".");
    }

    public static void chicago(){
        System.out.println("City: Chicago, Illinois");
        System.out.println("Rank: 3rd largest city in US");
        System.out.println("Population: 9.5 million");
        System.out.println("Area Codes: 312, 773");
        System.out.println("Fun fact: Chicago (CHI) is known as the \"Windy 🌬️City\".");
    }

    public static void houston(){
        System.out.println("City: Houston, Texas");
        System.out.println("Rank: 4th largest city in US");
        System.out.println("Population: 7.1 million");
        System.out.println("Area Codes: 713, 281, 832, 346");
        System.out.println("Fun fact: Houston (HOU) is known as the \"Space 🚀City\".");
    }

    public static void phoenix(){
        System.out.println("City: Phoenix, Arizona");
        System.out.println("Rank: 5th largest city in US");
        System.out.println("Population: 5.2 million");
        System.out.println("Area Codes: 602, 480, 623");
        System.out.println("Fun fact: Phoenix (PHX) is known as the \"Valley of the ☀️\".");
    }

    public static void atlanta(){
        System.out.println("City: Atlanta, Georgia");
        System.out.println("Rank: 6th largest city in US");
        System.out.println("Population: 6 million");
        System.out.println("Area Codes: 404, 470, 678, 770");
        System.out.println("Fun fact: Atlanta (ATL) is known as the \"City in the Forest 🌳🌳🌳\".");
    }

    public static void philly(){
        System.out.println("City: Philadelphia, Pennsylvania");
        System.out.println("Rank: 7th largest city in US");
        System.out.println("Population: 6.2 million");
        System.out.println("Area Codes: 215, 267, 445");
        System.out.println("Fun fact: Philly (PHL) is known as the \"City of Brotherly ❤️\".");
    }

    public static void sanAntonio(){
        System.out.println("City: San Antonio, Texas");
        System.out.println("Rank: 8th largest city in US");
        System.out.println("Population: 2.6 million");
        System.out.println("Area Codes: 210, 726");
        System.out.println("Fun fact: San Antonio (SATX) is known as the \"River 🌊 City️\".");
    }

    public static void sanDiego(){
        System.out.println("City: San Diego, California");
        System.out.println("Rank: 9th largest city in US");
        System.out.println("Population: 3.4 million");
        System.out.println("Area Codes: 619, 858");
        System.out.println("Fun fact: San Diego (SD) is known as \"🇺🇸's Finest City\".");
    }

    public static void dallas(){
        System.out.println("City: Dallas, Texas");
        System.out.println("Rank: 10th largest city in US");
        System.out.println("Population: 7.5 million");
        System.out.println("Area Codes: 214, 469, 972, 945");
        System.out.println("Fun fact: Dallas (DAL) is known as the \"Big D\".");
    }

    public static void sanJose(){
        System.out.println("City: San Jose, California");
        System.out.println("Rank: 11th largest city in US");
        System.out.println("Population: 2 million");
        System.out.println("Area Codes: 408, 669");
        System.out.println("Fun fact: San Jose (SJS) is known as the \"Capital of Silicon Valley\".");
    }

    public static void austin(){
        System.out.println("City: Austin, Texas");
        System.out.println("Rank: 12th largest city in US");
        System.out.println("Population: 2 million");
        System.out.println("Area Codes: 512, 737");
        System.out.println("Fun fact: Austin (AUS) is known as the \"Live 🎶🎵🎶 Capital of the World\".");
    }

    public static void jacksonville(){
        System.out.println("City: Jacksonville, Florida");
        System.out.println("Rank: 13th largest city in US");
        System.out.println("Population: 1.6 million");
        System.out.println("Area Code: 904");
        System.out.println("Fun fact: Jacksonville (JAX) is known as the \"Bold New 🌆 of the South\".");
    }

    public static void fortWorth(){
        System.out.println("City: Fort Worth, Texas");
        System.out.println("Rank: 14th largest city in US");
        System.out.println("Population: 2.8 million");
        System.out.println("Area Codes: 817, 682");
        System.out.println("Fun fact: Fort Worth (FW) is known as \"Cow 🐮Town\".");
    }

    public static void columbus(){
        System.out.println("City: Columbus, Ohio");
        System.out.println("Rank: 15th largest city in US");
        System.out.println("Population: 2.2 million");
        System.out.println("Area Codes: 614, 380");
        System.out.println("Fun fact: Columbus (CBUS) is known as \"The Arch City\".");
    }

    public static void indianapolis(){
        System.out.println("City: Indianapolis, Indiana");
        System.out.println("Rank: 16th largest city in US");
        System.out.println("Population: 2 million");
        System.out.println("Area Codes: 317, 463");
        System.out.println("Fun fact: Indianapolis (IND) is known as \"The Indy 🏁\".");
    }

    public static void charlotte(){
        System.out.println("City: Charlotte, North Carolina");
        System.out.println("Rank: 17th largest city in US");
        System.out.println("Population: 2.7 million");
        System.out.println("Area Codes: 704, 980");
        System.out.println("Fun fact: Charlotte (CLT) is known as the \"Queen 👸🏽 City\".");
    }

    public static void sanFrancisco(){
        System.out.println("City: San Francisco, California");
        System.out.println("Rank: 18th largest city in US");
        System.out.println("Population: 4.7 million");
        System.out.println("Area Codes: 415, 628");
        System.out.println("Fun fact: San Francisco (SF) is known as \"The City by the Bay 🌊\".");
    }

    public static void seattle(){
        System.out.println("City: Seattle, Washington");
        System.out.println("Rank: 19th largest city in US");
        System.out.println("Population: 3 million");
        System.out.println("Area Code: 206");
        System.out.println("Fun fact: Seattle (SEA) is known as the \"Emerald 💎✨City\".");
    }

    public static void denver(){
        System.out.println("City: Denver, Colorado");
        System.out.println("Rank: 20th largest city in US");
        System.out.println("Population: 3 million");
        System.out.println("Area Codes: 303, 720");
        System.out.println("Fun fact: Denver (DEN) is known as the \"Mile-High City\".");
    }

    public static void washington(){
        System.out.println("City: Washington, D.C.");
        System.out.println("Rank: 21st largest city in US");
        System.out.println("Population: 6.3 million");
        System.out.println("Area Code: 202");
        System.out.println("Fun fact: Washington DC is known as the \"The Capital City 🏛️\".");
    }

    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        intro();

        int areaCode = 0;

        while(areaCode != -1) {
            // user input
            System.out.println("\nPress -1 to exit");
            System.out.print("Area code: ");
            areaCode = input.nextInt();

            // invalid area code
            if (areaCode < 100 || areaCode > 999){
                System.out.println("Oops... try using only 3 digits.");
            } else {
                // Call the appropriate method based on area code
                switch (areaCode) {
                    case 404:
                    case 470:
                    case 678:
                    case 770:
                        atlanta();
                        break;
                    case 212:
                    case 646:
                    case 332:
                    case 917:
                    case 718:
                    case 347:
                    case 929:
                        newYork();
                        break;
                    case 213:
                    case 323:
                    case 310:
                    case 424:
                    case 818:
                    case 747:
                        losAngeles();
                        break;
                    case 312:
                    case 773:
                        chicago();
                        break;
                    case 713:
                    case 281:
                    case 832:
                    case 346:
                        houston();
                        break;
                    case 602:
                    case 480:
                    case 623:
                        phoenix();
                        break;
                    case 215:
                    case 267:
                    case 445:
                        philly();
                        break;
                    case 210:
                    case 726:
                        sanAntonio();
                        break;
                    case 619:
                    case 858:
                        sanDiego();
                        break;
                    case 214:
                    case 469:
                    case 972:
                    case 945:
                        dallas();
                        break;
                    case 408:
                    case 669:
                        sanJose();
                        break;
                    case 512:
                    case 737:
                        austin();
                        break;
                    case 904:
                        jacksonville();
                        break;
                    case 817:
                    case 682:
                        fortWorth();
                        break;
                    case 614:
                    case 380:
                        columbus();
                        break;
                    case 317:
                    case 463:
                        indianapolis();
                        break;
                    case 704:
                    case 980:
                        charlotte();
                        break;
                    case 415:
                    case 628:
                        sanFrancisco();
                        break;
                    case 206:
                        seattle();
                        break;
                    case 303:
                    case 720:
                        denver();
                        break;
                    case 202:
                        washington();
                        break;
                    default:
                        System.out.println("Area code not found.");
                }
            }
        }
        input.close();
    }
}
