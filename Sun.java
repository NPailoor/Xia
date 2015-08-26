public class Sun extends Hex {
  public void shipEnter(Ship s) {
    s.destroy();
  }
}
