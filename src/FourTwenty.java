import java.util.Locale;
import java.util.Scanner;

public class FourTwenty {
    public static void main(String[] args) {

        //while + for loop

        int amountOfPlant = 20;
        int amountOfTimesWatered =0;

        while (amountOfTimesWatered<4){
            amountOfTimesWatered++;
           for (int numberOfPlant = 1;numberOfPlant<amountOfPlant+1 ;numberOfPlant++){
               System.out.println("Plant "+numberOfPlant+" got watered "+amountOfTimesWatered+" time(s).");
           }

        }
        //while + for loop extra

        amountOfPlant = 20;
        int maxAmountOfWater =200;
        int amountWatered= 0;

        while (maxAmountOfWater>0){
            amountWatered++;
            for (int numberOfPlant = 1;numberOfPlant<amountOfPlant+1 ;numberOfPlant++){
                System.out.println("Plant "+numberOfPlant+" got watered "+amountWatered+" time(s).");
                maxAmountOfWater--;
            }

        }

        //Switch

        System.out.println("What season is it now?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();


        switch (season.toLowerCase(Locale.ROOT)){
            case "summer":
                System.out.println("Plant gets 3");break;
            case "winter":
                System.out.println("Plant gets 1");break;
            default:
                System.out.println("Plant gets 2");
        }

        //bonus
        int hours = 0;

        switch (season.toLowerCase(Locale.ROOT)){
            case "summer":while (hours<24) {
                if(hours%6==0) {
                    System.out.println("It's "+ hours+ " hour.");
                    System.out.println("Plant gets 3");
                }
                hours++;
            }break;
            case "winter":
                System.out.println("Plant gets 1");break;
            default:
                System.out.println("Plant gets 2");
        }


    }
}
