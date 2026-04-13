package Entities;

import Definitions.Creature;
import Definitions.Territory;
import Definitions.SimCitizenship;

public class Simonite extends Creature implements SimCitizenship{

    int speed = 2;

    public Simonite(String name, int size, int x, int y) {
        super(name, size, x, y);
    }
    
}
