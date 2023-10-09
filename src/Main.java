import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //user inputs values
     System.out.print("Enter first pair of coordinate points: ");
     String firstPair = s.nextLine();
     System.out.print("Enter second pair of coordinate points: ");
     String secondPair = s.nextLine();
     //gets integer value of first coordinates
     int firstLen = firstPair.length();
     int commaNum = firstPair.indexOf(",");
     String firstPairNum = firstPair.substring(0,commaNum);
     String firstPairNum2 = firstPair.substring(commaNum+1);
     int pairNum = Integer.valueOf(firstPairNum);
     int pairNum2 = Integer.valueOf(firstPairNum2);
     // gets integer value of second pair of coordinates
     int secondLen = secondPair.length();
     int commaNum2 = secondPair.indexOf(",");
     String secondPairNum = secondPair.substring(0,commaNum);
     String secondPairNum2 = secondPair.substring(commaNum+1);
     int secPairNum = Integer.valueOf(secondPairNum);
     int secPairNum2 = Integer.valueOf(secondPairNum2);
     LinearEquation equation = new LinearEquation(pairNum, pairNum2, secPairNum, secPairNum2);
     double slope = equation.calculateSlope();
     String linearEquation = equation.findLinearEquation();
     double distance = equation.findDistance();
     System.out.print("Slope: " + slope)
     ;



    }
}