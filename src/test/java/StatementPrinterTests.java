import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.approvaltests.Approvals.verify;

public class StatementPrinterTests {

    @Test
    void exampleStatement() {
        Map<String, Play> plays = new HashMap<String, Play>();
        plays.put("hamlet", new Play("Hamlet", "tragedy"));
        plays.put("as-like", new Play("As You Like It", "comedy"));
        plays.put("othello", new Play("Othello", "tragedy"));

        List<Performance> performances = new ArrayList<Performance>();
        performances.add(new Performance("hamlet", 55));
        performances.add(new Performance("as-like", 35));
        performances.add(new Performance("othello", 40));


        Invoice invoice = new Invoice("BigCo", performances);

        StatementPrinter statementPrinter = new StatementPrinter();
        String result = statementPrinter.print(invoice, plays);

        verify(result);
    }

    @Test
    void statementWithNewPlayTypes() {
        final Map<String, Play> plays = new HashMap<String, Play>();
        plays.put("henry-v", new Play("Henry V", "history"));
        plays.put("as-like", new Play("As You Like It", "pastoral"));

        List<Performance> performances = new ArrayList<Performance>();
        performances.add(new Performance("henry-v", 53));
        performances.add(new Performance("as-like", 55));

        final Invoice invoice = new Invoice("BigCo", performances);

        final StatementPrinter statementPrinter = new StatementPrinter();
        Assertions.assertThrows(Error.class, new Executable() {
            public void execute() throws Throwable {
                statementPrinter.print(invoice, plays);
            }
        });
    }
}
