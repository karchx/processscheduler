package scheduler.processing;

public class ArithmeticProcess extends SimpleProcess {
  private int time = 300;

  public ArithmeticProcess(int id) {
    super(id);
  }

  public String toString() {
    return "A " + super.toString();
  }

  public int getTime() {
    return this.time;
  }
}
