public class Usuario {
    public String nome;
    public String email;
    private String senha;

    public String getSenha(){
        return senha;
    }
    public void validaSenha(String senha){
        if (senha.length() >= 6){
            System.out.println("Sua senha cumpre os padroes de seguranca");
            this.senha = senha;
        } else {
            System.out.println("Sua senha de ter pelo menos 6 caracteres");
        }
    }
}
