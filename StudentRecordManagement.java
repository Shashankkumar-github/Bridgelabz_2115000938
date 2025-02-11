public class StudentNode{

	   StudentNode next;
	   int rollNumber;
	   String name;
	   int age;
	   char grade;
	   
	   public StudentNode(int rollNumber,int age,String name,char grade){
	   this.rollNumber= rollNumber;
	   this.next =null;
	   this.name =name;
	   this.age= age;
	   this.grade =grade;
	   }
}

class StudentManagement{
private StudentNode head;

public void addAtBegin(int rollNumber.int age,String name,char grade){
StudentNode studentObj = new StudentNode(rollNumber,age,name,grade);
studentObj.next = head;
head = studentObj;
}

public void addAtEnd(int rollNumber, int age,String name,char Grade){
 StudentNode studentObj = new StudentNode(rollNumber,age,name,grade);
 if(head==null){
 head = studentObj;
 return;
 }
 StudentNode temp = head;
 while(temp.next != null){
 temp =temp.next;
 }
 temp.next =studentObj;
 }
 
 public void addAtPosition(int rollNumber,int age,String name,char grade,int position){
 StudentNode studentObj = new StudentNode(rollNumber,age,name,grade);
 
 if(position == 1){
    studentObj.next = head;
	head =studentObj;
	return;
	}
	StudentNode temp =head;
	for(int i=0;i<position-1 && temp != null ;i++){
	temp =temp.next;
	}
	if(temp == null ){
	System.out.println("not correct position");
	return;
	}
	studentObj.next =temp.next;
	temp.next =studentObj;
	
	}
	
	public void deleteByRollNumber(int rollNumber){
	if(head ==null){
	System.out.println("Linked List is empty");
	return;
	}
	if(head.rollNumber == rollNumber){
	head =head.next;
	return;
	}
	StudentNode temp =head;
	while(temp.next != null && temp.next.rollNumber != rollNumber){
	temp =temp.next;
	}
	if(temp.next ==null){
	System.out.println("Student record is not entered");
	return;
	}
	temp.next =temp.next.next;
	}
	
	
	public StudentNode searchByRollNumber(int rollNumber){
	 StudentNode temp =head;
		while(temp !- null){
			if(temp.rollNumber ==rollNumber){
			return temp;
			}
			temp =temp.next;
		}
		return null;
	}
	
	public void UpdateGrade(int rollNumber,char updatedGrade){
		StudentNode studentObj =searchByRollNumber(rollNumber);
		if(studentObj != null){
		studentObj.grade = updatedGrade;
		}
		else {
		  System.out.println("Student record is not present");
		  
		  }
		}
	
	
	public void displayStudents(){
	StudentNode temp =head;
	while(temp != null){
		System.out.println("Roll no. :" + temp.rollNumber +", age :" + temp.age +",name :" + temp.name +",grade :" +temp.grade);
		temp =temp.next;
		}
	}
	
	public class StudentRecordManagement{
	public static void main(String[] args){
	StudentManagement list = new StudentManagement();
	    list.addAtEnd(101, "Raj Singh", 20, 'A');
        list.addAtEnd(102, "Shashank", 21, 'B');
        list.addAtBeginning(100, "Swati", 22, 'C');
        list.addAtPosition(103, "Himanshu", 23, 'A', 2);

        System.out.println("Student Records:");
        list.displayStudents();

        System.out.println("Updating grade of student 102 to A");
        list.updateGrade(102, 'A');

        System.out.println("After deletion of student 101:");
        list.deleteByRollNumber(101);
        list.displayStudents();
	}
	}
		 
		 

	
 
	   
	   
	   