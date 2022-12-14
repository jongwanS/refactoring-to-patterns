package study.ReplaceConstructorswithCreationMethods;

import java.util.Date;

public class Loan {

    private CapitalStrategy capitalStrategy;
    public CapitalStrategy getCapitalStrategy() {
        return capitalStrategy;
    }
    private double commitment;

    private double outstanding;
    private int riskRating;
    private Date maturity;
    private Date expiry;

    public Loan(double commitment,int riskRating, Date maturity, Date expiry){
        this(commitment,0,riskRating,maturity,expiry);
    }

    public Loan(double commitment, int outstanding, int riskRating, Date maturity, Date expiry) {
        this(null, commitment,0,riskRating,maturity,null);
    }

    public Loan(CapitalStrategy capitalStrategy, double commitment, int riskRating, Date maturity, Date expiry){
        this(capitalStrategy, commitment, 0, riskRating, maturity, expiry);
    }

    public static Loan createTermLoan(double commitment, int riskRating, Date maturity){
        return new Loan(commitment,0,riskRating,maturity,null);
    }

    public static Loan createTermLoan(CapitalStrategy capitalStrategy , double commitment, int riskRating, Date maturity){
        return new Loan(capitalStrategy, commitment,0,riskRating,maturity,null);
    }

    public Loan(CapitalStrategy capitalStrategy, double commitment, double outstanding, int riskRating, Date maturity, Date expiry) {
        this.commitment = commitment;
        this.outstanding = outstanding;
        this.riskRating = riskRating;
        this.maturity = maturity;
        this.expiry = expiry;

        if(capitalStrategy == null){
            if(expiry == null)
                this.capitalStrategy = new CapitalStrategyTermLoan();
            else if (maturity == null)
                this.capitalStrategy = new CapitalStrategyResolver();
            else
                this.capitalStrategy = new CapitalStrategyRCTl();
        }else{
            this.capitalStrategy = capitalStrategy;
        }
    }
}
