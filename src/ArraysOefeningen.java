import java.util.Arrays;

public class ArraysOefeningen {
    public static void main(String[] args) {

        //leerkracht

        int [] studentPoints = {1, 5, 6,-9,77,110, -4, 3, 10, 2};

        for(int i = 0; i <studentPoints.length; i++){
            if(studentPoints[i]>10){
                studentPoints[i]= studentPoints[i]/11;
            }
            if(studentPoints[i]<0){
                studentPoints[i]= studentPoints[i]*-1;
            }
            if(studentPoints[i]<3){
                studentPoints[i]= studentPoints[i]*3;
            }
        }

        System.out.println(Arrays.toString(studentPoints));


        //supreme

        ShoePair nike = new ShoePair("Nike",false,"white", 41, 69.99);
        ShoePair timberLand = new ShoePair("TimberLand",true,"brown", 41, 219.99);
        ShoePair balenciaga = new ShoePair("Balenciaga",true,"black", 45, 429.99);
        ShoePair nike2 = new ShoePair("Nike",true,"white", 42,29.99);
        ShoePair timberLand2 = new ShoePair("TimberLand",true,"black", 39, 170);
        ShoePair balenciaga2 = new ShoePair("Balenciaga",false,"black", 45, 50);
        ShoePair nike3 = new ShoePair("Nike",true,"white", 41, 79.99);
        ShoePair timberLand3 = new ShoePair("TimberLand",true,"yellow", 41, 80);
        ShoePair balenciaga3 = new ShoePair("Balenciaga",false,"black", 37, 349.99);

        ShoePair [] shoePairs = {nike,timberLand,balenciaga,nike2,timberLand2,balenciaga2,nike3,timberLand3,balenciaga3};

        for (ShoePair pair: shoePairs){
            if (pair.isComplete()&& pair.getSize()==41){
                System.out.println(pair);
            }
        }
        System.out.println("-----------");
        //2de iteratie
        double totalMoneyLost = 0;

        for (ShoePair pair: shoePairs){
            if (!pair.isComplete()){
                System.out.println(pair);
                totalMoneyLost+= pair.getPrice();
            }
        }

        System.out.println("You most $"+totalMoneyLost);


    }
}
