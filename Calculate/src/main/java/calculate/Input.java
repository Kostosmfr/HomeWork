package calculate;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Created by K_PC-S on 26.06.2017.
 */


public class Input {
    //Поля для задания 1
    String operationString;
    char operation;
    double a,b;

    int numberTask; //Для определения задачи
    Scanner sc = new Scanner(System.in); //Для ввода с консоли

    //Поля для задания 2
    int stringLen; //Максимальное количество слов(для массива)
    /**
     * Конструктор вызывается в классе Loop для определения задачи
     */
    public Input(int numberTask){
        this.numberTask = numberTask;

        if (numberTask == 1){
            InputCalculate();
        } else if (numberTask == 2){
            InputArray();
        } else System.out.println("Данной задачи не существует");

    }

    /**
     * Ввод математической(+,-,* или /) операции с консоли
     */
    public void InputCalculate() {
        System.out.println("Введите операцию");

        operationString = sc.next();
        if (String.valueOf(this.operationString.charAt(0)).matches("[-,+,*,/]+")) {
        this.operation = operationString.charAt(0);

        InputNumber();

        Operation op = new Operation(this.a,this.b, this.operation);
        System.out.printf("Результат операции " + getOperation() + " равняется %.4f\n", op.Calculate());
        }
        //!Тут выскакивает окно с ошибкой! Но может не выскочить по верх IDE!
        else if(String.valueOf(this.operationString.charAt(0)).matches("[a-z,A-z,0-9,'@!#%$;№=_^]+")){
            JOptionPane.showMessageDialog(new JFrame(),
                    new NumberFormatException("\nДолжны быть операции +, -, * или /\n"+ "Дальнейшие расчеты не верны!"),
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Ввод пары чисел(целые или дробные через запятую) над которыми совершается математическая операция
     * Правильность ввода не осуществляется(появляется исключение - работа программы прекращается)
     */
    public void InputNumber(){
        System.out.println("Введите числа");
        System.out.print("Первое число ");
        this.a = sc.nextDouble();
        System.out.print("Второе число ");
        this.b = sc.nextDouble();
        System.out.println("");
    }

    /**
     * Ввод данных с консоли, а именно длина массива(кол-во слов) для дальнейшей работы
     * Проверка ввода не осуществляется т.к. все String
     */
    public void InputArray(){
        System.out.println("Введите кол-во слов");
        stringLen = sc.nextInt();

        ArrayElemLen ael = new ArrayElemLen(stringLen);
    }

    /**
     * @see #InputCalculate()
     * @return operation
     */
    public String getOperation(){
        return ""+ this.operation;
    }

}
