import java.util.Scanner;

public class AreaCodes {

    public static void intro(){
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("::: Area  🇺🇸 Codes :::");
        System.out.println("✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯✯");
        System.out.println("(look up any area code)");
    }

    //main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] cities = {"Atlanta", "Chicago", "New York", "Los Angeles", "Las Vegas", "Miami"};
        int[] areaCodes = {404, 470, 770, 678, 312, 773, 212, 718, 917, 646, 213, 323, 702, 305};

        intro();

        int areaCode = 0;

        while(areaCode != -1)
        // user input
        System.out.println("\nArea code: ");
        areaCode = input.nextInt();

    }

}
