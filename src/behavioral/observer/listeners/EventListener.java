package behavioral.observer.listeners;

import java.io.File;

public interface EventListener {
    public void update(String eventType, File file) ;
}
