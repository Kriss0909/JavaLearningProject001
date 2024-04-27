package md.tekwillacademy.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        int dayNumber = 7;
        String nameOfTheDay;

        switch (dayNumber) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                nameOfTheDay = "Marti";
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Simbata");
                break;
            case 7:
                System.out.println("Duminica");
                break;
            default:
                System.out.println("Zi inexistenta");
        }
    }
}
