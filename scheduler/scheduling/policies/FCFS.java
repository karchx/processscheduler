package scheduler.scheduling.policies;

import java.util.concurrent.ConcurrentLinkedQueue;

import scheduler.processing.SimpleProcess;

public class FCFS extends Policy {
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
}
