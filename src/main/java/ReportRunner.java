import java.util.List;
class ReportRunner {
    public static void main(String args[]){
        List<TestResult> testResults = List.of(new TestResult("abc",1350,Status.PASSED),new TestResult("abcd",1200,Status.FAILED),new TestResult("abcdef",1350,Status.SKIPPED),new TestResult("abcdgehgdh",1350,Status.PASSED));
        List<Report> reports = List.of(new MailReport(), new ConsoleReport());
        for(Report report: reports){
            report.publishResults(testResults);
        }

    }
}