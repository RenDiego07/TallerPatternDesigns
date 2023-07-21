package Strategy;

public class LogisticServiceContext {
	private LogisticStrategy strategy;
	
	public void setStrategy(LogisticStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void distribuirArticulos() {
        if (strategy != null) {
            strategy.distribuir();
        } else {
            System.out.println("Error: No se ha definido una estrategia de distribución.");
        }
	}

}
