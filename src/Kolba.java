import java.util.Scanner;

public class Kolba {

    public boolean deviceWorks (){
        int Temperature1;
        int Temperature2;

        Scanner scanner=new Scanner(System.in);
        Temperature1= scanner.nextInt();
        Temperature2= scanner.nextInt();

        if (Temperature1 > 100 && Temperature2 < 100){
            return true;
        }else {
            return false;
        }
    }
}
