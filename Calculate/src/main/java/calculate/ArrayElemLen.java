package calculate;

import java.util.Scanner;

/**
 * Created by K_PC-S on 26.06.2017.
 * Класс для работы с массивом
 */
public class ArrayElemLen {
    String[] inString;
    String outString = ""; // Скорее отладочная переменная
    String maxInArrayString = ""; //Самое длинное слово из массива
    int stringLen;

    Scanner sc = new Scanner(System.in);


    /**
     * Констуркор. Выполняет инициализацию массива и вызывает методы для вывода конечного результата
     */
    public ArrayElemLen(int stringLen){
        this.stringLen = stringLen;
        this.inString = new String[this.stringLen];
        InputStrings();
        System.out.printf("%s\n",OutputStrings(inString));
        System.out.println("Максимально длинное слово " + MaxInStringArray(inString));

    }

    /**
     * Заполнение массива с консоли
     */
    public void InputStrings(){
        System.out.println("Введите слова через Enter. Разрешенное кол-во слов " + stringLen);
        for (int i = 0, j = 1; i < inString.length; i++, j++) {
            System.out.print(j+" ");
            inString[i] = sc.next();
            }
        }

    /**
     * @param StringArr
     * @return заполненный массив в строку(скорее для отладки)
     */
    public String OutputStrings(String[] StringArr){
        System.out.println("Полученное предложение");
        for(int i = 0; i<StringArr.length; i++){
            outString+= StringArr[i] + " ";
        }
        return outString;
    }

    /**
     * @param StringArr
     * @return маскимально длинное слово в передаваемом массиве StringArr
     */
    public String MaxInStringArray(String[] StringArr){
        String first = StringArr[0];
        for (int i = 1; i < StringArr.length; i++){
            if(first.length()<StringArr[i].length()){
                first = StringArr[i];
            }
        }
        return first;
    }


}
