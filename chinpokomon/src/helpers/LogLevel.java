package helpers;

public enum LogLevel {
    ERROR(5),
    WARN(4),
    INFO(4),
    DEBUG(4);

    public final int level;

    private LogLevel(int level) {
        this.level = level;
    }
}
