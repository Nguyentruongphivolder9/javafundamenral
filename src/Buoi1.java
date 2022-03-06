import java.util.Scanner;

public class Buoi1 {

    public static void main(String[] args) {

        // 1 : kiểu dữ liệu
        // Nhóm 1 : kiểu dữ liệu nguyên thủy
        // String (chuỗi)
        // int, long ( kiểu số nguyên )
        // float, double ( kiểu số thực hay gọi là số có thập phân )
        // boolean ( kiểu dữ liệu chỉ 2 miền giá trị đúng or sai )
//  Kiểu null kh dành cho kiểu nguyên thủy


        // Nhóm 2 : kiểu dữ liệu đối tượng ( object type )
        // 2 : khai báo biến
//        String name = "Nguyễn Trường Phi";
//        int phone = 999999;
//        String address = "Thiên Đàng";
//        int age = 19;

        // Phương thức
//        System.out.println("Họ và tên : " + name);
//        System.out.println("Số điện thoại : " + phone);
//        System.out.println("Địa chỉ : " + address);
//        System.out.println("Tuổi : " + age);

        // 3 : toán tử
//        int a = 5;
//        int b = 10;
//
//        int ketQua = a++ - b-- - --b + a-- + ++a;
//        System.out.println("giá trị a = " + a);
//        System.out.println("giá trị b = " + b);
//        System.out.println("kết quả = " + ketQua);

        // 4 : câu điều kiện
//        int a = 100;
//        int b = 777;
//        if (a > b){
//            System.out.println("A lớn hơn B");
//        }else if (a < b){
//            System.out.println("A bé hơn B");
//        }else{
//            System.out.println("A bằng B");
//        }
//        System.out.print("Nhập chiều cao của bạn : ");
//        Scanner scanner = new Scanner(System.in);
//        double height = scanner.nextDouble();
//
//        System.out.print("Cân nặng của bạn : ");
//        double weight = scanner.nextDouble();
//
//        double bmi = weight / (height * height);
//
//        System.out.println(" bmi : " + bmi);
//
//        if (bmi < 18.5){
//            System.out.println(" Cân nặng thấp gầy ");
//        }else if (bmi <= 24.9){
//            System.out.println(" Bình thường ");
//        }else if (bmi == 25){
//            System.out.println(" Thừa cân ");
//        }else if (bmi <= 29.9){
//            System.out.println(" Tiền béo phì ");
//        }else if (bmi <= 34.9){
//            System.out.println(" Béo phì độ I ");
//        }else if (bmi < 39.9){
//            System.out.println(" Béo phì II ");
//        }else if (bmi >= 40){
//            System.out.println(" Béo phì III ");
//        }

//        System.out.print("Nhập chiều cao của bạn : ");
//        Scanner scanner = new Scanner(System.in);
//        double height = scanner.nextDouble();
//
//        System.out.print("Nhập cân nặng của bạn : ");
//        double weight = scanner.nextDouble();
//
//        double bmi = weight / (height * height);
//
//        System.out.println(" bmi : " + bmi);
//
//        if (bmi < 16){
//            System.out.println("Gầy độ III");
//        }else if (bmi <= 16.9){
//            System.out.println("Gầy độ II");
//        }else if (bmi <= 18.4){
//            System.out.println("Gầy độ I");
//        }else if (bmi <= 24.9){
//            System.out.println("Bình thường");
//        }else if (bmi <= 29.9){
//            System.out.println("Thừa cân");
//        }else if (bmi <= 34.9){
//            System.out.println("Béo phì độ I");
//        } else if (bmi <= 39.9) {
//            System.out.println("Béo phì độ II");
//        }else if (bmi >= 40){
//            System.out.println("Béo phì độ III");
//        }


        // 5 : Câu điều kiện swtich case

//        System.out.print("Nhập tháng");
//        Scanner scanner = new Scanner(System.in);
//        int month = scanner.nextInt();
//
//        switch (month){
//            case 1 :
//            case 2 :
//            case 3 :
//                System.out.println("Là quý 1");
//                break;
//            case 4 :
//            case 5 :
//            case 6 :
//                System.out.println("Là quý 2");
//                break;
//            case 7 :
//            case 8 :
//            case 9 :
//                System.out.println("Là quý 3");
//                break;
//            case 10 :
//            case 11 :
//            case 12 :
//                System.out.println("Là quý 4");
//                break;
//            default:
//                System.out.println("Không thuộc quý nào");
//                break;
//        }
//        System.out.println("tiếp tục");

        // 6 : Mảng array

        // Khai báo mảng khi biết kích thước
//        String[] arrNames = new String[10];

        //Khai báo mảng và định nghĩa các phần tử
//        int[] arrNumbers = {10,20,30,40,50,60};

        // Lấy kích thước mảng
        // arrNumbers.length

        // Lấy giá trị phần tử trong
//        System.out.println(arrNumbers[arrNumbers.length - 1]);

        // cập nhật giá trị cho phần tử
//        arrNames[0] = "C";
//        arrNames[1] = "h";
//        arrNames[2] = "â";
//        arrNames[3] = "u";

        // 6 : vòng lặp for

//        for(int i = 0 ; i < 10 ; i++){
//            // int i = 0 : khởi tạo cho vị trí bắt đầu
//            // i < 10 : kiểm tra điều kiện
//            // i++, i+=2 : bước nhảy
//            System.out.println("Value : " + i);
//    }
//        String[] arrNames = {"C","h","â","u"};
//        for (int i = 0 ; i < arrNames.length ; i++ ){
//            System.out.println("Name : " + arrNames[i] );
//    }
//        int[] arrNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        for (int i = 0 ; i < arrNumbers.length ; i++){
//            if (arrNumbers[i] % 2 == 0){
//                System.out.println("valuen: " + arrNumbers[i]);
//            }
//        }


















        // Tạo ra object
//        Animal meo = new Animal("3" , "0.5");
//
//        meo.showInfo();
        // 1 : Tính đóng gói
//        public, private, default, protected
        // 2 : Tính kế thừa (Dùng cho việc nâng cấp)


    }
}
