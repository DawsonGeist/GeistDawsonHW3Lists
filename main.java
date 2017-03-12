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
		System.out.println(greek0.toString());
	}
}
