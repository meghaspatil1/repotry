 /*public class firstcode
{
	public static void main(String args[])
	{
		
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}*/


/*public class firstcode
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{
			int ch=65;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(ch -1 + j)+ " ");
			}
		System.out.println();
		}
	}
}*/


/*public class firstcode
{
	public static void main(String args[])
	{   int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
					System.out.print("$ ");
				else
					System.out.print("  ");
			}
		System.out.println();
		}
	}
}*/


/*/main class
public class firstcode
{
	public static void main(String args[])
	{
		int i,j;
		int n=5;
		for (i=1;i<=n;i++)
		{
			for (j=1;j<=i;j++)
			//for (j=1;j<=n;j++)
			{
				//if ((i<j) || (i==j))
					System.out.print(".");}
			System.out.println();
		  }
		System.out.print(" ");		
	}
}*/

/*public class firstcode{
	public static void main(String args[]) {      //  *
		int i,j;								 //  * *
		int n=5;								 // * * *
		for (i=0;i<n;i++){						// * * * *
			for(j=n-i;j>1;j--){
				System.out.print(" ");
			}
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/

/*class firstcode {
private int length, breadth;
firstcode(int length,int breadth){
this.length=length;
this.breadth=breadth;
}
public int getLength(){
return length;
}
public int getBreadth(){
return breadth;
}
public static void main(String[] args){
firstcode rectangle=new firstcode(5,8);
System.out.println("Length: "+rectangle.getLength());
System.out.println("Breadth: "+rectangle.getBreadth());
}
}*/

/*class firstcode {
  int i = 34;   // instance variable
  static int z; // class variable
  static {
    z = 10;
    System.out.println("inside static block: " + z);
  }
  void test() {
    int k = 200;  // local variable
    System.out.println("local variable: " + (k + i));
  }
  public static void main(String[] args) {
   firstcode obj = new firstcode();
    obj.test();
    System.out.println(obj.i);
  }
}*/
/*class firstcode{
	public static void main (String[] args) {
	    int res = 1 + 2; // result is now 3
	    System.out.println (res);
	    res -= 1; // result is now 2
	    System.out.println (res);
	    res *= 2; // result is now 4
	    System.out.println(res);
	    res /= 2; // result is now 2
	    System.out.println(res);
	    res += 8; // result is now 10
	    System.out.println(res);
	    res %= 7; // result is now 3
	    System.out.println(res);
	  }
	}*/

/*class firstcode{
	public static void main(String[] args) {
		int i,j;
		int n=4;
		for (i=1;i<n;i++){
			for (j=1;j<i;j++){
				System.out.println("*");}
			System.out.println(" ");}
		System.out.println();
	}
}*/

/*import java.util.*;
class firstcode{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int button =sc.nextInt();
		int num;
		switch(button) {
		case 1: System.out.println("add");
				num= a+b;
				System.out.println(num);
				break; 
		case 2: System.out.println("sub");
				num =a-b;
				System.out.println(num);
				break; 
		case 3:System.out.println("mul");
				num=a*b;
				System.out.println(num);
				break; 
		default:System.out.println("invalid");
		}
		
	}
}*/

/*import java.util.*;
class firstcode{
	public static void main(String[] args) {
		//Scanner sc= new Scanner(System.in);
		//int n=sc.nextInt();
		int n=5;
		int m=4;
		for(int i=1;i<=m;i++) 
		{
			for(int j=1;j<=n;j++) 
			{
				if(i==1 ||i==m||j==1||j==n )
					{System.out.print("* ");}
					else
						{System.out.print("  ");}
			}
			System.out.println();
		}
	}
}*/

/*class firstcode{
	public static void main(String[] args) {
		int n=4;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
}*/
/*import java.util.*;
class firstcode{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}*/

/*//floyd triangle
class firstcode{
	public static void main(String[] args) {
		int n=5;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}*/

/*class firstcode{
	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				int sum=(i+j);
				if(sum%2==0) {
					System.out.print("1 ");}
					else {
						System.out.print("0 ");}
				}
			System.out.println();
			}
	}
}*/

/*//solid rombus
class firstcode{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/
/*//hollow rhombus
class firstcode{
	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=n;j++) {
				if((i==1)||(i==n)||(j==1)||(j==n))
				{System.out.print("* ");}
				else 
				{System.out.print("  ");}
			}
			System.out.println();
		}
	}
}*/

/*//butterfly pattern
class firstcode{
	public static void main(String[] args) {
		int n=4;
		//upper half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spc=2*(n-i);
			for(int j=1;j<=spc;j++) {
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			//lower half
			for(int k=n;k>=1;k--) {
				for(int l=1;l<=k;l++) {
					System.out.print("*");
				}
				int spca=2*(n-k);
				for(int l=1;l<=spca;l++) {
					System.out.print(" ");
				}
				for(int l=1;l<=k;l++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}*/

/*class firstcode{
	public static void main(String[] args) {
		int n=4;
		//upper half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			int spc=2*(n-i);
			for(int j=1;j<=spc;j++) {
				System.out.print(".");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			//lower half
			for(int k=n;k>=1;k--) {
				for(int l=1;l<=k;l++) {
					System.out.print("*");
				}
				int spca=2*(n-k);
				for(int l=1;l<=spca;l++) {
					System.out.print(".");
				}
				for(int l=1;l<=k;l++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
}*/
/* hollow butterfly
class firstcode{
	public static void main(String[] args) {
		int n=4;
		//upper half
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((j==1)||(i==j)) 
				{System.out.print("*");}
				else {System.out.print(" ");}
			}
			int spc=2*(n-i);
			for(int j=1;j<=spc;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				if((j==1)||(i==j))
				{System.out.print("*");}
				else {System.out.print(" ");}
			}
			System.out.println();
		}
		//lower half
		for(int k=n;k>=1;k--) {
			for(int l=1;l<=k;l++) {
				if((l==k)||(l==1))
				{System.out.print("*");}
				else
				{System.out.print(" ");}
			}
			int spca=2*(n-k);
			for(int l=1;l<=spca;l++) {
				System.out.print(" ");
			}
			for(int l=1;l<=k;l++) {
				if((l==1)||(l==k))
				{System.out.print("*");}
				else
				{System.out.print(" ");}
			}
			System.out.println();
		}
		
	}
}*/
/*number pyramid
class firstcode{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/
/* plandrome pyramid
class firstcode{
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i ;j>=1;j--) {
				System.out.print(j);
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}*/
/* diamond
class firstcode{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

