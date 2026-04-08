class Wonder {
    void show() {
        System.out.println("Wonder & Location");
    }
}

class GreatWall extends Wonder {
    void show() { System.out.println("Great Wall of China - China"); }
}

class Petra extends Wonder {
    void show() { System.out.println("Petra - Jordan"); }
}

class Christ extends Wonder {
    void show() { System.out.println("Christ the Redeemer - Brazil"); }
}

class MachuPicchu extends Wonder {
    void show() { System.out.println("Machu Picchu - Peru"); }
}

class ChichenItza extends Wonder {
    void show() { System.out.println("Chichen Itza - Mexico"); }
}

class Colosseum extends Wonder {
    void show() { System.out.println("Roman Colosseum - Italy"); }
}

class TajMahal extends Wonder {
    void show() { System.out.println("Taj Mahal - India"); }
}

public class SevenWonders {
    public static void main(String[] args) {

        Wonder[] wonders = {
            new GreatWall(),
            new Petra(),
            new Christ(),
            new MachuPicchu(),
            new ChichenItza(),
            new Colosseum(),
            new TajMahal()
        };

        for (Wonder w : wonders) w.show();
    }
}