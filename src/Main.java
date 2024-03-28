import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Завдання1:
        System.out.println((int)(Math.random()*41)-20);
        
        //Завдання2:
        double katet1=3;
        double katet2=4;
        double gipoten=Math.sqrt(Math.pow(katet1,2)+Math.pow(katet2,2));
        double per=katet1+katet2+gipoten;
        double pl=0.5*katet1*katet2;
        System.out.println("Периметр "+per);
        System.out.println("Площа "+pl);
        
        //Завдання3:
        int num=(int)(Math.random()*101);
        int len=String.valueOf(num).length();
        System.out.println(num);
        System.out.println("К-сть цифр "+len);
        
        //Завдання4:
        int number[]=new int[3];
        for (int i = 0; i <3; i++) {
            number[i]=(int)((Math.random()*3)+1);
            System.out.print(number[i]+" ");
        }
        System.out.println("Програма загадала число");
        int attempts=2;;
        while(attempts>0) {
            System.out.println("Введіть число: ");
            Scanner scanner = new Scanner(System.in);
            String input= scanner.nextLine();
            String [] user=input.split(" ");
            if(user.length==3) {
                int[] userNum = new int[3];
                for (int i = 0; i < 3; i++) {
                    userNum[i] = Integer.parseInt(user[i]);
                }
                if (userNum[0] == number[0] && userNum[1] == number[1] && userNum[2] == number[2]) {
                    System.out.println("Ви вгадали!");
                    break;
                } else {
                    attempts--;
                    System.out.println("Неправильна послідовність. Залишилось спроб: " + attempts);
                }
            }
            else{
                System.out.println("Введіть 3 числа!");
            }
        }
        if(attempts==0){
            System.out.println("Гру завершено.Правильна послідовність була: "+number[0]+" "+number[1]+" "+number[2]);
        }


    }
}
