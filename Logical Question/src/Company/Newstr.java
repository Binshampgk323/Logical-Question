package Company;
import java.util.*;
public class Newstr {
	  public static void main(String args[])
	  {
	    Customer cu=new  Customer();
	    Book b=new Book();
	    cu.dispaly();
	    b.view(cu.bname,cu.bno,cu.pname,cu.cno,cu.bprice);
	    
	  }
	}
	class Customer
	{
	  String bname;
	  int bno;
	  String pname;
	  int bprice;
	  int cno;
	  String cname;
	  char type;
	  public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public int getBno() {
		return bno;
	}


	public void setBno(int bno) {
		this.bno = bno;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getBprice() {
		return bprice;
	}


	public void setBprice(int bprice) {
		this.bprice = bprice;
	}


	public int getCno() {
		return cno;
	}


	public void setCno(int cno) {
		this.cno = cno;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public char getType() {
		return type;
	}


	public void setType(char type) {
		this.type = type;
	}


	public Scanner getS() {
		return s;
	}


	public void setS(Scanner s) {
		this.s = s;
	}


	Scanner s=new Scanner(System.in);
	  		
	
	 public void dispaly()
	  {
	    System.out.println("Name of the book");
	    setBname(s.next());
	    System.out.println("ISBN Number");
	    setBno(s.nextInt());
	    System.out.println("Publisher name");
	    setPname(s.next());
	    System.out.println("Price of a book :");
	    setBprice(s.nextInt());
	    System.out.println("Number of Customers");
	    setCno(s.nextInt());
	    for(int i=1;i<=cno;i++)
	    {
	      System.out.println("Details for Customer "+i);
	      System.out.println("Name");
	      setCname(s.next());
	      System.out.println("Type of Customer (S or I or F)");
	     setType(s.next().charAt(0)) ;
	    }
	  }

	}
	class Book
	{
	  void view(String bname, int bno, String pname, int cno, int bprice)
	  {
	    System.out.println("Book Details are");
	    System.out.println("Name of the book : "+bname);
	    System.out.println("ISBN Number of the book : "+bno);
	    System.out.println("Publisher name of the book : "+pname);
	    System.out.println("Number of Customers : "+cno);
	    System.out.println("Price of a book : "+bprice);
	    System.out.println("Total Amount Received : "+bprice);
	      
	  }
	}