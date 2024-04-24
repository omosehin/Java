package Date;

public class Date {
    
    public int _month;
    public int _day;
    public int _year;

    public Date(int month,int day, int year) {

        _month = month;
        _day = day;
        _year = year;
    }

    public void setDay(int day){
        _day = day;
      }

      public int getDay(){
        return _day;
      }

      public void setMonth(int month){
        _month = month;
      }

      public int getMonth(){
        return _month;
      }

      public void setYear(int year){
        _year = year;
      }

      public int getYear(){
        return _year;
      }

      public void DisplayDate(){
        System.out.printf("day = %d / month = %d / year = %d",_day,_month,_year);
      }
}
