public class QuickUnionUf{
	private int[] id;

	public QuickUnionUF(int N){ //initializing array
		id = new int[N];
		for(int i=0;i<N;i++) id[i]=i;
	}

	private int root(int i){ // chase parent pointers until reach root
		while(i!=id[i]) i=id[i];
		return i;
	}

	public boolean connected(int p, int q){ // chekc if p&q have the same root
		return root(p)==root(q);
	}

	public void union(int p,int q){ // find the two roots and change the root of p to point the root of q
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}
}
