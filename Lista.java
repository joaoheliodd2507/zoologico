package zoologico;

public class Lista {
    
    public static void main(String[] args) {

        System.out.println("-------Animais-------");
        System.out.println();

        Lobo lobo = new Lobo ("Gerço", "M", "da Neve");
        System.out.println("------Lobo------");
        lobo.dormir();
        lobo.caminhar();
        lobo.correr();
        lobo.emitirSom();

        System.out.println("-----------------------------");
        
        Leao Africano = new Leao ("Simba", "M", "Leão Africano");
        System.out.println("------Leão------");
        Africano.dormir();
        Africano.caminhar();
        Africano.correr();
        Africano.emitirSom();

        System.out.println("-----------------------------");

        Tigre Bengala = new Tigre ("Tigrinho", "M", "Tigre de Bengala");
        System.out.println("------Tigre------");
        Bengala.dormir();
        Bengala.caminhar();
        Bengala.correr();
        Bengala.emitirSom();

        System.out.println("-----------------------------");

        Cachorro  Doberman = new Cachorro ("Bella", "F", "Doberman");
        System.out.println("------Doberman------");
        Doberman.dormir();
        Doberman.caminhar();
        Doberman.correr();
        Doberman.emitirSom();

        System.out.println("-----------------------------");

        Gato Siames  = new Gato ("Bella", "F", "Siames");
        System.out.println("------Siames------");
        Siames.dormir();
        Siames.caminhar();
        Siames.correr();
        Siames.emitirSom();

    } 
}

