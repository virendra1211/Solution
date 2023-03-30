package codingtest;
class Writer {
  public static void write() {
    System.out.println("Writing...");
  }
}

class Author extends Writer {
  public static void write() {
    System.out.println("Writing book");
  }
}

public class StaticOverrideExample extends Author {
  public static void write() {
    System.out.println("Writing code");
  }

  public static void main(String[] args) {
    Author a = new StaticOverrideExample();
    a.write(); //
  }
}