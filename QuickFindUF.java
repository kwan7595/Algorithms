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
}
