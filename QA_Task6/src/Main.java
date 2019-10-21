import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Student> students = new ArrayList<Student>();
        ArrayList<Result> results = new ArrayList<Result>();
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();

        students.add(new Student("Liza", "Kot"));
        students.add(new Student("Dima", "Krot"));
        students.add(new Student("Ann", "Lisa"));
        students.add(new Student("Kate", "Dog"));
        students.add(new Student("Tim", "Mouse"));

        tickets.add(new Ticket(1, "English"));
        tickets.add(new Ticket(2, "Math"));
        tickets.add(new Ticket(3, "Phisics"));
        tickets.add(new Ticket(4, "Russian"));
        tickets.add(new Ticket(5, "Biology"));
        tickets.add(new Ticket(6, "Chemistry"));
        tickets.add(new Ticket(7, "Geo"));
        tickets.add(new Ticket(8, "Astronomy"));
        tickets.add(new Ticket(8, "Geometry"));
        tickets.add(new Ticket(510, "History"));

        for (int i = 0; i < 5; i++) {
            int mark = random.nextInt( 5 - 1)+1;
            int numberTicket = random.nextInt( 5 - 1)+1;
            results.add(new Result(students.get(i).getName(), students.get(i).getLastName(), tickets.get(numberTicket).id, tickets.get(numberTicket).getQuestion(),  mark));
            System.out.println(results.get(i).getName() + " " + results.get(i).getLastName() +" has ticket number" + results.get(i).getTicket() + " "+ results.get(i).getTicketName()+ ". And his mark = " + results.get(i).getMark());
        }
        int SumMarks = 0;
        for (int i = 0; i < results.size(); i++) {
            SumMarks = SumMarks + results.get(i).getMark();
        }

        double AverageMark = SumMarks/5;
        System.out.println("Average mark = " + AverageMark);

    }
}




