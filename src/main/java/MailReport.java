import java.util.List;
class MailReport extends BaseReport {
    @Override
    public void publishResults(List<TestResult> testResults){  
    Summary summary = getSummary(testResults);
    System.out.printf("sending mail. Passed:%d, Failed:%d, Skipped:%d%n",summary.getPassCount(),summary.getFailCount(),summary.getSkipCount());
}
}