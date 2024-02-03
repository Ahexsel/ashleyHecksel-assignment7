package com.coderscampus.arraylist;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CustomArrayListTest {

	@Test
	void should_add_one_item_to_list() {

		CustomArrayList<String> dog = new CustomArrayList<>();
		dog.add("Chihuahua");
		
		assertEquals(1, dog.getSize());
		assertEquals("Chihuahua", dog.get(0));
		
		}
	
	@Test 
	 public void should_test_add_and_get() {
        CustomArrayList<String> dog = new CustomArrayList<>();

        dog.add("Pug");
        dog.add("Bulldog");
        dog.add("Golden Retriever");
        dog.add("Husky");
        dog.add("Beagle");
        dog.add("Dachshund");
        dog.add("Border Collie");
        dog.add("Poodle");
        dog.add("Dobermann");
        dog.add("Bully");
        dog.add("Dalmatian");
        dog.add("Shiba Inu");
        dog.add("Chow");

        assertEquals(13, dog.getSize(), "Size should be 13");

        assertEquals("Pug", dog.get(0));
        assertEquals("Bulldog", dog.get(1));
        assertEquals("Golden Retriever", dog.get(2));
        assertEquals("Husky", dog.get(3));
        assertEquals("Beagle", dog.get(4));
        assertEquals("Dachshund", dog.get(5));
        assertEquals("Border Collie", dog.get(6));
        assertEquals("Poodle", dog.get(7));
        assertEquals("Dobermann", dog.get(8));
        assertEquals("Bully", dog.get(9));
        assertEquals("Dalmatian", dog.get(10));
        assertEquals("Shiba Inu", dog.get(11));
        assertEquals("Chow", dog.get(12));
    }
	
	@Test
	void should_test_add() {
		CustomArrayList<String> customArrayList = new CustomArrayList<>();

        assertTrue(customArrayList.add("Item1"));
        assertTrue(customArrayList.add("Item2"));

        assertEquals(2, customArrayList.getSize());
        assertEquals("Item1", customArrayList.get(0));
        assertEquals("Item2", customArrayList.get(1));
	}
	
	@Test
	void should_test_add_resize() {
		   CustomArrayList<String> customArrayList = new CustomArrayList<>();

	        for (int i = 0; i < 15; i++) {
	            customArrayList.add("Item" + i);
	        }

	        assertEquals(15, customArrayList.getSize());
	        assertEquals("Item14", customArrayList.get(14));
		
	}
	
	@Test
	void should_test_get_size(){
	     CustomArrayList<String> customArrayList = new CustomArrayList<>();

	        assertEquals(0, customArrayList.getSize());

	        customArrayList.add("Item1");
	        customArrayList.add("Item2");

	        assertEquals(2, customArrayList.getSize());
		}
	
	@Test
	void should_test_get() {
		CustomArrayList<String> customArrayList = new CustomArrayList<>();

        customArrayList.add("Item1");
        customArrayList.add("Item2");

        assertEquals("Item1", customArrayList.get(0));
        assertEquals("Item2", customArrayList.get(1));
	}
	
	
}
	


