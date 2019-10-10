import java.math.*;
import java.util.*;

class ECEF{
  public static void clear(){
  System.out.println("\033[H\033[2J");
  System.out.flush();
}

public static void LLAtoECEF(){
  Scanner scan = new Scanner(System.in);
  double Lat = 0 , Lon = 0,  Alt = 0;
  double a = 6378137.0; //equitorial radius of earth in meters
  double f = 1.0/298.257223563; //reciprocal flattening
  double e2 = 2*f - f*f; //squared eccentricity;
  double chi; 

  System.out.println("Enter Latitude: ");
  Lat = scan.nextDouble();
  System.out.println("Enter Longitude: ");
  Lon = scan.nextDouble();
  System.out.println("Enter Altitude: ");
  Alt = scan.nextDouble();
  scan.close();

  if (Alt < 0){
    throw new IllegalArgumentException("Altitude less than 0. Not intended for use with submarines.");
  }

  Lat = Lat*Math.PI/180.0; //convert Latitude to Radians
  Lon = Lon*Math.PI/180.0; //convert Longitude to Radians

  chi = Math.sqrt(1-e2 * Math.sin(Lat) * Math.sin(Lat));

  // a/chi = the prime vertical radius of curvature;
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

public static void ECEFtoLLA(){
  Scanner scan = new Scanner(System.in);
  double x = 0, y = 0, z = 0;
  double P, theta, sin_cube, cos_cube;
  double lat_numerator, lat_denominator;
  double Lat, Lon, Alt;
  double A = 6378137.0;
  double B = 6356752.3;
  double ecc = 8.1819190842622e-2; //eccentricity
  double e2 = Math.pow(ecc,2);
  double N;

  System.out.println("Enter X value: ");
  x = scan.nextDouble();
  System.out.println("Enter Y Value: ");
  y = scan.nextDouble();
  System.out.println("Enter Z Value: ");
  z = scan.nextDouble();
  scan.close();

  // P = x^2 + y^2;
  P = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
  theta = Math.atan(z*A/(P*B));

  sin_cube = Math.pow(Math.sin(theta),3); //sin()^3 (not sin^3())
  cos_cube = Math.pow(Math.cos(theta),3); //cos()^3
  
  lat_numerator = z + ((A*A-B*B)/B)*sin_cube;
  lat_denominator = P - ecc * ecc * A * cos_cube;

  Lat = Math.atan(lat_numerator / lat_denominator);
  Lon = Math.atan2(y, x);
  N = A / Math.sqrt(1-e2*Math.pow(Math.sin(Lat),2));
  Alt = P / Math.cos(Lat) - N;
  
  Lat = Lat*180.0/Math.PI;
  Lon = Lon*180.0/Math.PI;

  System.out.println("\nLatitude: " + Lat);
  System.out.println("Longitude: " + Lon);
  System.out.println("Altitude: " + Alt);
}

  public static void main (String [] args ){
    Scanner scan = new Scanner(System.in);

    System.out.println("1. Lat, Long, Alt to ECEF");
    System.out.println("2. ECEF to Lat, Long, Alt");
    int input = scan.nextInt();
  
    switch(input){
      case 1:
        LLAtoECEF();
        break;

      case(2):
        ECEFtoLLA();
        break; 
         
      default:
        System.out.println("Invalid input");
        break;
    }
  }
}