package interfaces;

public class Resta implements Operacion{
    @Override
    public int operacionNumeros(int n1, int n2, int n3) {
        return n1-n2-n3;
    }
}
