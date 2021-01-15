import java.util.Scanner;
public class QuickFindUF{
	private int id[];

	public QuickFindUF(int N){ // initializing id array with index value
		int id[]= new int[N];
		for(int i=0;i<N;i++) id[i]=i;
	} 

	public boolean connected (int p, int q){
		return id[p]==id[q]; //returning boolean value when id components are same
	}
	
	public void union(int p, int q){ //union method. making prior number id index components same
		// as later number id index components
		int pid = id[p];
		int qid = id[q];
		for(int i=0;i<id.length;i++){
			if(id[i]==pid) id[i]=qid;
		}
	}
	public int find(int i){ // find method--Interview Questions problem no 2
		int max=0;
		while(i!=id[i]){
			if(i>max) max=i;
			i=id[i];
		}
		return max;
	}
	public int successor(int x){ // successor method -- Interview Questions problem no 3
		id[x]=x;
		return find(x+1);
	}
		
}
