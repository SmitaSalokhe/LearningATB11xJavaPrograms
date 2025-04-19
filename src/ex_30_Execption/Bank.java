package ex_30_Execption;

public class Bank
{
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName) {
        if(bankName.currency.equals("INR"))
        {
            return bankName.amount + this.amount;
        }
        else {
            try {
                throw new CurrencyMissMatchException("Currency miss match");
            } catch (CurrencyMissMatchException e) {
                System.out.println("cirrency missmatch");
            }
        }
        return 0;
    }

}

class CurrencyMissMatchException extends Exception{
    CurrencyMissMatchException(String msg)
    {
        super(msg);
    }
}


