public class Product implements IProduct {
    
    //Single dimensional array - product names
    
    private String[] products= {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
            
     //Two dimensional array - sales [product][month]
     //Row 0 = Cozy, Ro1 1= Restonic, Row 2 = Sealy
            
     private int [][] sales = {
         {25, 18, 20},
         {15, 10, 12},
         {18, 15, 20}
            
     };
     
     //For unit tests - allow passing custom data
     public Product () {
         
     }
     
     public Product (String[] products, int[][] sales ){
             this.products = products;
             this.sales = sales;
}
     @Override
     public int GetTotalProductsSold() {
         int total = 0;
         for (int i = 0 ; i< sales.length; i++) {
             for(int j = 0; j < 3; j++) {
             total += sales[i][j];
         }
         }
         return total;
     }
     
     @Override
     public double GetAverageProductSold() {
         int total = GetTotalProductsSold();
         int count = 0;
         for (int i=0; i < sales.length; i++) {
             count +=sales[i].length;
         }
         return(double) total/ count ;
         
     }
     
     @Override
     public String GetMostPopularProduct() {
         
     //Most popular = highest  single month sale, to match sample: 25
     
     int max =sales[0][0];
     String popular = products[0];
     for (int i=0; i < sales.length; i++) {
         for(int j = 0; j < 3; j++) {
         if (sales[i][j]> max){
             max=sales[i][j];
             popular = products[i];
    }
  }
}
     return popular + "(" +max +")";
}
public String[] getProducts() {
    return products;
}


public int[][] getSales() {
    return sales;
}
}        
