package maze;

public enum Generator {
    ID;
    int value = 0;
    public int getNew() {
        return value++;
    }
}
