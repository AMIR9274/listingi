import java.io.*;

public class Readinput {
    String cmd = null;
    Process proc = null;
    InputStream input= null;

    BufferedReader in= null;

    public Readinput(String cmd) throws IOException {
        this.cmd = cmd;

        try {
            proc = Runtime.getRuntime().exec(cmd);
            input= proc.getinputStream();
            in= new BufferedReader(new InputStreamReader(input));
        } catch (IOException ioe) { throw ioe;
        }
        public String readLine() throws IOException {
            String line = in.readLine();
            while ((line== "\r") | {line=="")){
                line= in.readLine();
            }
            return line;

            public void close() {
                try { in.close(); input.close(); proc.destroy();
                } catch (IOException ioe) { ioe.printStackTrace();
                } finally { in= null; input= null; proc = null;
                }
            }

            public static void main(String[] args) { String cmd = null;
                Readinput ri = null;
                if (args.length > 0) {
                    cmd = args[O];
                } else {
                    cmd = "ping localhost";
                }

                try {

                    ri = new Readinput(cmd);
                    String line= null;
                    while ((line= ri.readLine()) 1= null)
                    if (line != "\r")
                    { System.out.println("java:>" +line);}

                } catch (IOException ioe) {
                    ioe.printStackTrace();

                } finally { ri.close(); ri = null;
                }

            }

        }