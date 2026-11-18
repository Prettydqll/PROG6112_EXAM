import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[3][3];
        
        //Ask user for input - like samples screenshots
        for (int i=0; i < 3; i++) {
            for(int j=0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + "for " + products[i] + "mattress: ");
                sales[i][j] = input.nextInt();
                
            }
        }
        
        Product product = new Product (products, sales );
        PrintProduct printer = new PrintProduct (product);
        printer.printReport();
    }
}