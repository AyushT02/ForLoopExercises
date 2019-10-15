
/**
 * Write a description of class ForLoopExercises here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ForLoopExercises
{
   public static void LoopExercise1() {
     for(int i = 0; i<=20; i++) {
         System.out.print(i + " ");
        } 
     
    }
   public static void LoopExercise2() {
       for(int i = 0; i<=20; i = i + 2) {
         System.out.print(i + " ");  
        }
    }
   public static void LoopExercise3() {
       for(int i = 5; i<=200; i = i + 5) {
           System.out.print(i + " ");
           if (i % 50 != 0) {
               System.out.println();
            }
        }
    }
   public static void LoopExercise4() {
       System.out.println("Enter a number: ");
       Scanner in = new Scanner (System.in);
       String statement = in.nextLine();
       int integer = Integer.valueOf(statement);
       for(int i = integer; i<=200; i = i + 5) {
           System.out.println(i + " ");
           if(i % 10 != 0) {
             System.out.println(" ");  
            }
        }
    }
    public static void LoopExercise5() {
      long factorial = 1;
      for(int i = 1; i<=10; i++) {
          factorial *= i;
          System.out.print(factorial + " ");
    }
}
   public static void LoopExercise6() {
    System.out.println("Enter a number: ");
    Scanner in1 = new Scanner(System.in);
    String num1 = in1.nextLine();
    int integer1 = Integer.valueOf(num1);
    System.out.println("Enter a number: ");
    Scanner in2 = new Scanner(System.in);
    String num2 = in2.nextLine();
    int integer2 = Integer.valueOf(num2);
    int small = 0;
    int large = 0;
    if (integer1 <= integer2)
        {
            small = integer1;
            large = integer2;
        }
    else
        {    
            large = integer1;
            small = integer2;
        }
    for(int i = small; i<=large; i++) 
    {
        System.out.print("The number is: " + i);
    }
}
public static void LoopExercise7() {
    for(int i = 15; i<=30; i++) {
        double k = i * 1.852;
        double m = i * 1.151;
        System.out.print("The knots is: " + i + "The kmh is: " + k + "The mph is: " + m);
        
    }
    
}
public static void LoopExercise8() {
    int num = 1;
    for(int i = 1; i<=50; i++) {
        num = num + i;
        System.out.println(num + " ");
    }
    
}
public static void LoopExercise9() {
    String str = "loopExercise";
    
    for(String strLow = str.toLowerCase(); ; strLow.substring(0).toUpperCase()) {
        boolean strLowcase = strLow.equals(strLow.substring(0).toUpperCase());
        char char1 = strLow.charAt(0);
        String strUp = strLow.substring(0,1).toUpperCase() + strLow.substring(1);
        if(strLowcase = true) {
         System.out.println(strUp.trim());
         break;
        }
    }
}
public static void LoopExercise10() {
    for(int i = 3; i<= 50; i = i + 3) {
        System.out.println(i);
    }
}
public static void LoopExercise11() {
    for(int i = 1850; i<=2015; i = i + 4) {
        System.out.println(i);
    }
}
public static void LoopExercise12() {
    System.out.println("Enter a number: ");
    Scanner in = new Scanner(System.in);
    int input = in.nextInt();
    int intfrac = 1/1;
    for(int i =1; i<= input; i++) {
        intfrac += 1/i;
    }
     System.out.println("x = " + intfrac);
}
public static void LoopExercise13() {
  for(int s=0; s<= 8; s++) { 
    for(int i = 0; i<=8; i++) {
     System.out.print("*");
    }
    System.out.println();
}
}
public static void LoopExercise14() {
for(int s=0; s<= 8; s++) { 
    for(int i = 0; i<=8; i++) {
     System.out.print("*");
     if(s == i){
         System.out.print("/");
        }
    }
    System.out.println();
}
}
public static void LoopExercise15() {
    for(int s = 0; s<=8; s++) {
        for(int i = 0; i<=8; i++) {
            int size = i * s;
            System.out.print(" ");
            if(s==i) {
                System.out.print("/");
            }
            if(i == 8 && s == 0) {
                System.out.print("/");
            }
            if(i == 7 && s == 1) {
                System.out.print("/");
            }
            if(i == 6 && s == 2) {
                System.out.print("/");
            }
            if(i == 5 && s == 3) {
                System.out.print("/");   
            }
            if(i == 4 && s == 4) {
                System.out.print("/");
            }
            if(i == 3 && s == 5) {
                System.out.print("/");   
            }
            if(i == 2 && s == 6) {
                System.out.print("/");
            }
            if(i == 1 && s == 7) {
                System.out.print("/");
            }
            if(i == 0 && s == 8) {
                System.out.print("/");
            }  
        }
        System.out.println();
    }
}
public static void LoopExercise16() {
        for(int row = 0; row<=8; row++){
        if(row == 1) {
         System.out.print("*");
         System.out.println();
        }
        if(row == 2) {
         System.out.print("**");
         System.out.println();
        }
        if(row == 3) {
         System.out.print("***");
         System.out.println();
        }
        if(row == 4) {
         System.out.print("****");
         System.out.println();
        }
        if(row == 5) {
         System.out.print("*****");
         System.out.println();
        }
        if(row == 6) {
         System.out.print("******");
         System.out.println();
        }
        if(row == 7) {
         System.out.print("*******");
         System.out.println();
        }
        if(row == 8) {
         System.out.print("********");
         System.out.println();
        }
    }

}
public static void LoopExercise17() {
    for(int row = 0; row<=8; row++){
        if(row == 1) {
         System.out.print("********");
         System.out.println();
        }
        if(row == 2) {
         System.out.print("*******");
         System.out.println();
        }
        if(row == 3) {
         System.out.print("******");
         System.out.println();
        }
        if(row == 4) {
         System.out.print("*****");
         System.out.println();
        }
        if(row == 5) {
         System.out.print("****");
         System.out.println();
        }
        if(row == 6) {
         System.out.print("***");
         System.out.println();
        }
        if(row == 7) {
         System.out.print("**");
         System.out.println();
        }
        if(row == 8) {
         System.out.print("*");
         System.out.println();
        }
    }
}
public static void LoopExercise18() {
    for(int row = 0; row<=16; row++){
        if(row == 1) {
         System.out.print("*");
         System.out.println();
        }
        if(row == 2) {
         System.out.print("**");
         System.out.println();
        }
        if(row == 3) {
         System.out.print("***");
         System.out.println();
        }
        if(row == 4) {
         System.out.print("****");
         System.out.println();
        }
        if(row == 5) {
         System.out.print("*****");
         System.out.println();
        }
        if(row == 6) {
         System.out.print("******");
         System.out.println();
        }
        if(row == 7) {
         System.out.print("*******");
         System.out.println();
        }
        if(row == 8) {
         System.out.print("********");
         System.out.println();
        }
        if(row == 9) {
         System.out.print("********");
         System.out.println();
        }
        if(row == 10) {
         System.out.print("*******");
         System.out.println();
        }
        if(row == 11) {
         System.out.print("******");
         System.out.println();
        }
        if(row == 12) {
         System.out.print("*****");
         System.out.println();
        }
        if(row == 13) {
         System.out.print("****");
         System.out.println();
        }
        if(row == 14) {
         System.out.print("***");
         System.out.println();
        }
        if(row == 15) {
         System.out.print("**");
         System.out.println();
        }
        if(row == 16) {
         System.out.print("*");
         System.out.println();
        }
    }
}
public static void LoopExercise19() {
    for(int row = 1; row<=9; row++) {
     System.out.print(row + " ");
     for(int col = 2; col<=9; col++) {
         System.out.print(row*col + " ");
          if(row*col < 10) {
         System.out.print(" ");
        }
        }
     System.out.println();
    }
}
   public static void main() {
       LoopExercise1();
       LoopExercise2();
       LoopExercise3();
       LoopExercise4();
       LoopExercise5();
       LoopExercise6();
       LoopExercise7();
       LoopExercise8();
       LoopExercise9();
       LoopExercise10();
       LoopExercise11();
       LoopExercise12();
       LoopExercise13();
       LoopExercise14();
       LoopExercise15();
       LoopExercise16();
       LoopExercise17();
       LoopExercise18();
       LoopExercise19();
    }
}
