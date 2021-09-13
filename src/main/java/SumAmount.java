import java.util.ArrayList;
import java.util.Scanner;

public class SumAmount {
    public static void main(String[] args) {

        int numberOfShape;
        String typeOfShape;
        int costPerM2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of shape :");
        numberOfShape = sc.nextInt();
        System.out.println("Enter price per M2 (/m2): ");
        costPerM2 = sc.nextInt();
        int pricePerShape = 0;
        int sumAll = 0;

        ArrayList<Shape> listOfShape = new ArrayList<>();
        for (int i = 0; i < numberOfShape; i++) {
            sc = new Scanner(System.in);
            System.out.println("Shape (hcn, hv, ht, htg ) : ");
            typeOfShape = sc.nextLine();

            if (typeOfShape.equals("hcn")){
                Rectangle new_Rectangle = new Rectangle();
                new_Rectangle.inputRectangleInfo();
                listOfShape.add(new_Rectangle);
                pricePerShape = new_Rectangle.totalPrice(costPerM2);
                sumAll += pricePerShape;
            }else if(typeOfShape.equals("hv")){
                Square new_Square = new Square();
                new_Square.inputSquareInfo();
                listOfShape.add(new_Square);
                pricePerShape = new_Square.totalPrice(costPerM2);
                sumAll += pricePerShape;
            }else if(typeOfShape.equals("ht")){
                Circle new_Circle = new Circle();
                new_Circle.inputCirleInfo();
                listOfShape.add(new_Circle);
                pricePerShape = new_Circle.totalPrice(costPerM2);
                sumAll += pricePerShape;
            }else{
                Triangle new_Triangle = new Triangle();
                new_Triangle.inputTriangleInfo();
                listOfShape.add(new_Triangle);
                pricePerShape = new_Triangle.totalPrice(costPerM2);
                sumAll += pricePerShape;
            }
        }

        //Xuất thông tin mảnh đất
        for (int i = 0; i < listOfShape.size(); i++) {
            System.out.println("Shape " + (i + 1));
            System.out.println(listOfShape.get(i).toString());
        }
        // Tong tiền để mua tất cả các mảnh đất
        System.out.println(sumAll);
    }
}
