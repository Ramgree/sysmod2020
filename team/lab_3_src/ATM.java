public class ATM {

    private CardReader cardReader;
    private Keyboard keyboard;
    private ScreenKeys screenKeys;
    private Database database;
    private MoneyContainer moneyContainer;

    private String State;

    public ATM() {
        this.cardReader = new CardReader();
        this.keyboard = new Keyboard();
        this.screenKeys = new ScreenKeys();
        this.database = new Database();
        this.moneyContainer = new MoneyContainer();
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public CardReader getCardReader() {
        return cardReader;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public ScreenKeys getScreenKeys() {
        return screenKeys;
    }

    public Database getDatabase() {
        return database;
    }

    public MoneyContainer getMoneyContainer() {
        return moneyContainer;
    }

}
