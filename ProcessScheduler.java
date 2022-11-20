import java.util.Scanner;

import scheduler.scheduling.policies.FCFS;

public class ProcessScheduler {
  static Scanner input = new Scanner(System.in);
  static String expression = "";

  public static void main(String[] args) {
    String politics = args[0];

    if (args[0].substring(1).equals("dual")) {
      politics = args[1];
    }

    switch (politics.substring(1)) {
    case "fcfs":
      FCFS fcfsThr = new FCFS();
      (new Thread(fcfsThr)).start();
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
