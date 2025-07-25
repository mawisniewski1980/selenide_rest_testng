package ste.thread;

import java.util.HashMap;
import java.util.Map;

public final class Threads {

    private static Threads instance;

    private ThreadLocal<Map<String, Object>> threadObject = ThreadLocal.withInitial(HashMap::new);
    private ThreadLocal<Map<String, String>> threadString = ThreadLocal.withInitial(HashMap::new);

    public static Threads getInstance() {
        if (instance == null) {
            instance = new Threads();
        }
        return instance;
    }

    public Object getObject(String key) {
        return threadObject.get().get(key);
    }

    public void setObject(String key, Object obj) {
        this.threadObject.get().put(key, obj);
    }

    public void clearObjectByKey(String key) {
        if (this.threadObject.get().containsKey(key))
            this.threadObject.get().remove(key);
    }

    public String getString(String key) {
        return threadString.get().get(key);
    }

    public void setString(String key, String str) {
        this.threadString.get().put(key, str);
    }

    public void clearStringByKey(String key) {
        if (this.threadString.get().containsKey(key))
            this.threadString.get().remove(key);
    }

    public void clearAll() {
        this.threadObject.get().clear();
        this.threadString.get().clear();
    }

}
