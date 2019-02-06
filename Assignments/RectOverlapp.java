import java.util.Scanner;

public class RectOverlapp{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Details for Rectangle 1.");
    System.out.print("Enter x-axis for bottom left point: ");
    int r1_bl_x = sc.nextInt();
    System.out.print("Enter y-axis for bottom left point: ");
    int r1_bl_y = sc.nextInt();
    System.out.print("Enter x-axis for top right point: ");
    int r1_tr_x = sc.nextInt();
    System.out.print("Enter y-axis for top right point: ");
    int r1_tr_y = sc.nextInt();

    System.out.print("\n*********************************\n\n");

    System.out.println("Enter Details for Rectangle 2.");
    System.out.print("Enter x-axis for bottom left point: ");
    int r2_bl_x = sc.nextInt();
    System.out.print("Enter y-axis for bottom left point: ");
    int r2_bl_y = sc.nextInt();
    System.out.print("Enter x-axis for top right point: ");
    int r2_tr_x = sc.nextInt();
    System.out.print("Enter y-axis for top right point: ");
    int r2_tr_y = sc.nextInt();

    int width = distance(r1_bl_x, r2_bl_x, r1_tr_x, r2_tr_x); // x-axis gives us the width
    int height = distance(r1_bl_y, r2_bl_y, r1_tr_y, r2_tr_y); // y-axis gives us the height

    if(isOverLapping(width, height)){
      System.out.print("The area of overlapping portion is: " + (width * height));
    }else{
      System.out.print("The rectangles are not overlapping so area is: 0");
    }

  }
  public static boolean isOverLapping(int width, int height){
    boolean isOverLapping = true;
    if(width <= 0) isOverLapping = false;
    if(height <= 0) isOverLapping = false;
    return isOverLapping;
  }
  public static int distance(int point_1_left_bottom, int point_2_left_bottom, int point_1_right_top, int point_2_right_top){
    return (min(point_1_right_top, point_2_right_top) - max(point_1_left_bottom, point_2_left_bottom));
  }
  public static int max(int x, int y){
    return (x > y) ? x : y;
  }
  public static int min(int x, int y){
    return (x < y) ? x : y;
  }
}
