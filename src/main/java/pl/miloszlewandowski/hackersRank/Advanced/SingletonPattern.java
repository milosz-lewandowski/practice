package pl.miloszlewandowski.hackersRank.Advanced;

class Singleton {
    private Singleton() {
    }

    public String str;
    private static Singleton instance = new Singleton();

    public static Singleton getSingleInstance() {
        return instance;
    }
}

