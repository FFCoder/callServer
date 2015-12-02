package Factories;

import Enums.Units;
import Models.Call;
import Models.Unit;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class CallFactory {
    private HashMap<String,Object> callParameters;
    private File mp3file;
    public CallFactory(File mp3file) {
        this.mp3file = mp3file;
        try {
            parseMp3File();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private void parseMp3File() throws ParseException {
        callParameters = new HashMap<>();
        Date unitDate;
        String rawFileName = mp3file.getName();
        String[] rawArray = rawFileName.split("_");
        UnitFactory uf = new UnitFactory(getUnit(rawArray[0]));
        Unit unit = uf.getUnit();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateParse = rawArray[1].substring(0,10) + " " + rawArray[1].substring(10,12)+":"+rawArray[2]+":"+rawArray[3];
        unitDate = sdf.parse(dateParse);
        String uniqueCallid = rawArray[4];
        callParameters.put("unit",unit);
        callParameters.put("callDate",unitDate);
        callParameters.put("uID",uniqueCallid);




    }
    public Call getCall() {
        return new Call(mp3file,(Unit)callParameters.get("unit"),(Date)callParameters.get("callDate"),(String)callParameters.get("uID"));

    }
    private Units getUnit(String rawUnit) {
        switch (rawUnit) {
            case "E1":
                return Units.Engine1;

            case "E2":
                return Units.Engine2;

            case "E3":
                return Units.Engine3;

            case "E4":
                return Units.Engine4;

            case "E5":
                return Units.Engine5;

            case "E6":
                return Units.Engine6;

            case "E7":
                return Units.Engine7;

            case "E8":
                return Units.Engine8;

            case "E9":
                return Units.Engine9;

            case "E10":
                return Units.Engine10;

            case "E11":
                return Units.Engine11;

            case "E12":
                return Units.Engine12;

            case "E14":
                return Units.Engine14;
            case "SQ4":
                return Units.SQ4;
            default:
                return null;
        }
    }



}
