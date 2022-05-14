package Unit4Day13.Question1;


import java.util.*;
import java.util.function.Predicate;


public class randomNumber {
	public static void condition(List<Integer> list, Predicate<Integer> predicate){
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.print(n + " ");
			}
			
		}
		System.out.println("\n");
		
	}
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7,10,20,30,25);
		
		System.out.println("1. Print Only even Numbers");
		condition(list, (n)-> n%2 == 0 );
		

		System.out.println("2. Number greater than 9");
		condition(list, (n)-> n>9 );
		
		System.out.println("3. Print all numbers:");
		condition(list, (n)->true);

		 

}
}




// import java.util.*;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;

// public class randomNumber {

//     public static void printList(List<Integer> list, Predicate<Integer> predicate) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("1: Only Even Number"
//                 + "\n2: Number Greater Than 9"
//                 + "\n3: Print All Number");
//         int choice = sc.nextInt();

//         if (choice == 1) {
//             List<Integer> list1 = list.stream().filter(l -> l % 2 == 0).collect(Collectors.toList());

//             System.out.println("Even Numbers: " + list1);
//         } else if (choice == 2) {
//             List<Integer> list2 = list.stream().filter(l -> l > 9).collect(Collectors.toList());
//             System.out.println("Numbers Greater than 9: " + list2);
//         } else if (choice == 3) {
//             System.out.println("All Numbers: " + list);
//         } else {
//             System.out.println("Enter valid options");
//         }

//     }

//     public static void main(String[] args) {

//         List<Integer> list = new ArrayList<>();
//         list.add(34);
//         list.add(33);
//         list.add(11);
//         list.add(7);
//         list.add(9);
//         list.add(10);
//         list.add(22);

//         Number.printList(list, t -> t % 2 == 0);

//     }

// }







// Create a list of integer in a main class having random numbers
// You need to use given printList function mentioned below which print the List<integer>
// based on the implementation you will pass in argument using java 8 lambda expression
// public static void printList(List<Integer> list, Predicate<Integer> predicate)
// Inside this function use predicate.test(n) which takes the input and return a boolean
// To check which numbers qualify your condition to print
// You need to print
// 1. Only Even Number
// 2. Number greater than 9
// 3. Print all number