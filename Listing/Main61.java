class GrepinputStream extends FilterinputStream {

    String substring= null;
    BufferedReader br;

    public GrepinputStream(InputStream in, String substring)
    {
        super(in);

        this.br = new BufferedReader(new
                InputStrearnReader(in));
        this.substring= substring;
    }

    public final String readLine() throws IOException {
        String line;

        do {
            line = br.readLine();
     ) while ((line != null) && line.indexOf(substring) == -1);
        }
    }