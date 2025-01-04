import java.util.Map;

public record TipoCambio(Map<String, Double> conversion_rates) {
    public Double obtenerTasa(String moneda) {
        if (!conversion_rates.containsKey(moneda)) {
            throw new IllegalArgumentException("Moneda no encontrada: " + moneda);
        }
        return conversion_rates.get(moneda);
    }
}
