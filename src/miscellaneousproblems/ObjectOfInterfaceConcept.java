package miscellaneousproblems;

public interface ObjectOfInterfaceConcept {
    void phoneCall();//method without body as it is an Interface's method

    static void main(String[] args) {
        ObjectOfInterfaceConcept obj = new ObjectOfInterfaceConcept()
                //Anonymous class is created here
                                        {//{ for the beginning of the Anonymous Class
                                        public void phoneCall(){//method @Overriding 'phoneCall()'
                                            System.out.println("My phone can call, text, pic also");
                                            }//Anonymous Class is finished here
                                        };//object 'new ObjectOfInterfaceConcept()' statement is finished here
        obj.phoneCall();
    }
}
