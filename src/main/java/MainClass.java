import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length;
        double width;
        double height;
        length = scan.nextDouble();
        width = scan.nextDouble();
        height = scan.nextDouble();
        ScaleCuboidBox myBox = new ScaleCuboidBox(length, width, height);
        int n;
        n = scan.nextInt();
        while (n > 0) {
            int op = scan.nextInt();
            double value;
            switch (op) {
                case 1: {
                    System.out.println(myBox.getLength());
                    break;
                }
                case 2: {
                    System.out.println(myBox.getWidth());
                    break;
                }
                case 3: {
                    System.out.println(myBox.getHeight());
                    break;
                }
                case 4: {
                    value = scan.nextDouble();
                    myBox.setLength(value);
                    break;
                }
                case 5: {
                    value = scan.nextDouble();
                    myBox.setWidth(value);
                    break;
                }
                case 6: {
                    value = scan.nextDouble();
                    myBox.setHeight(value);
                    break;
                }
                case 7: {
                    System.out.println(myBox.getVolume());
                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + op);
            }
            n--;
        }
    }
}
