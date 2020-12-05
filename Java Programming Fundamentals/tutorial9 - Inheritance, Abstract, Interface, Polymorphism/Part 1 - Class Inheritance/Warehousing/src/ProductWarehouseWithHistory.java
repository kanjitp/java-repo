public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        if (history.size() > 0) {
            history.add(history.get(history.size() - 1) + amount);
        } else {
            history.add(amount);
        }
    }
    @Override
    public double takeFromWarehouse(double amount) {
        double take = super.takeFromWarehouse(amount);
        history.add(history.get(history.size() - 1) - amount);
        return take;
    }

    public String history() {
        return history.toString();
    }

    public void printAnalysis() {
        System.out.println(
            "Product: " + this.getName() + 
            "\nHistory: " + this.history() + 
            "\nLargest amount of product: " + this.history.maxValue() +
            "\nSmallest amount of product: " + this.history.minValue() +
            "\nAverage: " + this.history.average()
            );
    }


    
}
