package md.dimatanasciuc.operationsandciclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {
        // Enter the day name and write in the console day number
        String nameOfTheDay = "VinerI";

        int numberOfTheDay;

        switch (nameOfTheDay.toUpperCase()) {
            case "LUNI":
                numberOfTheDay = 1;
                System.out.println("A case has been found");
                break;
            case "MARTI":
                numberOfTheDay = 2;
                System.out.println("A case has been found");
                break;
            case "MIERCURI":
                numberOfTheDay = 3;
                System.out.println("A case has been found");
                break;
            case "JOI":
                numberOfTheDay = 4;
                System.out.println("A case has been found");
                break;
            case "VINERI":
                numberOfTheDay = 5;
                System.out.println("A case has been found");
                break;
            case "SIMBATA":
                numberOfTheDay = 6;
                System.out.println("A case has been found");
                break;
            case "DUMINICA":
                numberOfTheDay = 7;
                System.out.println("A case has been found");
                break;
            default:
                numberOfTheDay = 8;
                System.out.println("There is not such a day defined in your program");
        }
        System.out.println(numberOfTheDay);


    }
}
