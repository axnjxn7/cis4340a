public class R03_NUM04_J {
    public static void main(String[] args) {
        int dollar = 1.00;
        int dime = 0.10;
        int number = 7;
        System.out.println(
          "A dollar less " + number + " dimes is $0" + (dollar - number * dime) 
        );
    }
}
