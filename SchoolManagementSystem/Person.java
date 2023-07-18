public abstract class Person{
    private String fName;
    private String lName;
    private String id;
    
    public Person(){
        
    }
    
    public Person(String fName, String lName, String id){
        this.setFName(fName);
        this.setLName(lName);
        this.setId(id);
    }
    
    public String getFName(){
        return fName;
    }
    
    public String getLName(){
        return lName;
    }
    
    public String getId(){
        return id;
    }
    
    public void setFName(String fName){
        this.fName = fName;
    }
    
    public void setLName(String lName){
         this.lName = lName;
    }
    
    public void setId(String id){
         this.id = id;
    }
    
    public abstract String displayNames();
    
    
    public String toString(){
        return String.format("%s  %s  %s",fName, lName, id);
    }
}