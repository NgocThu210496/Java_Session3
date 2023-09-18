public class Shows_Types {
    public static void main(String[] args) {
        System.out.println("In hình chữ nhật");
        //int size=6; //số hàng hoặc số cột

        for (int i = 0; i < 3; i++) {   //rows
            for (int j = 0; j < 6; j++) { //colum
                System.out.print(" * ");

            }
            System.out.println();
        }
        System.out.println("Hình tam giác");
        for (int i = 4; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
