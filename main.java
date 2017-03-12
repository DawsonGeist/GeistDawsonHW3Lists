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
		for(int i=0;i<24;i++)
		{
			if(i==0)
			{
				temp = "Alpha";
				Node greek0 = new Node(i,temp);
				greekAlphabet.add(greek0);
			}
			if(i==1)
			{
				temp = "Beta";
				Node greek1 = new Node(i,temp);
				greekAlphabet.add(greek1);
			}
			if(i==2)
			{
				temp = "Gamma";
				Node greek2 = new Node(i,temp);
				greekAlphabet.add(greek2);
			}
			if(i==3)
			{
				temp = "Delta";
				Node greek3 = new Node(i,temp);
				greekAlphabet.add(greek3);
				
			}
			if(i==4)
			{
				temp = "Epsilon";
				Node greek4 = new Node(i,temp);
				greekAlphabet.add(greek4);
			}
			if(i==5)
			{
				temp = "Zeta";
				Node greek5 = new Node(i,temp);
				greekAlphabet.add(greek5);
			}
			if(i==6)
			{
				temp = "Eta";
				Node greek6 = new Node(i,temp);
				greekAlphabet.add(greek6);
			}
			if(i==7)
			{
				temp = "Theta";
				Node greek7 = new Node(i,temp);
				greekAlphabet.add(greek7);
			}
			if(i==8)
			{
				temp = "Iota";
				Node greek8 = new Node(i,temp);
				greekAlphabet.add(greek8);
			}
			if(i==9)
			{
				temp = "Kappa";
				Node greek9 = new Node(i,temp);
				greekAlphabet.add(greek9);
			}
			if(i==10)
			{
				temp = "Lambda";
				Node greek10 = new Node(i,temp);
				greekAlphabet.add(greek10);
			}
			if(i==11)
			{
				temp = "Mu";
				Node greek11 = new Node(i,temp);
				greekAlphabet.add(greek11);
			}
			if(i==12)
			{
				temp = "Nu";
				Node greek12 = new Node(i,temp);
				greekAlphabet.add(greek12);
			}
			if(i==13)
			{
				temp = "Xi";
				Node greek13 = new Node(i,temp);
				greekAlphabet.add(greek13);
			}
			if(i==14)
			{
				temp = "Omicron";
				Node greek14 = new Node(i,temp);
				greekAlphabet.add(greek14);
			}
			if(i==15)
			{
				temp = "Pi";
				Node greek15 = new Node(i,temp);
				greekAlphabet.add(greek15);
			}
			if(i==16)
			{
				temp = "Rho";
				Node greek16 = new Node(i,temp);
				greekAlphabet.add(greek16);
			}
			if(i==17)
			{
				temp = "Sigma";
				Node greek17 = new Node(i,temp);
				greekAlphabet.add(greek17);
			}
			if(i==18)
			{
				temp = "Tau";
				Node greek18 = new Node(i,temp);
				greekAlphabet.add(greek18);
			}
			if(i==19)
			{
				temp = "Upsilon";
				Node greek19 = new Node(i,temp);
				greekAlphabet.add(greek19);
			}
			if(i==20)
			{
				temp = "Phi";
				Node greek20 = new Node(i,temp);
				greekAlphabet.add(greek20);
			}
			if(i==21)
			{
				temp = "Chi";
				Node greek21 = new Node(i,temp);
				greekAlphabet.add(greek21);
			}
			if(i==22)
			{
				temp = "Psi";
				Node greek22 = new Node(i,temp);
				greekAlphabet.add(greek22);
			}
			if(i==23)
			{
				temp = "Omega";
				Node greek23 = new Node(i,temp);
				greekAlphabet.add(greek23);
			}
		}
	}
}
