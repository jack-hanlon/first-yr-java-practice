import java.util.Random;

import java.util.Iterator;

public class TreeTester
{
	public static void main (String[] args)
	{
			int treesize = 100;
			boolean doRandom = true;

			if (args.length > 0 )
				treesize = Integer.parseInt(args[0]);
			if (args.length == 2 && args[1].equals("linear"))
				doRandom = false;

			System.out.println("Creating tree of size: "+ treesize);
			System.out.println("Inserting " + (doRandom ? "random" : "increasing" ) + " values.");

			BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
			Random r = new Random();

			for (int i = 0; i < treesize; i++)
			{
					int value = r.nextInt(10000000);
					t.insert( doRandom ? value : i );
					if (i != 0 && i % (doRandom ? 10000000 : 100000) == 0)
						System.out.println("Completed: " + String.format("%,d",i));
			}
			System.out.println("Height is: " + t.height());
			
			Iterator<Integer> i = t.inorderIterator();
			while (i.hasNext())
			{
					System.out.println(i.next());
			}
	}
}