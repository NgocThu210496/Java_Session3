import java.util.Scanner;

public class Interest_Calulation_Aplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào số tiền vay");
        double soTienVay=scanner.nextDouble();
        System.out.println("Nhập vào lãi suất hàng tháng");
        double laiSuatHangThang=scanner.nextDouble();
        System.out.println("Nhập vào số tháng vay");
        double soThangVay=scanner.nextDouble();
        // tính tiền lãi
        double laiHangThang=soTienVay*(laiSuatHangThang/100);
        double sumTienTraHangThang=laiHangThang + soTienVay /soThangVay;
        double tongTraSauKetThucVay=sumTienTraHangThang * soThangVay;

        System.out.println("Tiền lãi hàng tháng : " + laiHangThang);
        System.out.println("Tổng tiền trả hàng tháng: " + sumTienTraHangThang);
        System.out.println("Tổng tiền trả sau khi kết thúc vay: " + tongTraSauKetThucVay );
    }
}
