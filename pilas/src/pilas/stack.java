package pilas;
 
public interface stack<T> {
		public void push(T element) throws FullStackException;
		public T pop() throws EmptyStackException;
		public T top() throws EmptyStackException;
		public boolean isEmpty();
		public int size();
		
}


