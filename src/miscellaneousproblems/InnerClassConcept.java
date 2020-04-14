package miscellaneousproblems;

public class InnerClassConcept {
    int i;
    public void show(){
        System.out.println("My phone can call");
    }
    public static class insideTheClass{
        int j;
        public void show(){
            System.out.println("My phone can call, text, pic");
        }

        public static void main(String[] args) {
            //InnerClassConcept innerClassConcept= new InnerClassConcept();
            InnerClassConcept.insideTheClass obj = new InnerClassConcept.insideTheClass();
            // insideTheClass.show();
            obj.show();
        }
    }
}
