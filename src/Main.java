import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println(goToWalk(19, 15));
        System.out.println(goToWalk(25,16));
        System.out.println(goToWalk(5, 0));
        System.out.println(goToWalk(65, 29));
        System.out.println(goToWalk(30, 32));
//        generateRandomAge(1,100);
        System.out.println("Можно ли идти гулять?");
        System.out.println(goToWalk(generateRandomAge(1,100), 10));
    }
    public static String goToWalk (int age, double temperature ){
        String walk= "можно идти гулять";
        if((age > 20 && age < 45) && (temperature >= -20 && temperature <=30  )) {

            return walk;
        }
          else if(age < 20  && (temperature >=0 && temperature <= 28  )) {

              return walk;
          }
        else if(age > 45  && (temperature >= -10 && temperature <= 25  )) {

            return walk;
        }
        else{
            return " Оставайтесь домa";
        }

    }

    public static int generateRandomAge(int min, int max){
        Random r = new Random();

        int result = r.nextInt(max-min) + min;

        return result;

    }



}
