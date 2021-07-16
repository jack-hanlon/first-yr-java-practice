import java.lang.Comparable;

class Node <T extends Comparable<T> >
{
	Node<T>	left;
	Node<T>	right;
	T		value;

	public Node()
	{
		left = null;
		right = null;
		value = null;
	}

	public Node (T v)
	{
		left = null;
		right = null;
		value = v;
	}
}