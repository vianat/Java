

//клласс счетчик с 2мя параметрами
public class Counter {
    static int start  = 0;
    static int finish = 10;
    static int result = 0;

    // метод подсчета суммы чётных чисел
    public static int add(int start, int finish) {

        for(int index=start; index<finish; index++){
            if(index%2==0){
                result += index;
            }
        }
        System.out.println(result);
        return result;
    }
}