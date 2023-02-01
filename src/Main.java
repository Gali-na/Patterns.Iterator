public class Main {
    public static void main(String[] args) {
        ConcreteAgrreggator concreteAgrreggator = new ConcreteAgrreggator();
     MyIterator myIterator =concreteAgrreggator.iterator();
          while (myIterator.hasNext()) {
              System.out.println(myIterator.next());
          }

        System.out.println("Hello world!");
    }
}