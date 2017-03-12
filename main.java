package hw3;

public class main 
{
	public static void main(String[] args)
	{
		//this will be the class used to test methods found in the list class and the nodes 
		//that will will exist within the list
		String temp = "";
		//NodeList
		NodeList greekAlphabet = new NodeList();
		//this'll create and add my nodes
		Node greek0 = new Node(0,"Alpha");
		greekAlphabet.add(greek0);
		Node greek1 = new Node(1,"Beta");
		greekAlphabet.add(greek1);
		Node greek2 = new Node(2,"Gamma");
		greekAlphabet.add(greek2);
		Node greek3 = new Node(3,"Delta");
		greekAlphabet.add(greek3);
		Node greek4 = new Node(4,"Epsilon");
		greekAlphabet.add(greek4);
		Node greek5 = new Node(5,"Zeta");
		greekAlphabet.add(greek5);
		
		//This will test ascend and descend methods:
		System.out.println("Ascend:");
		greekAlphabet.ascendList();
		System.out.println("Descend:");
		greekAlphabet.descendList();
		
		//Find a node
		System.out.println("\nDoes Gamma exist in this list?");
		if(greekAlphabet.searchNodeString("Gamma"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		System.out.println("Does Psi exist in this list?");
		if(greekAlphabet.searchNodeString("Psi"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
