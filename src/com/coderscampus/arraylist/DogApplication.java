package com.coderscampus.arraylist;

public class DogApplication {

	public static void main(String[] args) {
		CustomArrayList <String> dog = new CustomArrayList <>();
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
		
		for (int i=0; i<13; i++) {
		    System.out.println(dog.get(i));
		}

	}


}