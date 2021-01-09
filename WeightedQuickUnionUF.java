public class WeightedQuickUnionUF{
	// same as QUF, but maintan extra array sz[i] to count the number of objects in the tree
	// rooted at i.
	// when union method runs, trees only get merged to larger trees then itself.

	private int[] id;
	private int[] sz;

	public WQU(int N){
		id = new int[N];
		for(int i=0;i<N;i++){
			id[i]=i;
			sz[i]=count(i);
		}
	}
	private int count(int i){
		int count=0;
		while(i!=id[i]){
			i=id[i];
			count++;
		}
		return count;
	}
	private int root(int i){
			while(i!=id[i]) i=id[i];
			return i;
			}
	
	public boolean connected(int p, int q){
			return root(p)==root(q);
			}

	public void union(int p,int q){
		int i= root(p);
		int j= root(q);
		if(i==j) return;
		if(sz[i]<sz[j]) {id[i]=j;sz[j]+=sz[i];}
		else {id[j]=i;sz[i]+=sz[j];}
	}
}

