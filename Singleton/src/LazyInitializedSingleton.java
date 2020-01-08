public class LazyInitializedSingleton {
  private static LazyInitializedSingleton instance;

  public static LazyInitializedSingleton getInstance() {
    if (instance == null) {
      return new LazyInitializedSingleton();
    }
    return instance;
  }
}
