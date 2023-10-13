public class Test {
    public static void main(String[] args) {
        Livre livre1=new Livre(174,"La aaa","bbb",15000);
        Livre L1=new Livre();
        livre1.toString();
        L1.toString();
        System.out.println(L1.getAuteur());
        livre1. setAuteur("albert");
        System.out.println(L.getAuteur());
        System.out.println("le nombre des livres est "+Livre.count);
    }
}
