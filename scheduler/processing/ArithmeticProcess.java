package scheduler.processing;

public class ArithmeticProcess extends SimpleProcess {
  public ArithmeticProcess(int id) {
    super(id);
    System.out.println("ArithmeticProcess pid: " + id);
  }
}
