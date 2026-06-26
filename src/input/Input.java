package input;
import java.util.Scanner;
public class Input{
     public static Scanner sc = new Scanner(System.in);
     public int enterInt(String msg){
          System.out.println(msg);
          int i = sc.nextInt();
          return i;
     }

     public String enterString(String msg){
          System.out.println(msg);
          String i = sc.nextLine();
          return i;
     }

     public float enterFloat(String msg){
          System.out.println(msg);
          float i = sc.nextFloat();
          return i;
     }

     public byte enterByte(String msg){
          System.out.println(msg);
          byte i = sc.nextByte();
          return i;
     }

     public long enterLong(String msg){
          System.out.println(msg);
          long i = sc.nextLong();
          return i;
     }

     public char enterChar(String msg){
          System.out.println(msg);
          String enter = sc.nextLine();
          char i = enter.charAt(0);
          return i;
     }
	 
	 public double enterDouble(String msg){
		System.out.println(msg);
		double i = sc.nextDouble();
		return i;
	 }
      public boolean enterBoolean(String msg){
          System.out.println(msg);
          boolean i = sc.nextBoolean();
          return i;
      }
}
