public class Hp implements Ziyaret {
    private String cikti ;

    public String getCikti() {
        return cikti;
    }

    public void setCikti(String cikti) {
        this.cikti = cikti;
    }

    public Hp(String cikti) {
        this.cikti = cikti;
    }

    @Override
    public String kabul(Visitor visitor) {
        return visitor.visit(this);
    }
}
