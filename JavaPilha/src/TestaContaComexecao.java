public class TestaContaComexecao {
    public static void main(String[] args) {

        Conta c = new Conta();
        try {
            c.deposita();
        }catch (Minhaexcecao ex){
            System.out.println("Tratamento");
        }
    }
}
