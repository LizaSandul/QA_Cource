public class Result {

    String name;
    String lastName;
    int ticket;
    String ticketName;
    int result;

    public Result( String name,String lastName, int ticket, String ticketName, int result) {
        this.name = name;
        this.lastName = lastName;
        this.ticket = ticket;
        this.ticketName = ticketName;
        this.result = result;
    }

    String getName() {
        return name;
    }

    String getLastName() {
        return lastName;
    }

    int getTicket() {
        return ticket;
    }

    String  getTicketName() {
        return ticketName;
    }
    int getMark() {
        return result;
    }

}
