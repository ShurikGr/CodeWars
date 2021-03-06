public class Welcome {
    /**
     * https://www.codewars.com/kata/577ff15ad648a14b780000e7
     */
    public static String greet(String language){
        String greet = "";
        switch (language) {
            case "english" :
                greet = "Welcome";
                break;
            case "czech":
                greet = "Vitejte";
                break;
            case "danish":
                greet = "Velkomst";
                break;
            case "dutch":
                greet = "Welkom";
                break;
            case "estonian":
                greet = "Tere tulemast";
                break;
            case "finnish":
                greet = "Tervetuloa";
                break;
            case "flemish":
                greet = "Welgekomen";
                break;
            case "french":
                greet = "Bienvenue";
                break;
            case "german":
                greet = "Willkommen";
                break;
            case "irish":
                greet = "Failte";
                break;
            case "italian":
                greet = "Benvenuto";
                break;
            case "latvian":
                greet = "Gaidits";
                break;
            case "lithuanian":
                greet = "Laukiamas";
                break;
            case "polish":
                greet = "Witamy";
                break;
            case "spanish":
                greet = "Bienvenido";
                break;
            case "swedish":
                greet = "Valkommen";
                break;
            case "welsh":
                greet = "Croeso";
                break;
            default:
                greet = "Welcome";
                break;


        }
        return greet;
    }
}