import java.util.ArrayList;
import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		
		TreeNode i =new TreeNode(5,null,null);
		TreeNode j =new TreeNode(3,null,null);
		TreeNode h =new TreeNode(4,null,null);
		TreeNode f =new TreeNode(7,null,null);
		TreeNode g =new TreeNode(2,i,j);
		
		TreeNode e =new TreeNode(1,h,null);
		TreeNode c =new TreeNode(8,f,g);
		TreeNode d= new TreeNode(6,null,null);
		TreeNode b= new TreeNode(2,d,e);
		TreeNode a= new TreeNode(3,b,c);
		
		findSum(a,5);

		
	}
	
	public static void findSum(TreeNode root, int value){
		int depth=depth(root);
		int[] path=new int[depth];
		findSum(root,value,path,0);
	}
	
	public static int depth(TreeNode t){
		if(t==null)return 0;
		return 1+Math.max(depth(t.left), depth(t.right));
	}
	
	public static void findSum(TreeNode t, int value, int[] path, int level){
		if(t==null)return;
		path[level]=t.data;
		int sum=0;
		for(int i=level;i>=0;i--){
			sum +=path[i];
			if(sum==value)print(path,i,level);
		}
		findSum(t.left,value,path,level+1);
		findSum(t.right,value,path,level+1);
		path[level]=Integer.MIN_VALUE;//remove current node from path, not strictly necessary
	}
	
	public static void print(int[] path, int start, int end){
		for(int i=start;i<=end;i++){
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}

}
