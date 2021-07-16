import java.lang.Comparable;
import java.util.Iterator;
import java.util.ArrayList;

class BinarySearchTree < T extends Comparable<T> >
{
	Node<T> root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void insert (T value )
	{
		Node<T> n = new Node<T>(value);

		if (root == null)
		{
			root = n;
			return;
		}

		Node<T> p = root;
		for (;;)
		{
			if (n.value.compareTo(p.value) == 0)
				return;
			if (n.value.compareTo(p.value) > 0)
			{
				if (p.right == null)
				{
					p.right = n;
					return;
				}
				p = p.right;
			}
			else // p.value < n.value
			{
				if (p.left == null)
				{
					p.left = n;
					return;
				}
				p = p.left;
			}
		}
	}

	public boolean find (T value)
	{
		if (root == null)
			return false;

		Node<T> p = root;
		while (p != null)
		{
			if (p.value.compareTo(value) == 0)
				return true;
			if (value.compareTo(p.value) < 0 )
				p = p.left;
			else
				p = p.right;
		}
		return false;
	}

	public int height ()
	{
		return doHeight(root);
	}

	public Iterator<T> inorderIterator()
	{
		return null;
	}

	private class BSTInorderIterator<T extends Comparable<T> > implements Iterator<T>
	{

		public BSTInorderIterator(Node<T> root)
		{
		}
		private void buildList (Node<T> n)
		{
		}
		public boolean hasNext()
		{
			return false;
		}
		public T next()
		{
			return null;
		}
		public void remove (T v)
		{
			// not implemented
		}
	}

	private int doHeight(Node n)
	{
		if (n == null)
			return 0;
		else
		{
			int left = doHeight(n.left);
			int right = doHeight(n.right);

			if (left > right)
				return 1 + left;
			else
				return 1 + right;
		}
	}
	public static void main(String[] args{
		BinarySearchTree bin = new BinarySearchTree();
	}
}