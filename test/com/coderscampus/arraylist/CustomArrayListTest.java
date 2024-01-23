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
 
	

}
