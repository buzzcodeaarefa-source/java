import java.util.*;

class input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello User please Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your lucky number");
        int lucky = sc.nextInt();

        if (lucky % 2 == 0) {

            System.out.println(
                    "Hello " + name + ", Your lucky number " + lucky + " shows you are creative and bright!");

        } 
        else {

            System.out.println(
                    "Hello " + name + ", Your lucky number " + lucky + " shows you are hardworking!");

        }
    }
}