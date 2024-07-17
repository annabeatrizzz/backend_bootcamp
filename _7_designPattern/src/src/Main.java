import Singleton.SingletonEager;
import Singleton.SingletonLazy;
import Singleton.SingletonLazyHolder;
import Strategy.*;
import Facade.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n*********SINGLETON*********");

        System.out.println("\nSINGLETON LAZY");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        System.out.println("\nSINGLETON EAGER");
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        System.out.println("\nSINGLETON LAZY HOLDER");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        System.out.println("\n*********STRATEGY*********");
        Behaviour defensive = new DefensiveBehaviour();
        Behaviour agressive = new AgressiveBehaviour();
        Behaviour normal = new NormalBehaviour();

        Robot robot = new Robot();
        robot.changeBehaviour(normal);
        robot.moviment();
        robot.changeBehaviour(agressive);
        robot.moviment();
        robot.changeBehaviour(defensive);
        robot.moviment();

        System.out.println("\n*********FACADE*********");

        Facade facade = new Facade();
        facade.movingCliente("Anna", "8456");
    }
}