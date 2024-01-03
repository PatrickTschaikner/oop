package at.pat.basic.oop.Konto;

public class Main {
    public static void main(String[] args) {
        Sparbuch sparbuch = new Sparbuch(100);
        Girokonto girokonto = new Girokonto(100, -130);
        Kreditkonto kreditkonto = new Kreditkonto(-1000,0);
        Bank bank = new Bank(sparbuch,girokonto,kreditkonto);

        bank.Einzahlen("sparbuch",200);
        bank.Einzahlen("girokonto",20);
        bank.Einzahlen("kreditkonto",1200);

        bank.Auszahlen("sparbuch",310);
        bank.Auszahlen("girokonto",260);
        bank.Auszahlen("kreditkonto",200);

        bank.Saldo("sparbuch");
        bank.Saldo("girokonto");
        bank.Saldo("kreditkonto");
    }
}
