package enumPractice;

public enum Kolor {
    CZERWONY(false),
    ZIELONY(true),
    NIEBIESKI(true);
    boolean ladny;

    Kolor(boolean ladny) {
        this.ladny = ladny;
    }

    public boolean isLadny() {
        return ladny;
    }
}


