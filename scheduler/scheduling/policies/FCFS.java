package scheduler.scheduling.policies;

import java.util.concurrent.ConcurrentLinkedQueue;

import scheduler.processing.ArithmeticProcess;
import scheduler.processing.SimpleProcess;

public class FCFS extends Policy implements Runnable {
  ConcurrentLinkedQueue<SimpleProcess> process = new ConcurrentLinkedQueue<SimpleProcess>();

  @Override
  public void add(SimpleProcess p) {
    this.process.add(p);
  }

  @Override
  public void remove() {
    this.process.remove();
  }

  @Override
  public SimpleProcess next() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void run() {
    ArithmeticProcess p = new ArithmeticProcess(1);
    ArithmeticProcess p2 = new ArithmeticProcess(2);
    ArithmeticProcess p3 = new ArithmeticProcess(3);
    ArithmeticProcess p4 = new ArithmeticProcess(4);
    FCFS fcfs = new FCFS();
    try {
      fcfs.add(p);
      Thread.sleep(p.getTime());
      fcfs.add(p2);
      Thread.sleep(p.getTime());
      fcfs.add(p3);
      Thread.sleep(p.getTime());
      fcfs.remove();
      Thread.sleep(p.getTime());
      fcfs.add(p4);
      Thread.sleep(p.getTime());
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
