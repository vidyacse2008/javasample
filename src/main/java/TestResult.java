import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class TestResult implements Comparable<TestResult>{
    String name;
    long durationMs;
    Status status;

    TestResult(String name, long durationMs, Status status) {
        this.name = name;
        this.durationMs = durationMs;
        this.status = status;
    }

    public long getDurationMs(){
        return this.durationMs;
    }

    @Override
    public int compareTo(TestResult other) {
      return Long.compare(this.durationMs, other.durationMs);
    }

    public static List<String> slowestTests(List<TestResult> results, int n){
       
       List<TestResult> sorted = new ArrayList<>(results);
       sorted.sort(Comparator.comparingLong(TestResult::getDurationMs).reversed());
       //Collections.sort(sorted,Collections.reverseOrder());
       List<String> slowestTests = new ArrayList<>();
       for(int i=0;i<Math.min(n,sorted.size());i++){
        slowestTests.add(sorted.get(i).name);
      }
      return slowestTests;
    }

    public static void main(String args[]){
        List<TestResult> testResults = List.of( new TestResult("sabc",300,Status.PASSED), new TestResult("createSampleTest", 5400,Status.FAILED),
    new TestResult("importTest", 9800,Status.SKIPPED),
    new TestResult("searchTest", 300,Status.PASSED),
    new TestResult("exportTest", 4100,Status.FAILED));
    System.out.println(TestResult.slowestTests(testResults,10));
    }
}