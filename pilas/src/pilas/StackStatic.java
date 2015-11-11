package pilas;

public class StackStatic<T> implements stack<T> {

	protected T [] Stack;
	protected int n; 
	protected int top=-1; // 
	
	public StackStatic (int n) {
		this.n=n;
		
		Stack=(T[]) new Object [n]; 
	}
public void push (T element) throws FullStackException{ 
	
	if (top== n-1)throw new FullStackException ("Stack Full"); //Array full 
	
	else 
		top++;
	Stack [top]=element;

}
public void pop (T element) throws EmptyStackException{
	if(isEmpty()==true) throw new EmptyStackException ("Stack no iniciada ") ;
	
	else 
		element=Stack [top];
	top--;
	
}



public T top() throws EmptyStackException{
	if (top==1) //array Empty
		throw new EmptyStackException ("Stack Empty");
	else
		
	return null;
	
}

public boolean isEmpty(){
	return top==-1;
	
}
public int size(){
	return top+1;
}
@Override
public T pop() throws EmptyStackException {
	// TODO Auto-generated method stub
	return null;
}

}
