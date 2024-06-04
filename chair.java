import java.util.Scanner;
public class chair{

    void chair1(){

        System.out.print("Enter Your Name : ");
        Scanner new1 = new Scanner(System.in);

        System.out.println(new1.nextLine());
    }

    public static void main(String[] args){

        chair c1 = new chair();

        c1.chair1();

    }
}