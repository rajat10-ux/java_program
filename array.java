// // public class array {
// //   public static void main(String[] args) {
// //         int arr[]=new int[5];
// //         arr[0]=1;
// //         arr[1]=2;
// //         arr[2]=6;
// //         arr[3]=8;
// //         arr[4]=9;
// //         System.out.println(arr[0]);
// //         System.out.println(arr[1]);
// //         System.out.println(arr[2]);
// //         int sum=0;
// //         for (int i = 0; i < arr.length; i++) {
// //                 sum+=arr[i];
// //         }
// //         System.out.println(sum);
// //         int nums[][]=new int [3][4];
// //         for (int i = 0; i < 3; i++) {
// //                 for (int j = 0; j < 4; j++) {
// //                         nums[i][j]=(int)(Math.random()*10);
// //                         System.out.println(nums[i][j]);
// //                 }
// //         }
// //    }       
// // }

// class student{
//         int rollno;
//         String name;
//         int marks;
// };
// public class array {
//  public static void main(String[] args) {
//          student s1=new student();
//          s1.marks=95;
//          s1.name="rajat";
//          s1.rollno=50;
//          student s2=new student();
//          s2.marks=55;
//          s2.name="raj";
//          s2.rollno=40;
//          student s3=new student();
//          s3.marks=95;
//          s3.name="rita";
//          s3.rollno=10;
//          student students[]=new student[3];
//          students[0]=s1;
//          students[1]=s2;
//          students[2]=s3;
//         //  for (int i = 0; i < students.length; i++) {
//         //         System.out.println(students[i].name+" "+students[i].marks+" "+students[i].rollno);
//         for(student stud:students){
//                 System.out.println(stud.name+":"+stud.marks+":"+stud.rollno);
//         }
// }
// }
class mobile{
        String brand;
        int cost;
      static String name;
      public mobile()
      {
         brand="";
         cost=200;
         System.out.println("in constructor");
      }
      static
      {
        name="phone";
        System.out.println("in statice blocek");
      }
        public void show(){
                System.out.println(brand+" "+cost+" "+name);
        }
        public static void show1(mobile obj){
          System.out.println(obj.brand+" "+obj.cost+" "+name);
        }
}
public class array {

public static void main(String[] args) {
 // Class.forName(className:"mobile");
// Class.forName("mobile");
//         String name="rajat";
//         System.out.println(name);
//         String newname=new String("nav");
//       // haschcode is address
//         System.out.println(newname.hashCode());
//         System.out.println("hello"+newname);
//         System.out.println(name.charAt(2));
// //         System.out.println(name.concat("kumar"));
// StringBuffer sb=new StringBuffer("hello");
// System.out.println(sb.length());
// System.out.println(sb);
// sb.deleteCharAt(2);l
// System.out.println(sb);
// sb.setLength(30);
// System.out.println(sb);
mobile m1=new mobile();
m1.brand="apple";
m1.cost=185000;
mobile.name="iphone 15";
//mobile obj2=new mobile();
m1.show();
mobile.show1(m1);
}
}