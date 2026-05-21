   class Parent
   {
    public void p1(){
System.out.println("Preent method");
	}
   }
public class Class extends Prent {
  public void c1() {
System.out.println("Child method");
  }
  public static void main(String[] args) {
Child cobj = new Child();
cobj.c1();
cobj.p1();
  }
}