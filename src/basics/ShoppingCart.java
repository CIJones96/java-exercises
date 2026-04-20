package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    private final List<Item> items = new ArrayList<>();

    public void addItem(String name, double price, int quantity) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name required");
        if (price < 0) throw new IllegalArgumentException("Price must be non-negative");
        if (quantity <= 0) throw new IllegalArgumentException("Quantity must be positive");

        Optional<Item> existing = items.stream()
                .filter(i -> i.name.equals(name)).findFirst();

        if (existing.isPresent()) {
            existing.get().quantity += quantity;
        } else {
            items.add(new Item(name, price, quantity));
        }
    }

    public boolean removeItem(String name) {
        return items.removeIf(i -> i.name.equals(name));
    }

    public double getTotal() {
        return items.stream()
                .mapToDouble(i -> i.price * i.quantity)
                .sum();
    }

    public double applyDiscount(double discountPercent) {
        if (discountPercent < 0 || discountPercent > 100)
            throw new IllegalArgumentException("Discount must be 0–100");
        return getTotal() * (1 - discountPercent / 100.0);
    }

    public void clear() {
        items.clear();
    }

    public int getItemCount() {
        return items.stream().mapToInt(i -> i.quantity).sum();
    }

    // --- Inner class ---
    static class Item {
        String name;
        double price;
        int quantity;

        Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }
}
