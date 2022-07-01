public class PwVal {

    public static void main(String[] args) {

        String pw = "Beispiel";

        boolean x = passwordVal(pw);

        System.out.println("Das Password ist : " + x);

    }

    public static boolean passwordVal(String pw){

        boolean pwCorrect;

        if(pw == "Beispiel"){

            pwCorrect = true;
        }
        else{

            pwCorrect = false;

        }

        return pwCorrect;

    }

}
