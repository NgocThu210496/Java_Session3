import java.util.Scanner;

public class Side_OfThe_Trianglesn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("nhap canh a: ");
            double a=Double.parseDouble(scanner.nextLine());
            System.out.println("nhap canh b: ");
            double b=Double.parseDouble(scanner.nextLine());
            System.out.println("nhap canh c: ");
            double c=Double.parseDouble(scanner.nextLine());
            //1/2 chu vi
            double p = (a + b + c)/2;
            //dien tich
            double area= Math.sqrt(p*(p-a)*(p-b)*(p-c));

            if(a+b>c && a +c >b && b + c >a){
                System.out.println("Chu vi tam giac la: " + p*2);
                System.out.println("Dien tich giac  tam giac la: " + area);
                break;
            }else {
                System.out.println("Day khong phai la 3 canh cua tam giac");
            }
        }
        System.exit(0);

    }
}
