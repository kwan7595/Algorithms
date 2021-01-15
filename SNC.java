import java.util.Scanner;
import java.util.Random;
public class SNC{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Random rd = new Random();
		int n=s.nextInt();
		WeigthedUnionFindUF cn = new WeightedUnionFindUF();
		cn.WQU(n);
		int m=s.nextInt();
		int rs1=0,rs2=0;
		int value=0;
		for(int j=0;j<m;j++){
			rs1 = rd.nextInt(n);
			rs2=rd.nextInt(n);
			if(rs2=rs1) rs2=rd.nextInt(n);
			cn.union(rs1,rs2);
			if(cn.count(rs1)==n){
				value=j;
				break;
			}
		}
	}
}
		
		
