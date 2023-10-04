public class LinearEquation {
    private int x;
    private int x2;
    private int y;
    private int y2;
    private double b;
    private String slope;
    private double mathSlope;

    public LinearEquation (int xPoint, int xPoint2, int yPoint, int yPoint2 ){
       x = xPoint;
       x2 = xPoint2;
       y = yPoint;
       y = yPoint2;
       b = 0;
       slope = "";
       mathSlope = 0;
    }
    public double CalculateSlope(int x,int x2 ,int y ,int y2){
        double rise = (double)y2 - (double)y;
        String numerator = ""+ (int)rise;
        double run = (double)x2 - (double)x;
        String denominator = ""+ (int)run;
        mathSlope = rise/run;
        slope = numerator + "/" + denominator;
        return mathSlope;
    }
    public String findLinearEquation(double mathSlope, int x, int y){
        b = y - (mathSlope * x);
        b = Math.round(b * 100.0) / 100.0;
        String linearEquation = slope + "x + " + b;
        return linearEquation;
    }
    public double findDistance (int x, int x2, int y, int y2){
        double xSquared = Math.pow(((double) x2 - (double) x), 2);
        double ySquared = Math.pow(((double) y2 - (double) y), 2);
        double distance = Math.sqrt(xSquared + ySquared);
        return distance;
    }
    public static double findPointOnLine(double b, double mathSlope, double userPoint){
        double pointOnLine = b + (mathSlope * userPoint);
        pointOnLine = Math.round(pointOnLine *100.0/ 100.0);
        return pointOnLine;

    }







}
