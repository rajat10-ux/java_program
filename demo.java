// class Calculator{
//    public int add(int num1,int num2){
//         // System.out.println("in add");
//         int r=num1+num2;
//         return r;
//    }
// }
// class Computer{
        // public void playMusic()
//         {
//            System.out.println("play music");
//         }
//         public String getmepen(int cost)
//         {
//                 if(cost>=10){
//                 return "rajat";
//                 }
//                 else{
//                         return "nothing";
//                 }
//         }
// };
class Calculator{
        public int add(int a,int b){
                return a+b;
        }
        public int sub(int a,int b){
                return a-b;
        }
}
public class demo {
  public static void main(String arg[]){
        // int num1=4;
        // int num2=5;
        // // int result=num1+num2;
        // // System.out.println(result);
        // Calculator calc=new Calculator();
        // int result=calc.add(num1, num2);
        // System.out.println(result);
  // Computer c1=new Computer();
      Calculator c1=new Calculator();
    int ans1= c1.add(50,60);
      int ans2=c1.sub(50,60);
      System.err.println(ans1);
      System.out.println(ans2);
}       
}
