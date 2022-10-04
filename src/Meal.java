import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items;

    public Meal() {
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float total = 0f;
        for (Item item: items) {
            total += item.price();
        }
        return  total;
    }
    public void showItems(){
        for (Item item: items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Package: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
}
