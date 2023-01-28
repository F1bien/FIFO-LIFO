
public class LIFO extends Pila {

	public void Push ( String input ) {

		Stack.add(input);

	}

	public String Pop_ () {

		String tmp;

		tmp = Stack.get(0);

		Stack.remove(0);

		return tmp;

	}

}
