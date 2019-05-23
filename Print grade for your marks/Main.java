import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc=new Scanner(System.in);
    	int c=sc.nextInt();
      if(c>=85){System.out.println("A");}
      else if(c>=75 && c<85){System.out.println("B");}
      else if(c>=65 && c<75){System.out.println("C");}
      else if(c>=55 && c<65){System.out.println("D");}
      else if(c>=45 && c<55){System.out.println("E");}
      else if(c<45){System.out.println("Fail");}
     
    }
}