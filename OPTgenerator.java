import java.util.Random;

public class OPTgenerator {

    public static int random(){
        return (int) (Math.random()*900000) + 100000;
    }
    public static void main(String[] args) {
//        Random rand = new Random();
//        int otp = 100000 + rand.nextInt(999999);
//        System.out.println(otp);
        System.out.println(random());
    }
}
