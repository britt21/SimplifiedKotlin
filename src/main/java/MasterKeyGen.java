public class MasterKeyGen {
    static String RightPad(String appendedclearpin, int cardlenght, String cardpan) {

        var appendedpin = String.valueOf("0"+ appendedclearpin.length() + appendedclearpin);

        System.out.println("SHORTPINddd " + appendedpin.length());

        var shortpin = cardlenght - appendedpin.length();

//        System.out.print("SHORTPIN " + shortpin);
//        var apin = cardlenght - Integer.parseInt(appendedclearpin);
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


    public static String xorHex(String a, String b) {
        char[] chars = new char[a.length()];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = toHex(fromHex(a.charAt(i)) ^ fromHex(b.charAt(i)));
        }
        return new String(chars).toUpperCase();
    }

    public static int fromHex(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        } else if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        } else if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static char toHex(int nybble) {
        if (nybble < 0 || nybble > 15) {
            throw new IllegalArgumentException();
        }
        return "0123456789ABCDEF".charAt(nybble);
    }


    public static void main(String[] args) {
        var rightpad = RightPad("2143",19,"5199111215194619");
        var leftpad = LeftPad("0",4,"5199111215194619");
        System.out.println("LEFTPAD    " + leftpad);
        System.out.println("RIGHTPAD    " + rightpad);

        var dexor = xorHex(rightpad, leftpad);

        System.out.println(""+ dexor);

    }

};

