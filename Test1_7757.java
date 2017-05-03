import java.util.Scanner; //นายอนุศิษฐ์ สิงห์นิกร 571107757
public class Test1_7757 {
    public static void main(String[] args) {
       int num1,num2;
        Scanner in=new Scanner(System.in);
        System.out.print("num1 :");
        num1=in.nextInt();
        System.out.print("num2 :");
        num2=in.nextInt();
        
        if(num1<num2)
            System.out.print("ค่าแรกน้อยกว่าค่าหลัง");
        else if(num2<num1)
            System.out.print("ค่าหลังน้อยกว่าค่าแรก");
        else
            System.out.println("ค่าทั้งสองเท่ากัน");
    }
    
}
