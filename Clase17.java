import java.util.Scanner;

public class Clase17 {
    private String lebel;
    private String grade;
    private String name;
    private int code;
    private String clas;

    static Scanner userinput = new Scanner(System.in);
     public static void main(String[]args){
         Scanner lebel = new Scanner(System.in);
         System.out.print("Ingresar el nombre de el nivel: ");
         int n = lebel.nextInt();
         lebel.close();

         Scanner grade = new Scanner(System.in);
         System.out.print("Ingresar el nombre de el nivel: ");
         int m = grade.nextInt();
         grade.close();

         Scanner name = new Scanner(System.in);
         System.out.print("Ingresar el nombre de el nivel: ");
         int o = name.nextInt();
         name.close();

         Scanner code = new Scanner(System.in);
         System.out.print("Ingresar el nombre de el nivel: ");
         int l = code.nextInt();
         code.close();

         Scanner clas = new Scanner(System.in);
         System.out.print("Ingresar el nombre de el nivel: ");
         int a = clas.nextInt();
         clas.close();

     }


}
