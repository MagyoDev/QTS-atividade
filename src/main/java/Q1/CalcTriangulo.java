package Q1;

public class CalcTriangulo {
    public double calcularArea(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser maiores que zero.");
        }
        
        return (base * altura) / 2;
    }
}
