public class MasterKeyGen {
    static String RightPad(String appendedclearpin, int cardlenght, String cardpan) {

        var appendedpin = String.valueOf("0"+ appendedclearpin.length() + appendedclearpin);

        System.out.println("SHORTPINddd " + appendedpin.length());

        var shortpin = cardpan.length() - appendedpin.length();

//        System.out.print("SHORTPIN " + shortpin);
        var apin = cardlenght - Integer.parseInt(appendedclearpin);
        StringBuilder neweffs = new StringBuilder();
        for (int i = 0; i < shortpin; i++) {
            neweffs.append("F");
        }
        System.out.println("DFS " + neweffs);
        var rightpadpin = appendedpin + neweffs;
//        for (inputlen in )
//            s = str + padChar + (len - str.length());
        return rightpadpin;
    }

        static String LeftPad(String panAddedchar, int cardlenght, String cardpan) {

            StringBuilder addedcar = new StringBuilder();
            StringBuilder panAddedcharBuilder = new StringBuilder();

            for (var i = 0; i < cardlenght; i++){

                panAddedcharBuilder.append(panAddedchar);

            }

         var  leftpad = panAddedcharBuilder +    Master_SubStringKt.extractPanAccountNumberPart(cardpan);
            System.out.println("KAYGAN "  + leftpad);
            return leftpad;
    }




    public static void main(String[] args) {
        var rightpad = RightPad("2212",16,"4654887777887766");
        var leftpad = LeftPad("0",4,"5061191608212220947");
        System.out.println("LEFTPAD    " + leftpad);
        System.out.println("RIGHTPAD    " + rightpad);
    }




};

