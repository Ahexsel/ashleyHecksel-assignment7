package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	private int size = 0;
	

	@Override
	public boolean add(T item) {
		if (size == items.length) {
			Object[] newData = new Object[items.length *2];
										//used to double size of array 
			System.arraycopy(items, 0, newData, 0, items.length);
							//saved old array but adds any new elements 
			items = newData;		
		}
		
		items[size] = item;
		size++;
		return true;
	
	}

	@Override
	public int getSize() {
		return size; //returns the actual size of the list
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) items[index];
        }
}