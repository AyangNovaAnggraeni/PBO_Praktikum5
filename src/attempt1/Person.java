
package attempt1;

import java.util.Scanner;


public class Person {
    double weight; 
    double height; 
   
    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Berat Badan Kurang";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Berat Badan Ideal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Berat Badan Lebih";
        } else if (bmi >= 30 && bmi <= 39.9) {
            return "Gemuk";
        } else {
            return "Sangat Gemuk";
        }
    }
    
    //main function
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double weight = input.nextDouble();
        System.out.print("Masukkan tinggi badan (meter): ");
        double height = input.nextDouble();

        Person person = new Person(weight, height);
        double bmi = person.calculateBMI();

        System.out.println("Nilai IMT: " + bmi);
        System.out.println("Kategori IMT: " + person.getBMICategory(bmi));

        input.close();
    }
}



