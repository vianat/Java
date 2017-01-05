package src.main.ru.nikiforov;

    /**
     * Класс сравнения
     */
public class Max {
    public int first = 10;
    public int second = 20;
    public int third = 30;

    //метод сравнения 2x чисел
    public int max(int first, int second) {

        return first>second ? first : second;
    }


    //метод сравнения 3x чисел
    public int max(int first, int second, int third) {

        return (first>second & first>third) ? first : 
             ((second>first & second>third) ? second : third);
    }
}