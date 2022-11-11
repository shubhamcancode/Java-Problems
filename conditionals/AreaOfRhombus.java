package conditional.easy;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Scanner;

public class AreaOfRhombus {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
//    d1 & d2 are diagonal inputs
    int d1 = 40;
    int d2 = 30;
    double Area;
    Area = 0.5*d1*d2;
    System.out.println("The Area of Rhombus is = "+ Area);
}
}
