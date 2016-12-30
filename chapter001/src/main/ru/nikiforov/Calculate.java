package src.main.ru.nikiforov;

/**
* @author nikiforov
* @since 21.12.2016
* @version 1.0
*/

public class Calculate{

	/**
	* Класс калькулятор
	*/
	double result = 10.0;
	double first = 10.0;
	double second = 10.0;

	/**
	* вычесляем сумму
	* @param - first первый параметр 
	* @param - first второй параметр 
	*/
	public void summ(double first, double second) {

		this.result = first + second;
	}
	/**
	* вычесляем разность
	* @param - first первый параметр 
	* @param - first второй параметр 
	*/
	public void razn(double first, double second) {

		this.result = first - second;
	}
	/**
	* вычесляем произведени
	* @param - first первый параметр 
	* @param - first второй параметр 
	*/
	public void multi(double first, double second) {

		this.result = first * second;
	}
	/**
	* вычесляем деление
	* @param - first первый параметр 
	* @param - first второй параметр 
	*/
	public void delenie(double first, double second) {

		this.result = first / second;
	}

	/**
	* возвращаем результат
	*/
	public double getResult(){
		return this.result;
	}
}