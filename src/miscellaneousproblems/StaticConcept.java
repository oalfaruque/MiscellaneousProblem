package miscellaneousproblems;

public class StaticConcept {
    static String schoolName = "PnT";
    static String batch= "July19";
    String name ;
    int studentID;

//       public StaticConcept(String schoolName, String name, String batch, int studentID){
//       this.schoolName = schoolName;
//       this.batch = batch;
//       this.name = name;
//       this.studentID = studentID;
//       }
    public void behavior(){
        System.out.println("Sushmita is a talkative student");
        System.out.println("She studies in "+ schoolName + " and her batch is " + batch);
    }

    public static void main(String[] args) {
        StaticConcept staticConcept = new StaticConcept();
        staticConcept.behavior();
        System.out.println("She studies in "+ schoolName + " and her batch is " + batch);
    }
}
