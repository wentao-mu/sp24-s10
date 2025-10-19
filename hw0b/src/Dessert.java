public class Dessert {
    public int flavor;
    public int price;
    public static int numDesserts=0;

    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }

    public void printDessert(){
        System.out.println(this.flavor+" "+this.price+" "+numDesserts);
    }

    public static void main(String[] args) {
        System.out.println("I love dessert!");
    }
}
