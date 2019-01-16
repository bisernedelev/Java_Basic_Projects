package education;

public enum EducationDegree {
    Primary(1), 
    Secondary(2),
    Bachelor(3), 
    Master(4), 
    Doctorate(5);
    
    private final int value;
    
    private EducationDegree(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
}
