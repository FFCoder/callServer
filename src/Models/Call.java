package Models;

import java.io.File;
import java.util.Date;

public class Call {
    File mp3File;
    Unit unit;
    Date callDate;
    Integer runNumber;
    String uId;

    public Call(File mp3File, Unit unit, Date callDate) {
        this.mp3File = mp3File;
        this.unit = unit;
        this.callDate = callDate;
    }

    public Call(File mp3File, Unit unit, Date callDate, String uId) {
        this.mp3File = mp3File;
        this.unit = unit;
        this.callDate = callDate;
        this.uId = uId;
    }

    public Call(File mp3File, Unit unit, Date callDate, Integer runNumber, String uId) {
        this.mp3File = mp3File;
        this.unit = unit;
        this.callDate = callDate;
        this.runNumber = runNumber;
        this.uId = uId;
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

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}

