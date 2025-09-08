import java.util.*;
class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange (){
        this.width = 1;
        this.height = 1;
        this.color = "White";
    }
    public Rectange (double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth (){
        return width;
    }
    public void setWidth (double width){
        this.width = width;
    }
    public double getHeight (){
    
        return height;
        
    }
    public void setHeight (double height){
        this.height = height;
    }
    public String chuanhoa (String s){
        StringBuilder sb = new StringBuilder();
        sb.append (Character.toUpperCase (s.charAt(0))).append (s.substring(1).toLowerCase());
        return sb.toString();
    }
    public String getColor (){
        return chuanhoa (color);
    }
    public void setColor (String color){
        this.color = color;
    }
    public double findArea (){
        return width * height;
    }
    public double findPerimeter(){
        return (width + height) * 2;
    }
}
public class J04002 {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
    int width = sc.nextInt();
    int height = sc.nextInt();
    String color = sc.next();
    if (width <= 0 || height <= 0){
        System.out.print ("INVALID");
    } else {
        Rectange r = new Rectange(width , height , color);
        System.out.printf ("%.0f %.0f %s\n" , r.findPerimeter() , r.findArea() ,r.getColor()); 
    }
}
}