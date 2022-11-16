import scheduler.processing.ArithmeticProcess;
import scheduler.scheduling.policies.FCFS;

public class ProcessScheduler {
  public static void main(String[] args) {
    String politics = args[0];

    if(args[0].substring(1).equals("dual")) {
      politics = args[1];
    }

    switch (politics.substring(1)) {
      case "fcfs":
        ArithmeticProcess p = new ArithmeticProcess(1);
        ArithmeticProcess p2 = new ArithmeticProcess(2);
        ArithmeticProcess p3 = new ArithmeticProcess(3);
        FCFS fcfs = new FCFS();
        fcfs.add(p);
        fcfs.add(p2);
        fcfs.add(p3);
        fcfs.remove();
        break;
      case "lcfs":
        System.out.println("Policy lcfs");
        break;
      case "rr":
        System.out.println("Policy rr");
        break;
      case "pp":
        System.out.println("Policy pp");
        break;
      default: 
        System.out.println("Policy not defined");
    }
  }
}
