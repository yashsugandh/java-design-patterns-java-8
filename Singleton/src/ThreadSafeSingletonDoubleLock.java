public class ThreadSafeSingletonDoubleLock {
  private static ThreadSafeSingletonDoubleLock instance;

  public static ThreadSafeSingletonDoubleLock getInstance() {
    if (instance == null) {
      synchronized (ThreadSafeSingleton.class) {
        if (instance == null) {
          instance = new ThreadSafeSingletonDoubleLock();
        }
      }
    }
    return instance;
  }
}
