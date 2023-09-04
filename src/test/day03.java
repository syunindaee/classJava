import java.util.Scanner;

class Phone {

    public String phoneName;
    public int phoneNumber;

    public Phone(String phoneName, int phoneNumber) {
        this.phoneName = phoneName;
        this.phoneNumber = phoneNumber;
    }

    public String showClassPhone() {
        return phoneName + "의 번호는 " + phoneNumber + "입니다.";
    }
}

class IPhone extends Phone {

    public IPhone(String phoneName, int phoneNumber) {
        super(phoneName, phoneNumber);
    }

    public String applePay() {
        return phoneName + "의 결제시스템은 애플페이입니다.";
    }
}

class Galaxy extends Phone {

    public Galaxy(String phoneName, int phoneNumber) {
        super(phoneName, phoneNumber);
    }

    public String samsungPay() {
        return phoneName + "의 결제시스템은 삼성페이입니다.";
    }
}

public class Day01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("휴대폰 이름: ");
        String phoneName = scanner.next();

        System.out.print("전화번호: ");
        int phoneNumber = scanner.nextInt();

        Phone phone;

        if (phoneName.equalsIgnoreCase("iPhone")) {
            phone = new IPhone(phoneName, phoneNumber);
            System.out.println(phone.showClassPhone());
            System.out.println(((IPhone) phone).applePay());
        } else if (phoneName.equalsIgnoreCase("Galaxy")) {
            phone = new Galaxy(phoneName, phoneNumber);
            System.out.println(phone.showClassPhone());
            System.out.println(((Galaxy) phone).samsungPay());
        } else {
            System.out.println("지원되지 않는 휴대폰입니다.");
        }
    }
}
