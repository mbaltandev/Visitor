public class Bilgisayar implements Visitor {


        public Bilgisayar( ) {

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


