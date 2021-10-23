public class Bottles99 {

    // Напишите метод, который распечатает песню “99 Bottles of Beer” точно в таком виде,
    // в каком песня написана на странице http://www.99-bottles-of-beer.net/lyrics.html

//99 bottles of beer on the wall, 99 bottles of beer.
//Take one down and pass it around, 98 bottles of beer on the wall.

    //No more bottles of beer on the wall, no more bottles of beer.
    //Go to the store and buy some more, 99 bottles of beer on the wall.

    public static String buildNewString (String string, int index, char letter){
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (i != index && string.charAt(i) != letter){
                result += string.charAt(i);
            }
        }

        return result;
    }

    public static String print99Bottles() {
        String song = "";
        String bottles = " bottles of beer";
        String bottle = buildNewString(bottles,7,'s');
        String noMore = "No more";
        String lastLane = "Go to the store and buy some more";
        String string = "Take one down and pass it around";
        String onWall = " on the wall";
        String commaSpace = ", ";
        String dot = ".";

//        for (int i = 0; i < bottles.length(); i++) {
//            if(bottles.charAt(i) == 's'){
//                System.out.println(i);
//            }
//        }
//
//        String newResult = "";
//        for (int i = 0; i < bottles.length(); i++) {
//            if(i != 7){
//                newResult =newResult + bottles.charAt(i);
//            }
//        }
//        for (int i = 0; i < bottles.length(); i++) {
//            if(bottles.charAt(i) != 's'){
//                newResult =newResult + bottles.charAt(i);
//            }
//        }
//        String result = "";
//
//        for (int i = 0; i < bottles.length(); i++) {
//            result += bottle.charAt(i);
//            if (i == 6) {
//                result += 's';
//            }


            for (int i = 99; i >= 0; i--) {
                if (i == 2) {
                    song += i + bottles + onWall + commaSpace + i + bottles + dot + "\n" +
                            string + commaSpace + (i - 1) + bottle+ onWall + dot + "\n\n";
                } else if (i == 1) {
                    song += i + bottle + onWall + commaSpace + i + bottle + dot + "\n" +
                            string + commaSpace + noMore.toLowerCase() + bottles + onWall + dot + "\n\n";
                } else if (i == 0) {
                    song += noMore + bottles + onWall + commaSpace + noMore.toLowerCase() + bottles + dot + "\n" +
                            lastLane + commaSpace + 99 + bottles + onWall + dot;
                } else {
                    song += i + bottles + onWall + commaSpace + i + bottles + dot + "\n" +
                            string + commaSpace + (i - 1) + bottles + onWall + dot + "\n\n";
                }
            }
        return song;
    }
}
