

import java.util.List;

class ConsoleReport implements Report{
    @Override
    public void publishResults(List<TestResult> testResults){
     for(TestResult testResult : testResults){
        System.out.println("[Console]" + testResult.name + ":" +  testResult.status);
     }
     
    }
}