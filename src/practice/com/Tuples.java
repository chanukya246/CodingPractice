package practice.com;

import javafx.geometry.Point3D;

import java.awt.*;

public class Tuples {

    public static void main (String[] args)
    {
        int X[] = {1,2,7};
        int Y[] = {3,4,9};
        int Z[] = {5,6,3};

        printTuples(X, Y, Z);
    }

    private static void printTuples(int[] x, int[] y, int[] z) {

        for(int i=0; i<x.length; i++){
            for(int j=0; j<y.length; j++){
                for(int k=0; k<z.length; k++){
                    if(z[k]-y[j]==x[i]){
                       // Point3D point = new Point3D(x[i],y[j],z[k]);
                        System.out.println("("+x[i]+","+y[j]+","+z[k]+")");
                    }
                }
            }
        }

    }

}
