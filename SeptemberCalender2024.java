import java.util.Arrays;
public class JanurayCalender2024 {
    public static void main(String args[]){
        int daysInMonth =  30;
        int startDay = 0;
        String[][] calendar = new String[6][7];
        for(String[] week: calendar){
            Arrays.fill(week," ");
        }
        int day = 1;
        for(int i = 0; i<calendar.length; i++){
            for(int j=0;j <7;j++){
                if(i==0 && j<startDay){
                    continue;
                }
                if(day<=daysInMonth){
                    calendar[i][j]=String.valueOf(day);
                    day++;
                }
            }
        }
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        for(String[] week : calendar){
            for(String dayStr : week){
                System.out.printf("%3s ", dayStr);
            }
            System.out.println();
        }
    }
    
}
