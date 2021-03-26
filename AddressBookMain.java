import java.util.*;

class ContactPerson
{
     public String firstname;
     public String lastname;
     public String phoneNo;
     public String address;
     public String city;
     public String state;
     public String zip;
     public String email;
     public ContactPerson()
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
	      System.out.println("Contact Details");
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



public class AddressBookMain
{
	public static void main(String[] args)
   {
	   ContactPerson[] contact = new ContactPerson[10];
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter number of contacts : ");
	   int n = sc.nextInt();
	   for(int i=0;i<n;i++)
	   {
		   contact[i] = new ContactPerson();
	   }
	   for(int i=0;i<n;i++)
	   {
		   contact[i].show();
      }
      System.out.println("Enter a name : ");
	   sc.nextLine();
      String name = sc.nextLine();
	   for(int i=0;i<n;i++)
	   {
		   if(contact[i].firstname.equals(name))
		   {
	   		System.out.println("What do you want to change : ");
            System.out.println("1. Firstname");
            System.out.println("2. Lastname");
            System.out.println("3. Address");
            System.out.println("4. City");
            System.out.println("5. State");
            System.out.println("6. Zip");
            System.out.println("7. PhoneNo");
            System.out.println("8. Email");
            System.out.println("Enter your choice : ");
		   	int option = sc.nextInt();
            sc.nextLine();
			   switch(option)
			   {
			     case 1 : System.out.println("Enter new firstname : ");
                       contact[i].firstname = sc.nextLine();
			              break;
		     	  case 2 : System.out.println("Enter new lastname : ");
                       contact[i].lastname = sc.nextLine();
			              break;
			     case 3 : System.out.println("Enter new address : ");
                       contact[i].phoneNo = sc.nextLine();
                       break;
				  case 4 : System.out.println("Enter new city : ");
                       contact[i].address = sc.nextLine();
                       break;
			     case 5 : System.out.println("Enter new state : ");
                       contact[i].city = sc.nextLine();
			              break;
			     case 6 : System.out.println("Enter new zip : ");
                       contact[i].state = sc.nextLine();
                       break;
		     	  case 7 : System.out.println("Enter new phoneno : ");
                       contact[i].zip = sc.nextLine();
			              break;
			     case 8 : System.out.println("Enter new email : ");
                       contact[i].email = sc.nextLine();
                       break;
			     default: System.out.println("Invalid");
			   }
			   contact[i].show();
		   }
	   }
   }
}
