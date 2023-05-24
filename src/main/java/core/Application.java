package core;

import io.IO;

public class Application {

    private final IO io;
    private final GenerationInn generationInn;

    public Application(IO io) {
        this.io = io;
    }

    public Application(GenerationInn generationInn) {
        this.generationInn = generationInn;
    }

    public void run() {
        String num = io.inputNumber();
        if (num.equals("1")) {
            System.out.println(generationInn.generationNewInn());
        }
    }
}
