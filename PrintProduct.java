public class PrintProduct {
    private Product product;
    
    public PrintProduct(Product product){
        this.product = product;
}
    
public void printTotalProductSales() {
    System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
   
}
public void printAverageProductSales() {
    System.out.println("AVERAGE PRODUCT SALES: " + (int) product.GetAverageProductSold());
}

public void printMostPopularProduct() {
    System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
}
public void printReport() {
    System.out.println("*********************************");
    System.out.println("PRODUCT SALES REPORT - 2026");
    System.out.println("*********************************");
    printTotalProductSales();
    printAverageProductSales();
    printMostPopularProduct();
}
}