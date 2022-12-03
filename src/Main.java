public class Main {
    public static void main(String[] args){

    int balance = 200;
    int plus = 1150;
    int bonus;
        if (plus > 1000) {
        bonus = plus / 100;
    } else {
         bonus = 0;
    }

    int newBonus = balance + plus + bonus;
         System.out.println(newBonus);
}
}