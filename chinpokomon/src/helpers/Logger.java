package helpers;

public class Logger {
    private static Logger instance;

    private static LogLevel defaultLogLevel = LogLevel.DEBUG;

    public static void setDefaultLogLevel(LogLevel defaultLogLevel) {
        Logger.defaultLogLevel = defaultLogLevel;
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(defaultLogLevel);
        }
        return instance;
    }

    private LogLevel logLevel;

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    private Logger(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public void error(String msg) {
        this.printIfLevelSatisfies(LogLevel.ERROR, msg);
    }

    public void warn(String msg) {
        this.printIfLevelSatisfies(LogLevel.WARN, msg);
    }

    public void info(String msg) {
        this.printIfLevelSatisfies(LogLevel.INFO, msg);
    }

    public void debug(String msg) {
        this.printIfLevelSatisfies(LogLevel.DEBUG, msg);
    }

    public void printIfLevelSatisfies(LogLevel logLevel, String msg) {
        if (this.hasLevelFor(logLevel)) {
            this.print(msg);
        }
    }

    private void print(String msg) {
        System.out.println(msg);
    }

    private boolean hasLevelFor(LogLevel logLevel) {
        return this.logLevel.level <= logLevel.level;
    }
}
