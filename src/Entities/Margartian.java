package Entities;

import Definitions.Creature;
import Definitions.Territory;
import Definitions.MargCitizenship;

public class Margartian extends Creature implements MargCitizenship {

    int speed = 4;

    public Margartian(String name, int size, int x, int y) {
        super(name, size, x, y);
    }
    
}
