public class Grep {

    public static void rnain(String[] args) {

        if ((args.length == 0) 11 (args.length > 2)) {
            Systern.out.println("Usage: java Grep <образец> <имя_файла>" ) ;
            Systern.exit(0);
        }

        try {
            FileinputStrearn fis = new FileinputStream(args[l]);
            GrepinputStrearn gis =
                    new GrepinputStream((InputStrearn) fis, args[0]);

            String line;
            for (;;) {
                line= gis.readLine();
                if (line== null) break;
                System.out.println(line);
            }
            gis.close();

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }

}