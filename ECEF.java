import java.math.*;
import java.util.*;

class ECEF{
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
    double Lat = 0 , Lon = 0,  Alt = 0;
    
    double a = 6378137.0; //Earth Semi Major axis in meters
    
    double f = 1.0/298.257223563; //reciprocal flattening
    
    double e2 = 2*f - f*f; //squared eccentricity;
    //double e = 8.1819190842622e-2;
    double chi; 


    System.out.println("Enter Latitude: ");
    Lat = scan.nextDouble();
    System.out.println("Enter Longitude: ");
    Lon = scan.nextDouble();
    System.out.println("Enter Altitude: ");
    Alt = scan.nextDouble();
    scan.close();

    Lat = Lat*Math.PI/180.0;
    Lon = Lon*Math.PI/180.0;

    chi = Math.sqrt(1-e2 * Math.sin(Lat) * Math.sin(Lat));
    //Lat
    double x = ((a/chi + Alt) * Math.cos(Lat) * Math.cos(Lon));
    //Long
    double y = ((a/chi + Alt) * Math.cos(Lat) * Math.sin(Lon));
    //Alt
    double z = (a*(1.0-e2)/chi + Alt) * Math.sin(Lat);

    System.out.println("X: " + x);
    System.out.println("Y: " + y);
    System.out.println("Z: " + z);
  }
}