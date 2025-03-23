
public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.validaSenha("oi");
        System.out.println(u1.getSenha());
        u1.validaSenha("TONETTOOOOOO");
        System.out.println(u1.getSenha());
    }
}