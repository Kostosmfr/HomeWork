package calculate;

/**
 * Created by K_PC-S on 26.06.2017.
 */
public class Operation {
    double a, b;
    char operation;
    double result = 0;

    /**
     *
     * @param a первое число
     * @param b второе число
     * @param operation математическая операция
     */
    public Operation(double a, double b, char operation){
        this.a = a;
        this.b = b;
        this.operation = operation;

    }

    //методы с маленькой буквы
    /**
     * Выполняет математическую операцию между двумя числами
     * @return результат операции +,-,* или /
     */
    public double Calculate(){

            switch (this.operation){
                case '+':result = a+b;
                    break;
                case '-':result = a-b;
                    break;
                case '*':result = a*b;
                    break;
                case '/':result = a/b; //а если b=0?
                    break;
            }
            return result;

    }


}
