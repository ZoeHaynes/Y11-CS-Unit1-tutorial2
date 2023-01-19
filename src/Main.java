public class Main {
    public static void main(String[] args) {
        //1
        String myFavoriteArtist = "Taylor Swift";
        //2
        System.out.println(myFavoriteArtist);
        //3
        int myFavoriteArtistLength = myFavoriteArtist.length();
        //4
        System.out.println(myFavoriteArtistLength);
        //5
        String myFavoriteArtistUpper = myFavoriteArtist.toUpperCase();
        //6
        System.out.println(myFavoriteArtistUpper);
        //7
        String myFavoriteArtistLower = myFavoriteArtist.toLowerCase();
        //8
        System.out.println(myFavoriteArtistLower);
        //9
        String checkFor = "ift";
        //10
        boolean myFavoriteArtistContains = myFavoriteArtist.contains(checkFor);
        //11
        System.out.println(myFavoriteArtistContains);
        //12
        String firstName = "Zoe";
        //13
        String lastName = "Haynes";
        //14
        String age = "15";
        //15
        String myInfo;
        //16
        myInfo = ("First Name: "+ firstName +"\nLast Name: "+ lastName +"\nAge: "+ age +"\nFavorite Artist: "+ myFavoriteArtist);
        //17
        System.out.println(myInfo);
        //18
        String stringToIntTest = "16";
        //19
        int stringToIntTestStore = Integer.parseInt(stringToIntTest);
        //20
        String intToStringTest = "" + stringToIntTestStore;

    }
}