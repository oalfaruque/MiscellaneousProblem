package miscellaneousproblems;

public interface LambdaExpressionsConcept {
    void phoneCall();
    static void main(String[] args) {
        LambdaExpressionsConcept obj = ()-> System.out.println("Smart phone is an amazing creation");
        obj.phoneCall();
    }
}
