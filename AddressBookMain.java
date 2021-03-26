import java.util.*;

public class AddressBookMain
{
     public String firstname;
     public String lastname;
     public String phoneNo;
     public String address;
     public String city;
     public String state;
     public String zip;
     public String email;
     public AddressBookMain()
     {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter firstname : ");
         this.firstname = scan.nextLine();
         System.out.println("Enter lastname : ");
         this.lastname = scan.nextLine();
         System.out.println("Enter phoneNo : ");
         this.phoneNo = scan.nextLine();
         System.out.println("Enter address : ");
         this.address = scan.nextLine();
         System.out.println("Enter city : ");
         this.city = scan.nextLine();
         System.out.println("Enter state : ");
         this.state = scan.nextLine();
         System.out.println("Enter zip : ");
         this.zip = scan.nextLine();
         System.out.println("Enter email : ");
         this.email = scan.nextLine();
      }
     public void show()
     {
	      System.out.println("Contact Details : ");
	      System.out.println(this.firstname);
	      System.out.println(this.lastname);
	      System.out.println(this.phoneNo);
	      System.out.println(this.address);
	      System.out.println(this.city);
	      System.out.println(this.state);
	      System.out.println(this.zip);
	      System.out.println(this.email);
     }
}



