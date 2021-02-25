package com.company;
import java.util.Scanner;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Lab1 {
    public static void main(String[] args) {
        Scanner coordiata= new Scanner(System.in);
        double x,y,z,x2,y2,z2;
    System.out.println("Введите значения координат для 1");
        x=coordiata.nextDouble();
        y=coordiata.nextDouble();
        z=coordiata.nextDouble();
        System.out.println("Введите значения координат для 2");
        x2=coordiata.nextDouble();
        y2=coordiata.nextDouble();
        z2=coordiata.nextDouble();
        System.out.println("Зачения 3 будут по умолчанию");
        Point3d first= new Point3d(x,y,z);
        Point3d second= new Point3d(x2,y2,z2);
        Point3d third= new Point3d();
        //проверка точек на совпадение
        if (Point3d.sravnenie(first,second)||Point3d.sravnenie(first,third)||Point3d.sravnenie(third,second));
        else {
            double otvet = computeArea(first, second, third);
            System.out.print("Площадь треугольника= ");
            System.out.printf("%.2f", otvet);
        }
    }
    //подсчет площади треугольника
    public static double computeArea(Point3d a,Point3d b,Point3d c){
    double storona1,storona2, storona3, poluper,Ploshad;
        storona1=sqrt(pow(a.coordX-b.coordX,2)+pow(a.coordY-b.coordY,2)+pow(a.coordZ-b.coordZ,2));
        storona2=sqrt(pow(b.coordX-c.coordX,2)+pow(b.coordY-c.coordY,2)+pow(b.coordZ-c.coordZ,2));
        storona3=sqrt(pow(c.coordX-a.coordX,2)+pow(c.coordY-a.coordY,2)+pow(c.coordZ-a.coordZ,2));
        poluper=(storona1+storona2+storona3)/2;
    Ploshad=sqrt(poluper*(poluper-storona1)*(poluper-storona2)*(poluper-storona3));
    return Ploshad;
    }

}
