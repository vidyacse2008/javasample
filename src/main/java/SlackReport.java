import java.util.List;

class SlackReport extends BaseReport{
    @Override
    public void publishResults(List<TestResult> testResults){  
    Summary summary = getSummary(testResults);
    sendMessageinSlack(summary);
    }
    private void sendMessageinSlack(Summary summary){
       
    }
}
