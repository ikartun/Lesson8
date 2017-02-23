package by.epam.tr.lesson8;

import java.util.Arrays;

public class MySet<T> {
	private Object[] array;
	private int size;
	
	public MySet() {
		array = new Object[]{};
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean add(T element) {
		if (contains(element)) {
			return false;
		}		
		extend();
		array[size - 1] = element;
		
		return true;
	}
	
	public boolean remove(T element) {		
		if (element == null) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == null) {
					remove(i);
					return true;
				}
			}
		}
		else {		
			for (int i = 0; i < array.length; i++) {
				if (element.equals(array[i])) {
					remove(i);
					return true;
				}
			}
		}		
		return false;
	}
	
	private void remove(int index) {
		Object[] tempArray = array;
		
		System.arraycopy(tempArray, 0, array, 0, index);
		System.arraycopy(tempArray, index + 1, array, index, size - index - 1);			
		narrow();
	}
	
	public boolean contains(Object element) {
		if (element == null) {
			for (Object obj : array) {
				if (obj == null) {
					return true;
				}
			}
		}
		else {
			for (Object obj : array) {
				if (element.equals(obj)) {
					return true;
				}
			}
		}
		return false;
	}
	
	private void narrow() {
		array = Arrays.copyOf(array, --size);
	}
	
	private void extend() {
		array = Arrays.copyOf(array, ++size);
	}

	@Override
	public String toString() {
		return "MySet [array=" + Arrays.toString(array) + "]";
	}
}
