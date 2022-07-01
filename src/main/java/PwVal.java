public class PwVal {

    public static void main(String[] args) {

        String pw = "Beispiel1";

        boolean correctPw = passwordVal(pw);
        System.out.println("Das Password ist : " + correctPw);

        boolean correctLength = checkLength(pw);
        System.out.println("Die Länge des PW ist :" + correctLength);

        boolean checkNumber = checkDigits(pw);
        System.out.println("Das Passwort enthält Nummern ist : " +checkNumber);

    }

    public static boolean passwordVal(String pw){ // Check richtiges Password

        boolean pwCorrect;

        if(pw == "Beispiel"){
            pwCorrect = true;
        }
        else{
            pwCorrect = false;
        }
        return pwCorrect;

    }

    //Check PW länge

    public static boolean checkLength(String pw){

        boolean lengthCorrect;

        if(pw.length()>= 5){
            lengthCorrect = true;
        }
        else{
            lengthCorrect = false;
        }

        return lengthCorrect;
    }



    //Check zahlen
    public static boolean checkDigits(String pass) {
        char ch;
        boolean ok = false;
        for (int i = 0; i < pass.length() && !ok; i++) {
            ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                ok = true;
            }
        }
        return ok;
    }

    }


