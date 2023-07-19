
class SingleObject {
    // create an object of singleObject
    private static SingleObject instance = new SingleObject();

    // create private costractor
    private SingleObject() {
    }

    // get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    // show a message

    public void showMessage() {
        System.out.println("Hello World");
    }
}