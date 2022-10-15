import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isWeekend;
        boolean isRain;
        boolean canWalk;

        Scanner scanner = new Scanner(System.in);
        isWeekend = scanner.nextBoolean();
        isRain = scanner.nextBoolean();

        if (isWeekend && !isRain){
            canWalk = true;
            System.out.println("Lets go for a walk ! ");
        } else {
            canWalk = false;
            System.out.println("Lets stay on the couch ");
        }
        Kolba kolba = new Kolba();
        System.out.println("Устройство работает fa" + kolba.deviceWorks());

    }
}


