package sky.pro.hw21.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.hw21.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public List<Item> add(List<Item> items) {
        this.items.addAll(items);
        return this.items;
    }

    public List<Item> add(Item item) {
        items.add(item);
        return this.items;
    }

    public List<Item> get() {
        return Collections.unmodifiableList(items);
    }

}
