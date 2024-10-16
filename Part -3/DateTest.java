class Date{

    private int month;
    private int day;
    private int year;
    
    Date(){
    
    }
    Date(int month, int day,int year){
    this.month=month;
    this.day=day;
    this.year=year;
    }
    public int getmonth() {
    return month;
    }
    
    public void setmonth(int month) {
    this.month = month;
    }
    
    public int getday() {
    return day;
    }
    
    public void setday(int day) {
    this.day = day;
    }
    public int getyear() {
    return year;
    }
    
    public void setyear(int year) {
    this.year = year;
    }
    void  displaydata(){
    if(this.month>12 ){
    System.out.println("Invalid month");
    }
    else if(this.month==1 || (this.month>=3 && this.month<=12)){
    System.out.println(this.month+"/"+this.day+"/"+this.year);
    }
    else{
    
    if((this.day==28 && this.year%4==0 && this.month==2)  || (this.day>29 && this.month==2))
    System.out.println(this.month+"/"+this.day+"/"+this.year);
    
    }
    
    }
    }
    
    public class DateTest{
    
    public static void main(String[] args) {
    
    
    Date d1=new Date(12,12,2024);
    d1.displaydata();
    }
    }
    
    