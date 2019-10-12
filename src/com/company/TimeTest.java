public class TimeTest {

    public static void main(String args[]){

        String str="06:40:03AM";
        String hour="";
        String minute="";
        String second="";
        String period="";
        String arr[] = str.split(":");
        hour=arr[0];
        minute=arr[1];
        String regex = "((?<=[0-9])(?=[a-zA-Z]))";
        String timePeriod[]= arr[2].split(regex);
        second=timePeriod[0];
        period=timePeriod[1];


        int hourNum=Integer.parseInt(hour);
        //int minuteNum=Integer.parseInt(hour);
        //int secondNum=Integer.parseInt(second);
        String twentyFourHourTime="";

        if(hourNum==12 && period.equalsIgnoreCase("AM")){
            twentyFourHourTime="00:"+minute+":"+second;
        }
        else if(hourNum!=12 && period.equalsIgnoreCase("AM"))
        {
            twentyFourHourTime=hourNum+":"+minute+":"+second;

        }
        else if(hourNum==12 && period.equalsIgnoreCase("PM"))
        {
            twentyFourHourTime=hourNum+":"+minute+":"+second;

        }

        else if(hourNum!=12 && period.equalsIgnoreCase("PM"))
        {
            twentyFourHourTime=(hourNum+12)+":"+minute+":"+second;

        }

        System.out.println(" twentyFourHourTime ======>>>>>  "+twentyFourHourTime);

    }

}