
public class LIFO extends Pila {

	public void Push ( String input ) {

		Stack.add(input);

	}

	public String Pop_ () {

		String tmp;

		tmp = Stack.get(Stack.Size()-1);

		Stack.remove(Stack.Size()-1);

		return tmp;

	}

}
