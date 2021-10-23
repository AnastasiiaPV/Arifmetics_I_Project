public class Bottles {

    // Напишите метод, который распечатает песню “99 Bottles of Beer” точно в таком виде,
    // в каком песня написана на странице http://www.99-bottles-of-beer.net/lyrics.html


//99 bottles of beer on the wall, 99 bottles of beer.
//Take one down and pass it around, 98 bottles of beer on the wall.

    //No more bottles of beer on the wall, no more bottles of beer.
    //Go to the store and buy some more, 99 bottles of beer on the wall.

    public static String print99Bottles(){
        String song = "";
        for (int i = 99; i > 0; i--) {
            song += i + " bottles of beer on the wall, " + i +" bottles of beer.\n" +
                    "Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.\n\n";
        }
        song += "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";

        return song;
    }
}
