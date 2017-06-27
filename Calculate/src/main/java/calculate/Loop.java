package calculate;

import java.util.Scanner;
/**
 * Created by K_PC-S on 26.06.2017.
 */
public class Loop{
    String s; //Продолжить или выйти
    Scanner sc = new Scanner(System.in);
    int numberTask;

    /**
     * Цикл выполнения задач
     * Выход по клавише 'q' после соответствующего ввода
     */
    public Loop(){
        while(true){
            System.out.println("Введите номер задачи: 1/2(Калькулятор/Работа с массивом)");
            numberTask = sc.nextInt();

            System.out.println("Продолжить? 'q' - выход, 'остальные символы' - продолжить");
            s = sc.next();
            if("q".equals(s)) break;

            Input in = new Input(numberTask);
        }

        System.out.println("Выход");
    }

}
