package Models;

import java.io.File;
import java.util.Date;

/**
 * Created by jonathon on 11/28/15.
 */
public class Call {
    File mp3File;
    Unit unit;
    Date callDate;
    Integer runNumber;

    public Call(File mp3File, Unit unit, Date callDate) {
        this.mp3File = mp3File;
        this.unit = unit;
        this.callDate = callDate;
    }

    public File getMp3File() {
        return mp3File;
    }

    public Unit getUnit() {
        return unit;
    }

    public Date getCallDate() {
        return callDate;
    }

    public Integer getRunNumber() {
        if (runNumber != null) {
            return runNumber;
        }
            else return null;
        }

    public void setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
    }
}

