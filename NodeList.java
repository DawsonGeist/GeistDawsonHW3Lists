package hw3;

public class NodeList 
{
	private int size = 0;
	private Node root = null;

	public void add(Node node) 
	{
		if (node == null)
			return;
		if (root == null)
		{
			Node newNode = new Node(0, node.getName());
			root = newNode;
		} 
		else 
		{
			Node currentNode = root;
			while (currentNode.getNext() != null)
			{
				currentNode = currentNode.getNext();
			}
			int id = currentNode.getId();
			id++;
			Node newNode = new Node(id, node.getName());
			currentNode.setNext(newNode);
		}
		size++;
	}
	
/*
 * since we are looking for a string instead of a node i have 
 * adapted the findNode method from lab 6 and used to to comb
 * through nodes to see if any nodes held a string that matched
 * the one that was entered.
 * if the node is found  true is the output; else it is false
 
 */
	public boolean findNode(String search) 
	{
		Node currentNode = root;
		while (currentNode.getName() != search) 
		{
			currentNode = currentNode.getNext();
			if (currentNode == null)
				return false;
		}
		return true;
	}
	
	public void ascendList()
	{
		Node temp = root.getNext();
		for(int i=0;i<size;i++)
		{
			if(root==null)
				break;
			else
			{
				temp.toString();
				temp=temp.getNext();
			}
		}
	}
	
	public void descendList()
	{
		
	}

}
