public class Carro {
    public Motor motor;

    public Carro(){
        motor = new Motor();
    }

    public void ligar(){
        if (motor.funcionando == false){
            System.out.println("Nao foi possivel ligar o carro pois o motor nao esta funcionado");
        } else {
            System.out.println("Carro ligado");
        }
    }
    public static class Motor{
        public boolean funcionando;

        public Motor(){
            funcionando = true;
        }
    }
}
