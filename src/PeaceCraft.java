import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class PeaceCraft {
    public static void main(String[] args) {

//Oefening 1

        int amountOfTries =3;
        String username="";
        while (amountOfTries>0){
            System.out.println("Give in a username");
            Scanner scanner = new Scanner(System.in);
            username = scanner.next();
            if (username.toLowerCase(Locale.ROOT).contains("gori")||username.toLowerCase(Locale.ROOT).contains("harambe")) {
                System.out.println("Not a good username!");
                amountOfTries--;
                System.out.println("You have "+amountOfTries+" tries left.");
            }else {
                break;
            }

        }

        if(amountOfTries==0){
            System.out.println("You are banned");
        }else {
            System.out.println("Welcome to Peacecraft "+username);
        }

        //Oefening 2

        final int MAX_FRIENDSHIP_RANK =20;
        int currentFriendshipRank = 0;
        int currentGiftAmount= 43;

        while (currentFriendshipRank<MAX_FRIENDSHIP_RANK){
            currentFriendshipRank++;
            currentGiftAmount--;
            if (currentFriendshipRank%5==0 && currentFriendshipRank!=0){
                currentFriendshipRank++;
            }

        }
        System.out.println("You have this much gifts left: "+currentGiftAmount);

        //oefening 3

        Random random = new Random();
        int currentExperiencePoints = 0;

        for(int encounteredAmount = 0; encounteredAmount < 10; encounteredAmount++){

            int experiencePointsCurrentMonster = random.nextInt(3)+1;

            switch (experiencePointsCurrentMonster){
                case 2:
                    System.out.println("went up by 2");
                    currentExperiencePoints+=2; break;
                case 3:
                    System.out.println("went up by 3");
                    currentExperiencePoints+=3;
            }
            System.out.println("Current experiencePoints: "+currentExperiencePoints);

            if (currentExperiencePoints>=15){
                System.out.println("LEVEL UP!");
                break;
            }
        }

        //Oefening 4

        int currentCredits = 17;
        int costToParticipate = 3;

        while (currentCredits>3){
           currentCredits-=costToParticipate;
           int numberRolled = random.nextInt(20)+1;
           if(numberRolled==13){
               System.out.println("Eeeeeey! You won! And you have this left: "+currentCredits);
               break;
           }
           if (numberRolled==7){
               System.out.println("You get 2 credits extra!");
               currentCredits+=2;
               System.out.println("Current credits: "+currentCredits);
           }
            System.out.println("remaining credits: "+currentCredits);

        }



    }
}
