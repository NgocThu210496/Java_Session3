public class SmallestMultiple {
    public static void main(String[] args) {
        int number=1;
        int a=5, b=7 ,c=11;
        while (true){
            if(number%a ==0 && number%b == 0 && number%c==0){
                System.out.println("Số nguyên dương nhỏ nhất chia hết cho a,b,c là: " + number);
                break;
            }else {
                number++;
            }
        }

    }
}
