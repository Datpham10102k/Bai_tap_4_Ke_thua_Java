import java.util.Scanner;

//[**Bài tập] Thiết kế và triển khai lớp Triangle
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài 3 cạnh
        System.out.print("Nhập cạnh 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Nhập cạnh 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Nhập cạnh 3: ");
        double side3 = scanner.nextDouble();

        scanner.nextLine(); // bỏ dòng trống
        System.out.print("Nhập màu sắc của tam giác: ");
        String color = scanner.nextLine();

        System.out.print("Tam giác có được tô màu không? (true/false): ");
        boolean filled = scanner.nextBoolean();

        // Tạo đối tượng tam giác
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Xuất thông tin
        System.out.println("\n--- Thông tin Tam Giác ---");
        System.out.println("Màu sắc: " + triangle.getColor());
        System.out.println("Chu vi: " + triangle.getPerimeter());
        System.out.println("Diện tích: " + triangle.getArea());
        System.out.println("Có tô màu? " + triangle.isFilled());
    }
}