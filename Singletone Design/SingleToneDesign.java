
class SingleToneDesign {
    public static void main(String[] args) {
        // illegal construct
        // compiler error// SingleObject object = new SingleToneDesign();
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}