public class Main {

    public static void main(String[] args) {
	Tablet tablet=new Tablet();
    Bilgisayar bilgisayar=new Bilgisayar();

    Hp hpcikti1=new Hp("Bu yazi cikti1 Hp makinesinden geliyor");
    Canon canoncikti2=new Canon("Bu yazi cikti2 Canon makinesinden geliyor");

        System.out.println(hpcikti1.kabul(tablet));
        System.out.println(hpcikti1.kabul(bilgisayar));
        System.out.println(canoncikti2.kabul(tablet));
        System.out.println(canoncikti2.kabul(bilgisayar));


    }
}
