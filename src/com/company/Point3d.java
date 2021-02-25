package com.company;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point3d {
    public double coordX;
    public double coordY;
    public double coordZ;
//конструктор по умолчанию
    public Point3d(){
        coordX=0.0;
        coordY=0.0;
        coordZ=0.0;
    }
    //конструтор инициализации
    public Point3d(double x,double y,double z){
        coordX=x;
        coordY=y;
        coordZ=z;
    }
    //сравнение на равенства двух точек
    public static boolean sravnenie(Point3d a, Point3d b){
        if (a.coordX==b.coordX  && a.coordY==b.coordY && a.coordZ==b.coordZ){
            System.out.println("Координаты двух точек совпадают");
            return true;}
        else return false;
    }
    public static double distanceTo(Point3d a, Point3d b){
        double rasstoynie=0.0;
        rasstoynie=sqrt(pow((b.coordX-a.coordX),2)+pow((b.coordY-a.coordY),2)+pow((b.coordZ-a.coordZ),2));
        return rasstoynie;
    }
}
