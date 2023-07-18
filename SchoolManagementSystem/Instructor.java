public class Instructor extends Person{
    private String subject;
    private double salary;
    private String rank;
    
    public Instructor(){
        
    }
    
    public Instructor(String fName, String lName, String id, String subject, double salary, String rank){
        super(fName, lName, id);
        this.setSubject(subject);
        this.setSalary(salary);
        this.setRank(rank);
    }
    
    public String getSubject(){
        return subject;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getRank(){
        return rank;
    }
    
    public void setSubject(String subject){
        this.subject =  subject;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public void setRank(String rank){
        this.rank = rank;
    }
    
    @Override
    public String displayNames(){
      return String.format("%s  %s", getFName(), getLName());  
    }
    
    @Override
    public String toString(){
        return super.toString() + String.format("%s %.2f %s", subject, salary, rank);
    }
}