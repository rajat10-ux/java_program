class human{
private int age;
 private String name;
 public human(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("i am arrived here be ready");
 }
public int getAge() {
        return age;
}
public void setAge(int age) {
       this.age = age;
}
public String getName() {
        return name;
}
public void setName(String name) {
        this.name = name;
}
};
public class encap {
         public static void main(String[] args) {
                human obj=new human(12,"raja");
                human obj1=new human(21,"rajat");
                // obj.setName("rajat bhaiya");
                // obj.setAge(15);
                System.out.println(obj.getAge()+" "+obj.getName());
                System.out.println(obj1.getAge()+" "+obj1.getName());
        }
}
