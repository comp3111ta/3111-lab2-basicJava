
import lab2.ex1.Book;
//Add the following in task 2.1
import lab2.ex2.*;
//end

public class Library {
	public static void main(String arg[]) {
		final String array[] = {"Basic Java", "Advance Java", "Forget about Java"};
		Book b = new Book(array);
		System.out.println("The title of Chapter 1 is " + b.getChapter(1));
		String anotherArray[] = b.getChapters();

		System.out.println("There are " + anotherArray.length + " chapters." );
		//Change the following line after Step 1.4
		System.out.println(anotherArray);
		//System.out.println(java.util.Arrays.toString(anotherArray));

		///Add the following in task 2.1
		//Computer a = new MobileComputer();
		//for (int i = 0; i < 10; i++)
		//	a.work();
		///end

		///Add the following in task 2.6 - keep the code in 2.1
		//Charger c = new Charger();
		//Phone p = new Phone();
		//MobileComputer m = new MobileComputer();

		//c.charge(p);
		//c.charge(m); //this does not work without fixing MobileComputer
		///end



	}
}
