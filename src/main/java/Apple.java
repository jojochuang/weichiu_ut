public class Apple implements Fruit {
  int price;
  int cost;
  public Apple(int price, int cost) {
    this.price = price;
    this.cost = cost;
  }
  public int getPrice() {
    return price;
  }

  public int getCost() {
    return cost;
  }

  public int getProfit() {
    return price - cost;
  }
}
