package Factories;

import Enums.Units;
import Models.Unit;

/**
 * Created by jonathon on 11/28/15.
 */
public class UnitFactory {
    Units unit;

    public UnitFactory(Units unit) {
        this.unit = unit;
    }
    public Unit getUnit() {
        Unit unitMod = new Unit();
        switch (unit) {
            case Engine1:
                unitMod.setName("Engine 1");
                unitMod.setStationNumber(1);
                return unitMod;
            case Engine2:
                unitMod.setStationNumber(2);
                unitMod.setName("Engine 2");
                return unitMod;


            case Engine3:
                unitMod.setStationNumber(3);
                unitMod.setName("Engine 3");
                return unitMod;


            case Engine4:
                unitMod.setStationNumber(4);
                unitMod.setName("Engine 4");
                return unitMod;


            case Engine5:
                unitMod.setStationNumber(5);
                unitMod.setName("Engine 5");
                return unitMod;

            case Engine6:
                unitMod.setStationNumber(6);
                unitMod.setName("Engine 6");
                return unitMod;


            case Engine7:
                unitMod.setStationNumber(7);
                unitMod.setName("Engine 7");
                return unitMod;

            case Engine8:
                unitMod.setStationNumber(8);
                unitMod.setName("Engine 8");
                return unitMod;

            case Engine9:
                unitMod.setStationNumber(9);
                unitMod.setName("Engine 9");
                return unitMod;

            case Engine10:
                unitMod.setStationNumber(10);
                unitMod.setName("Engine 10");
                return unitMod;

            case Engine11:
                unitMod.setStationNumber(11);
                unitMod.setName("Engine 11");
                return unitMod;


            case Engine12:
                unitMod.setStationNumber(12);
                unitMod.setName("Engine 12");
                return unitMod;


            case Engine14:
                unitMod.setStationNumber(14);
                unitMod.setName("Engine 14");
                return unitMod;

            case SQ1:
                unitMod.setStationNumber(1);
                unitMod.setName("Squad 1");
                return unitMod;

            case SQ12:
                unitMod.setName("Squad 12");
                unitMod.setStationNumber(12);
                return unitMod;

            case SQ4:
                unitMod.setName("Squad 4");
                unitMod.setStationNumber(4);
                return unitMod;

            default:
                return null;
        }
    }
}
