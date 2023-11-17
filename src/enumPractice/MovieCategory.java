package enumPractice;

public enum MovieCategory {
    HORROR("Horror"),
    DRAMA ("Dramat"),
    SCI_FI("Science Fiction"),
    ROMANTIC ("Film Romantyczny");

    private String displayName;

    MovieCategory(String displayName) { // konstruktor jest zawsze prywatny
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
