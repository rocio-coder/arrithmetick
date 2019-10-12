public class App {
    public static void main(String[] args) {
        Arithmetic ari = new Arithmetic();
        Result res = new Result();
        ari.sum(10, 10, res);
        System.out.println(res.getResultSum());

        ari.subtraction(34, 67, res);
        System.out.println(res.getResultSubtraction());

        ari.multiplication(45,54,res);
        System.out.println(res.getMultiplication());

        ari.division(3,1,res);
        System.out.println(res.getDivision());


    }

}
