//1)WAP to demonstrate (2.45pm to 3.30)
//a)class, object
//b)array of object
//c)different method
//d)constructor
//e)constructor /method overloading
//f)static variable, meclass


class Student{
	

   int rollno;
   String address;
   String name;


   public static void displayCenter()

   {
   	
       System.out.println("This are the Edac Students Information of CDAC MUMBAI: ");

   }



   Student(rollno , name , address)// parameterized constructor
   {

   this.rollno = rollno ;
   this.name = name ;
   this.address = address ;
   	

  }


  public void display(){
  	
    System.out.println( "Student RollNO = "+rollno  + "Student Name = " + name + "City = " +address  );
    
  }


  public void find(String name)
  {
  	
   for (int i = 0 ; i <= arr.lengh-1 ; i++){
   	 
   	 if(arr[i].name == name){

   	System.out.println( "Student City = " + address);
   }
    
   }
   
    
  }
  
  

}



public class MainClass{
	
    public static void main(String[] args){


      Student.displayCenter(); // ststic method 


      Student[] arr = new Student[5];
     
       arr[0] = new Student(11, "Mohnish" , "Mumbai");
       arr[1] = new Student(12, "Nihal" , "Nagpur");
       arr[2] = new Student(13, "Nilesh" , "Amravati");
       arr[3] = new Student(14, "Namdev" , "Nashik");
       arr[4] = new Student(15, "Nabil" , "Mumbai");

       System.out.println("Student 1 Information :");
       obj[0].display();

       System.out.println("Student 1 Information :");
       obj[1].display();

       System.out.println("Student 1 Information :");
       obj[2].display();

       System.out.println("Student 1 Information :");
       obj[3].display();

       System.out.println("Student 1 Information :");
       obj[4].display

       arr.find("Nihal");
      


    }



}


