import Factories.CallFactory;
import Models.Call;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        CallFactory a = new CallFactory(new File("/home/jonathon/Music/SQ4_2015-11-2506_05_11_637850.mp3"));
        Call Squad4 = a.getCall();
        System.out.println(Squad4.getCallDate());



    }
}
