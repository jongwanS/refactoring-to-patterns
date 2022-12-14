package study.ch6.ReplaceConstructorswithCreationMethods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanTest {

    @Test
    @DisplayName("loan test")
    public void loanConstructor(){
        Loan termLoan = Loan.createTermLoan(0,0,new Date());
        assertEquals(termLoan.getCapitalStrategy() instanceof CapitalStrategyTermLoan, true);
        assertEquals(termLoan.getCapitalStrategy() instanceof CapitalStrategyResolver, false);

        Loan termLoanWithStrategy = Loan.createTermLoan(new CapitalStrategyTermLoan(),0,0,new Date());
        assertEquals(termLoanWithStrategy.getCapitalStrategy() instanceof CapitalStrategyResolver, false);
    }


}
