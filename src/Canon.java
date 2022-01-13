public class Canon implements Ziyaret {
    private String cikti ;

    public Canon(String cikti) {
        this.cikti = cikti;
    }

    public String getCikti() {
        return cikti;
    }

    public void setCikti(String cikti) {
        this.cikti = cikti;
    }

    @Override
    public String kabul(Visitor visitor) {
        return visitor.visit(this);
    }
}
