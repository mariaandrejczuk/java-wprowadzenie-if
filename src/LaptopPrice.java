public class LaptopPrice {
    public static void main(String[] args) {
        double price1 = 3500;
        double price2 = 6100;
        double price3 = 1800;

        if((price1 < price2) & (price2 < price3)) {
                System.out.print("Laptop no 1 has the best price");
        } else if (price2 < price1 & price2 < price3) {
                System.out.println("Laptop no 2 has the best price");
        } else if (price3 < price1 & price3 < price2) {
                System.out.print("Laptop no 3 has the best price");}
    }
}
