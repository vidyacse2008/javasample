
import java.util.List;

 abstract class BaseReport implements Report {
    public Summary getSummary(List<TestResult> testResults){
      int passCount = 0;
      int failCount = 0;
      int skipCount = 0;
      for(TestResult testResult : testResults){
      if(testResult.status == Status.PASSED){
         passCount++;
       }
       if(testResult.status == Status.SKIPPED){
         skipCount++;
       }
     }
     failCount = testResults.size()-passCount-skipCount;
     return new Summary(passCount,skipCount,failCount);
    }

} 