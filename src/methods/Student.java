package methods;

public class Student extends College  {
	 private String name;
	 private String college;
	 public Student(String name, String college) {
	 super();
	 this.name = name;
	 this.college = college;
	 System.out.println(name+"   "+college);
	 //System.out.println(college);
	 }
	 public String getName() {
	 return name;
	 }
	 public void setName(String name) {
	 this.name = name;
	 }
	 public String getCollege() {
	 return college;
	 }
	 public void setCollege(String college) {
	 this.college = college;
	 }
	 public static void main(String[] args) {
	 Student student = new Student("Ramesh", "BVB");
	 Student student2 = new Student("Prakash", "GEC");
	 Student student3 = new Student("Pramod", "IIT");
	 }


}
