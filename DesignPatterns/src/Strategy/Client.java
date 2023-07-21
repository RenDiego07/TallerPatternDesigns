package Strategy;

public class Client {
	public void processDistribution() {
		// Creamos el contexto
		LogisticServiceContext contexto = new LogisticServiceContext();
		
        // Distribución por vía automotriz
        contexto.setStrategy(new AutomotiveLogistic());
        contexto.distribuirArticulos();

        // Distribución por vía ciclista
        contexto.setStrategy(new CyclicalLogistic());
        contexto.distribuirArticulos();

        // Distribución por vía férrea
        contexto.setStrategy(new RailwayLogistic());
        contexto.distribuirArticulos();

        // Distribución por vía aérea
        contexto.setStrategy(new AirLogistic());
        contexto.distribuirArticulos();

        // Distribución por vía fluvial
        contexto.setStrategy(new RiverLogistic());
        contexto.distribuirArticulos();
	}

}
