public class Main {
    public static void main(String[] args) {

        System.out.println(goToWalk(19, 15));
        System.out.println(goToWalk(25,16));
        System.out.println(goToWalk(5, 0));
        System.out.println(goToWalk(65, 29));
        System.out.println(goToWalk(30, 32));
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

}
