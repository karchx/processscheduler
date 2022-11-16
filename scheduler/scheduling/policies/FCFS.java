package scheduler.scheduling.policies;

import java.util.concurrent.ConcurrentLinkedQueue;

import scheduler.processing.SimpleProcess;

public class FCFS extends Policy {
  ConcurrentLinkedQueue<SimpleProcess> process = new ConcurrentLinkedQueue<SimpleProcess>();

  @Override
  public void add(SimpleProcess p) {
    System.out.println("Insert process ArithmeticProcess: " + p.getId());
    this.process.add(p);
    System.out.println("Insert process ArithmeticProcess stack: " + this.process.toString());
  }

  @Override
  public void remove() {
    SimpleProcess removed = this.process.peek();
    System.out.println("Se removio: " + removed.toString());
  }

  @Override
  public SimpleProcess next() {
    // TODO Auto-generated method stub
    return null;
  }
}
