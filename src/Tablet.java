public class Tablet implements Visitor {


    public Tablet( ) {

    }

    @Override
    public String visit(Hp hp) {
        return hp.getCikti();
    }

    @Override
    public String visit(Canon canon) {
        return canon.getCikti();
    }


}
