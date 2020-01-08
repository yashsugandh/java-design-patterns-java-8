public class ThreadSafeSingleton {
  private static ThreadSafeSingleton instance;

  public static synchronized ThreadSafeSingleton getInstance() {
    if (instance == null) {
      return new ThreadSafeSingleton();
    }
    return instance;
  }
}
