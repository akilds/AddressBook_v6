import java.util.stream.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import com.google.gson.*;
import java.io.Writer;
import java.io.FileWriter;

//USE CASE 1 - Creation of Contacts
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
     public String AddressBookName;
     public ContactPerson(String firstname, String lastname, String phoneNo,String address, String city, String state, String zip, String email, String AddressBookName)
     {
         this.firstname = firstname;
         this.lastname = lastname;
         this.phoneNo = phoneNo;
         this.address = address;
         this.city = city;
         this.state = state;
         this.zip = zip;
         this.email = email;
         this.AddressBookName = AddressBookName;
      }
     void changefname(String fname)
     {
      this.firstname = fname;
     }
     void changelname(String lname)
     {
      this.lastname = lname;
     }
     void changephoneno(String phoneno)
     {
      this.phoneNo = phoneno;
     }
     void changeaddress(String addrs)
     {
      this.address = addrs;
     }
     void changecity(String citty)
     {
      this.city = citty;
     }
     void changestate(String statee)
     {
      this.state = statee;
     }
     void changezip(String zipp)
     {
      this.zip = zipp;
     }
     void changemail(String mail)
     {
      this.email = mail;
     }
     public void show()
     {
	       System.out.println("Contact Details of Address Book : " + this.AddressBookName);
	       System.out.println(this.firstname);
	       System.out.println(this.lastname);
	       System.out.println(this.phoneNo);
	       System.out.println(this.address);
	       System.out.println(this.city);
	       System.out.println(this.state);
	       System.out.println(this.zip);
	       System.out.println(this.email);
     }
     public void show1(String firstname)
     {
          System.out.println("Contact Details of Address Book : " + this.AddressBookName);
          System.out.println(this.firstname);
          System.out.println(this.lastname);
          System.out.println(this.phoneNo);
          System.out.println(this.address);
          System.out.println(this.city);
          System.out.println(this.state);
          System.out.println(this.zip);
          System.out.println(this.email);
     }

     public void show2(String city)
     {
          System.out.println("Contact Details of Address Book : " + this.AddressBookName);
          System.out.println(this.firstname);
          System.out.println(this.lastname);
          System.out.println(this.phoneNo);
          System.out.println(this.address);
          System.out.println(this.city);
          System.out.println(this.state);
          System.out.println(this.zip);
          System.out.println(this.email);
     }

     public String getfname()
     {
       return this.firstname;
     }
     public String getlname()
     {
       return this.lastname;
     }
     public String getphoneNo()
     {
       return this.phoneNo;
     }
     public String getaddress()
     {
       return this.address;
     }
     public String getCity()
     {
       return this.city;
     }
     public String getzip()
     {
       return this.zip;
     }
     public String getmail()
     {
       return this.email;
     }
}

public class AddressBookMain
{
   //Use CASE 2, 3, 4 - Adding, Editing and Deleting a Contact
   //USE CASE 5 - Adding Multiple Contacts
   static String fname;
   static String lname;
   static String phoneno;
   static String addrs;
   static String cityy;
   static String statee;
   static String zipp;
   static String mail;
   static int count =0;
   static Map<String, ArrayList<ContactPerson>> contact1 = new HashMap<String, ArrayList<ContactPerson>>();
	public static void addressBook(String AddressBookname)
   {
      String addressBookname = AddressBookname;
      ArrayList<ContactPerson> contact = new ArrayList<ContactPerson>();
      char c = 'Y';
      int i=0;
	   Scanner sc = new Scanner(System.in);
      do
      {
       System.out.println("1. ADD");
       System.out.println("2. EDIT");
       System.out.println("3. DELETE");
       System.out.println("Enter choice : ");
       int choice = sc.nextInt();
       if(choice==1)
       {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter firstname : ");
         fname = scan.nextLine();
        //USE CASE 7 - Duplicate Check
        if(contact.stream().anyMatch(contactElement -> contactElement.firstname.equals(fname))==false)
        {
         System.out.println("Enter lastname : ");
         lname = scan.nextLine();
         System.out.println("Enter phoneNo : ");
         phoneno = scan.nextLine();
         System.out.println("Enter address : ");
         addrs = scan.nextLine();
         System.out.println("Enter city : ");
         cityy = scan.nextLine();
         System.out.println("Enter state : ");
         statee = scan.nextLine();
         System.out.println("Enter zip : ");
         zipp = scan.nextLine();
         System.out.println("Enter email : ");
         mail = scan.nextLine();
         contact.add(new ContactPerson(fname,lname,phoneno,addrs,cityy,statee,zipp,mail,addressBookname));
         contact.get(i).show();
         i++;
         count++;
         contact1.put(addressBookname,contact);
        }
        else
        {
          System.out.println("Contact already Exist");
        }
       }
       else if(choice==2)
       {
        System.out.println("Enter a name to be edited : ");
	     sc.nextLine();
        String name = sc.nextLine();
        for(i=0;i<=count+1;i++)
        {
		     if(contact.get(i).firstname.equals(name))
		     {
	   	     System.out.println("What do you want to change : ");
              System.out.println("1. Firstname");
              System.out.println("2. Lastname");
              System.out.println("3. PhoneNo");
              System.out.println("4. Address");
              System.out.println("5. City");
              System.out.println("6. State");
              System.out.println("7. Zip");
              System.out.println("8. Email");
              System.out.println("Enter your choice : ");
		   	  int option = sc.nextInt();
              sc.nextLine();
			     switch(option)
			     {
			       case 1 : System.out.println("Enter new firstname : ");
                         fname = sc.nextLine();
                         contact.get(i).changefname(fname);
			                break;
		     	    case 2 : System.out.println("Enter new lastname : ");
                         lname = sc.nextLine();
                         contact.get(i).changelname(lname);
			                break;
			       case 3 : System.out.println("Enter new phonoNo : ");
                         phoneno = sc.nextLine();
                         contact.get(i).changephoneno(phoneno);
                         break;
				    case 4 : System.out.println("Enter new address : ");
                         addrs = sc.nextLine();
                         contact.get(i).changeaddress(addrs);
                         break;
			       case 5 : System.out.println("Enter new city : ");
                         cityy = sc.nextLine();
                         contact.get(i).changecity(cityy);
			                break;
			       case 6 : System.out.println("Enter new state : ");
                         statee = sc.nextLine();
                         contact.get(i).changestate(statee);
                         break;
		     	    case 7 : System.out.println("Enter new zip : ");
                         zipp = sc.nextLine();
                         contact.get(i).changezip(zipp);
			                break;
			       case 8 : System.out.println("Enter new email : ");
                         mail = sc.nextLine();
                         contact.get(i).changemail(mail);
                         break;
			       default: System.out.println("Invalid");
			     }
              contact.get(i).show();
              contact1.replace(addressBookname,contact);
              break;
		     }
          }
        }
        else
        {
          System.out.println("Enter the name to be deleted : ");
          sc.nextLine();
          String del_name = sc.nextLine();
          for(i=0;i<=count;i++)
          {
            if(contact.get(i).firstname.equals(del_name))
            {
              contact.remove(i);
              count--;
              contact1.remove(addressBookname);
            }
           contact.get(0).show();
          }
         }
         System.out.println("Do you want to continue (Y/N) : ");
         c = sc.next().charAt(0);
     }while(c=='Y'||c=='y');
  }

   //USE CASE 13 - Writing to a file and Reading from a file
   public static void writeData()
	{
		StringBuffer empBuffer = new StringBuffer();
		for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
	     {
			String addressBookName = entry.getKey();
	        ArrayList<ContactPerson> person = entry.getValue();
	    	  person.forEach(contact -> {
	  			String contactDetails = addressBookName.concat(" -> " + contact.getfname() + " " +  contact.getlname()
	  			                        + " " + contact.getphoneNo() + " " + contact.getaddress() + " "
	  			                        + contact.getCity() + " " + contact.getzip() + " " + contact.getmail() + "\n");
	  			empBuffer.append(contactDetails);
	    	  });
	     }

		try
		{
			Files.write(Paths.get("Address-Book.txt"), empBuffer.toString().getBytes());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void printData()
	{
		try
		{
			Files.lines(new File("Address-Book.txt").toPath()).forEach(System.out::println);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public List<ContactPerson> readData()
	{
		List<ContactPerson> contactPerson = new ArrayList<>();
		try
		{
			Files.lines(new File("Address-Book.txt").toPath())
			     .map(line -> line.trim())
			     .forEach(line -> System.out.println(line));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return contactPerson;
	}

	//USE CASE 14 -Reading And Writing to a CSV File
   public static void csvWrite()
	{
		try
		{
			File csvFile = new File("AddressBook.csv");
			PrintWriter print = new PrintWriter(csvFile);
			for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
		     {
				String addressBookName = entry.getKey();
		        ArrayList<ContactPerson> person = entry.getValue();
		    	  person.forEach(contact -> {
		  			String contactDetails = addressBookName.concat(" -> " + contact.getfname() + " " +  contact.getlname()
		  			                        + " " + contact.getphoneNo() + " " + contact.getaddress() + " "
		  			                        + contact.getCity() + " " + contact.getzip() + " " + contact.getmail() + "\n");
		  			print.println(contactDetails);
		    	  });
		     }
			print.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static final String delimiter = ",";
	public static void csvRead() {
	      try {
	    	  String csvFile = "AddressBook.csv";
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         String line = "";
	         String[] tempArr;
	         while((line = br.readLine()) != null) {
	            tempArr = line.split(delimiter);
	            for(String tempStr : tempArr) {
	               System.out.print(tempStr + " ");
	            }
	            System.out.println();
	         }
	         br.close();
	         } catch(IOException ioe) {
	            ioe.printStackTrace();
	         }
	   }


	//USE CASE 15 - JASON Write
   public static void jsonWrite()
	{
		try {
			Writer writer = new FileWriter("AddressBook.json");
			new Gson().toJson(contact1, writer);
	        writer.close();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	}

  public static String sity;
  public static ArrayList<String> list = new ArrayList<String>();
  public static ArrayList<String> list1 = new ArrayList<String>();
  public static ArrayList<String> list2 = new ArrayList<String>();
  public static ArrayList<ContactPerson> person1 = new ArrayList<>();
  public static int count2;
  public static int in=0;
  public static int in1=0;
  public static Map<String, ArrayList<String>> dict = new HashMap<String, ArrayList<String>>();
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    char c = 'y';
    count2=0;
    do
    {
     sc.nextLine();
     System.out.println("Enter Address Book Name : ");
     String name = sc.nextLine();
     addressBook(name);
     System.out.println("Do you want a new Address Book (Y/N): ");
     c = sc.next().charAt(0);
    }while(c=='y'||c=='Y');

    //USE CASE 8 - Search Person based on City
    System.out.println("Enter city : ");
    sc.nextLine();
    sity = sc.nextLine();

    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
     ArrayList<ContactPerson> person = entry.getValue();
     for(ContactPerson per : person){
      if(per.city.equals(sity)){
           list.add(per.firstname);
          }
     }
    }
    System.out.println(list);

    //USE CASE 9 - View person in a city

    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
      person1 = entry.getValue();

      for(ContactPerson p : person1){
            if(!dict.containsKey(p.getCity())){
                dict.put(p.getCity(), new ArrayList<>());
            }
            dict.get(p.getCity()).add(p.firstname);
      }
    }
    System.out.println(dict);

    //USE CASE 10 - Find the count
    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
     ArrayList<ContactPerson> person = entry.getValue();
     for(ContactPerson per : person){
      if(per.city.equals(sity)){
           count2++;
          }
     }
    }
    System.out.println(count2);

   //USE CASE 11 - Sort by person

    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
     ArrayList<ContactPerson> person = entry.getValue();
     for(ContactPerson per : person){
      list1.add(per.firstname);
     }
    }

   System.out.println(list1);
   Collections.sort(list1);
   System.out.println(list1);
   int sizee = list1.size();
   System.out.println(sizee);

   while(in<sizee){
    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
     ArrayList<ContactPerson> person = entry.getValue();
     for(ContactPerson per : person){
      if(list1.get(in).equals(per.firstname)){
        per.show1(per.firstname);
        in++;
      }
      if(in==sizee){ break; }
     }
      if(in==sizee){ break; }
    }
   }

    //USE CASE 12 - Sort by city
    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
     ArrayList<ContactPerson> person = entry.getValue();
     for(ContactPerson per : person){
      list2.add(per.city);
     }
    }

   System.out.println(list2);
   Collections.sort(list2);
   System.out.println(list2);
   int sizee1 = list1.size();
   System.out.println(sizee1);
   while(in1<sizee1){
    for(Map.Entry<String, ArrayList<ContactPerson>> entry : contact1.entrySet())
    {
     ArrayList<ContactPerson> person = entry.getValue();
     for(ContactPerson per : person){
      if(list2.get(in1).equals(per.city)){
        per.show2(per.city);
        in1++;
      }
      if(in1==sizee1){ break; }
     }
      if(in1==sizee1){ break; }
    }
   }

   //File Handling
   writeData();
   printData();

	//CSV File
	csvWrite();
	csvRead();

	//JASON Write
	jasonWrite();
 }
}

