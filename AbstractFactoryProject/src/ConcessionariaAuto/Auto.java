package ConcessionariaAuto;

import java.awt.Image;
import java.util.ArrayList;

public class Auto {
	
	Image car;

	public Image immagine(AutoFactory factory) {	//utilizza la classe fabbrica per creare tutto
		car = factory.immagineAuto();
		return car;
	}

}
