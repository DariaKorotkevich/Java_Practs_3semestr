package task_10;

public enum Brands {
    HUAWEI,
    HONOR,
    DELL;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}