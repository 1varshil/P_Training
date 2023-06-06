class Product1 {
    String name;
    double price;
    int quantity;
    static int totalSold = 0;

   Product1(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void sell(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + "(s) sold successfully.");
        } else {
            System.out.println("Insufficient quantity of " + name + " to sell.");
        }
    }

    static int getTotalSold() {
        return totalSold;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Product1 product1 = new Product1("DairyMilk", 10, 20);
        Product1 product2 = new Product1("KitKat", 15, 15);
        Product1 product3 = new Product1("Perk", 20, 30);

        product1.sell(5);
        product2.sell(10);
        product3.sell(25);

        System.out.println("Total products sold: " + Product1.getTotalSold());
    }
}













//		this.totalSold = s;
//	}
//}
