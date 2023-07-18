class Student extends Person{
    private String standard;
    private String instructor;
    
    public Student(){
        
    }
    
    public Student(String fName, String lName, String id,String standard, String instructor){
        super(fName, lName, id);
        this.setStandard(standard);
        this.setInstructor(instructor);
    }
    
    
    public String getStandard(){
        return standard;
    }
    
    public void setStandard(String standard){
        this.standard = standard;
    }
    
     public String setInstructor(){
       return instructor;
    }
    
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
    
    @Override
    public String displayNames(){
      return String.format("%s  %s", getFName(), getLName());  
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("%s %s", standard, instructor);
    }
}