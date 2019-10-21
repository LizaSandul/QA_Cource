public class Ticket {
        int id;
        String  question ;

        public Ticket(int id, String question){
            this.id=id;
            this.question=question;
        }

       String getQuestion() {
        return question;
    }
}
