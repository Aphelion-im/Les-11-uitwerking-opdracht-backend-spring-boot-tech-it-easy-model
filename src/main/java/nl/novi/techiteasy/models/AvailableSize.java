package nl.novi.techiteasy.models;

public enum AvailableSize {
    S(50), // Index 0
    M(55),
    L(60),
    XL(65);

    public final int size;
    private AvailableSize(int size){
        this.size = size;
    }

}