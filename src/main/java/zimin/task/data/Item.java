package zimin.task.data;

import lombok.Data;

@Data
public class Item {
    private String name;
    private String price;

    public Item(String name, String price) {
        this.name = name;
        this.price = price;
    }
}
