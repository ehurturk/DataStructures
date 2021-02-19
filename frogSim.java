package apCSExercies;

public class frogSim {
  
  private int goalDistance;
  private int maxHops;

  public frogSim(int dist, int numHops) {
    goalDistance = dist;
    maxHops = numHops;
  }

  private int hopDist() {
    return 10;
  }
  

  public boolean simulate() {
    int currentDist = 0;
    for(int i = 0; i<maxHops; i++) {
      if(currentDist < 0 || currentDist>=goalDistance)
      {
        return true;
      }

      currentDist += hopDist();
    }
    return false;
  }

  public double runSimulations(int num) {
    int tValues = 0;

    for (int j = 0; j < num; j++) {
      if (simulate()) {
        tValues++;
      }
    }

    return tValues / num;
  }
  
  public static void main(String[] args) {
    frogSim p = new frogSim(30, 5);
    double ratio = p.runSimulations(100);
    System.out.println(ratio);
  }
}
