import java.util.*;
import java.math.*;
import java.io.*;

class Main{
  public static void main(String args []){
    Scanner scan = new Scanner(System.in);
    Vector<Float> vec = new Vector<Float>();
    Random r = new Random();
    int iterations;
    float a, b, sum;
    a = 1;
    b = 5;
    //float random = a + (b-a) * r.nextFloat();
    double exact_integral;
    double estimate_integral;
    

    System.out.println("Enter number of iterations: ");
    iterations = scan.nextInt();
    scan.close();

    if (iterations <= 1){
      throw new IllegalArgumentException("Iterations must be greater than 1");
    }

    //Integral for f(x) = x^2 | (b^3)/3 - (a^3)/3
    exact_integral = (Math.pow(b,3)/3) - (Math.pow(a,3)/3);

    System.out.println("Exact integral = " + exact_integral);


    //estimate for the integral f(x) = x^2 from 1 to 5
    //by averaging areas under the curve where area = (5-1)*x^2
    //A = (b-a)*f(x)
    for (int i = 0; i < iterations; ++i){
      float random = a + (b-a) * r.nextFloat();
      sum = 0;
      sum = (b-a) * (float)Math.pow(random,2);
      vec.add(sum);
    }

    double vec_sum = 0;
    for (int i = 0; i < vec.size(); ++i){
      //System.out.println(vec.get(i));
      vec_sum += vec.get(i);
    }
    
    double average = vec_sum/vec.size();
    System.out.println("Estimated integral: " + average);
  }
}