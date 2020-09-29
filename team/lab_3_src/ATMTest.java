import org.junit.Test;

public class ATMTest {
    @Test
    public void maryTakesOutAFiver() {
        /**
         * (0) Default state
         * (1) Mary enters her card to the ATM.
         * (2) Mary enters the correct PIN 1234 on the ATM keyboard.
         * (3) Mary clicks on "Withdraw", then enters "5" on the keyboard
         * (4) The ATM checks that Mary has more than 5€ on her account, then dispenses a 5€ note.
         * (5) Mary takes the money and puts it in her pocket.
         * (6) Mary clicks on "Finish"
         * (7) The ATM returns the card.
         * (8) Mary takes the card.
         */
        ATM atm = new ATM();

        atm.setState("WaitForCard");
        atm.getCardReader().setCardInserted(true);
        atm.setState("WaitForPIN");
        atm.getKeyboard().setInput("1234");
        atm.setState("WaitForInput");
        atm.getScreenKeys().setActivatedButton("Withdraw");
        atm.getKeyboard().setInput("5");
        atm.setState("Processing");
        atm.getDatabase().setUserHasMoney(true);
        atm.getMoneyContainer().setContents(5);
        atm.getMoneyContainer().setStatus("Open");
        // Mary takes the money
        atm.setState("WaitForInput");
        atm.getMoneyContainer().setStatus("Closed");
        atm.getMoneyContainer().setContents(0);
        atm.getScreenKeys().setActivatedButton("Finish");
        atm.setState("DispenseCard");
        atm.getCardReader().setCardInserted(false);

        atm.getKeyboard().setInput("");
        atm.getScreenKeys().setActivatedButton("");

        atm.setState("WaitForCard");
    }

    @Test
    public void maryPaysHerISP() {

        /**
         (0) Default state
         (1) Mary enters her card to the ATM.
         (2) Mary enters the correct PIN 1234 on the ATM keyboard.
         (3) Mary clicks on "Payments"
         (4) The ATM shows a list of pre-defined payments on the screen.
         (5) Mary clicks on the payment for her ISP, Telia.
         (6) The ATM shows details of the payment on the screen.
         (7) Mary clicks on "Proceed"
         (8) The ATM processes the payment.
         (9) Mary clicks on "Finish"
         (10) The ATM returns the card.
         (11) Mary takes the card.
         */
        ATM atm = new ATM();

        atm.setState("WaitForCard");
        atm.getCardReader().setCardInserted(true);
        atm.setState("WaitForPIN");
        atm.getKeyboard().setInput("1234");
        atm.setState("WaitForInput");
        atm.getKeyboard().setInput("");

        atm.getScreenKeys().setActivatedButton("Payments");
        atm.getScreenKeys().setActivatedButton("Telia");
        atm.getScreenKeys().setActivatedButton("Proceed");
        atm.getDatabase().setUserHasMoney(true);
        atm.getScreenKeys().setActivatedButton("");

        atm.getScreenKeys().setActivatedButton("Finish");
        atm.setState("DispenseCard");
        atm.getCardReader().setCardInserted(false);

        atm.getScreenKeys().setActivatedButton("");
        atm.setState("WaitForCard");

        assert(atm.getKeyboard() != null);
        assert(atm.getScreenKeys() != null);
        assert(atm.getDatabase() != null);
        assert(atm.getCardReader() != null);
        assert(atm.getMoneyContainer() != null);
    }

}
