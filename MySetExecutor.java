package by.epam.tr.lesson8;

public class MySetExecutor {

	public static void main(String[] args) {
		MySet<String> mySet = new MySet<>();
		
		System.out.println("mySet is empty - " + mySet.isEmpty());
		
		mySet.add("1");
		mySet.add("2");
		mySet.add("3");
		mySet.add("4");
		mySet.add("4");
		mySet.add("5");
		mySet.add("5");
		mySet.add(null);
		
		System.out.println(mySet);
		
		mySet.remove("0");
		mySet.remove("2");
		mySet.remove("2");
		mySet.remove(null);
		
		System.out.println("mySet contains - 10 - " + mySet.contains("10"));
		System.out.println("mySet contains - 1 - " + mySet.contains("1"));
		System.out.println("mySet contains - null - " + mySet.contains(null));
		
		System.out.println("mySet is empty - " + mySet.isEmpty());
		
		System.out.println(mySet);
		
		
	}
}
