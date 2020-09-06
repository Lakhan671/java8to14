package thread;

public class Singleton {
    private static Singleton _instance=null;
    public static Singleton getInstance() {
        if (_instance == null) { // Single Checked
            synchronized (Singleton.class)
            {
                if (_instance == null)// Double checked

                {
                    _instance = new Singleton();
                }
            }
        }
        return _instance;
    }
    }
