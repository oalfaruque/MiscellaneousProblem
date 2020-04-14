package miscellaneousproblems;

public class AnonymousInnerClassConcept {
    public void phoneCall(){
        System.out.println("My phone can call only");
    }
    public static void main(String[] args) {
        AnonymousInnerClassConcept obj = new AnonymousInnerClassConcept()
                //Anonymous Inner Class is created here
                                        {
                                            public void phoneCall(){//Anonymous Class
                                            System.out.println("My phone can call, text, pic also");
                                            }
                                        };
        obj.phoneCall();
    }
}
