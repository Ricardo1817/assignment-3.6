import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter weight in pounds: ");

        Double pounds = input.nextDouble();

        System.out.println("Enter feet: ");

        Double feet = input.nextDouble();

        System.out.println("Enter Inches: ");

        Double inches = input.nextDouble();

        Double height = feet*12 + inches; 

        Double BMI = (pounds/ (height*height))*703;

        System.out.println("BMI is " + BMI);

        if(BMI < 18.5 ){
            System.out.println("Underweight");
        }
        else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("Normal");
        }
        else if(BMI > 25 && BMI < 29.9 ){
            System.out.println("Overweight");
        }
        else if(BMI > 30){
            System.out.println("Obese");
        }

    }
}
