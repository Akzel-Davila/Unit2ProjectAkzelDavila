import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //user inputs values
     System.out.print("Enter first pair of coordinate points: ");
     String firstPair = s.nextLine();
     String originalPair= firstPair;
     System.out.print("Enter second pair of coordinate points: ");
     String secondPair = s.nextLine();
     String originalPair2 = secondPair;
     //gets integer value of first coordinates
     int firstLen = firstPair.length();
     firstPair = firstPair.substring(1,firstLen-1);
     int commaNum = firstPair.indexOf(",");
     String firstPairNum = firstPair.substring(0,commaNum);
     String firstPairNum2 = firstPair.substring(commaNum+1);
     int pairNum = Integer.parseInt(firstPairNum);
     int pairNum2 = Integer.parseInt(firstPairNum2);

     // gets integer value of second pair of coordinates
     int secondLen = secondPair.length();
     secondPair = secondPair.substring(1,secondLen-1);
     int commaNum2 = secondPair.indexOf(",");
     String secondPairNum = secondPair.substring(0,commaNum2);
     String secondPairNum2 = secondPair.substring(commaNum2+1);
     int secPairNum = Integer.parseInt(secondPairNum);
     int secPairNum2 = Integer.parseInt(secondPairNum2);

     //creates new instance and its corresponding methods
     LinearEquation equation = new LinearEquation(pairNum, pairNum2, secPairNum, secPairNum2);
     double slope = equation.calculateSlope();
     String linearEquation = equation.findLinearEquation();
     double distance = equation.findDistance();
     double yInt = equation.returnYIntercept();
     //print statement
     System.out.println("First Pair: " + originalPair);
     System.out.println("Second Pair: " + originalPair2);
     System.out.println("Slope: " + slope);
     System.out.println("Y-Intercept: " + yInt);
     System.out.println("Slope intercept form: " + linearEquation);
     System.out.println("Distance between points: " + distance);
     //Third Point equation
     System.out.print("Enter a third x-value: ");
     double userPoint = Double.parseDouble(s.nextLine());
     double pointOnLine = equation.findPointOnLine(userPoint);
     System.out.println("Solved coordinate point is: (" +userPoint + "," + pointOnLine + ")");



    }
}