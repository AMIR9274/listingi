import java.io.*;
import sun.misc.*;

publ c class Base64Demo {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("usage: Base64Demo text11);
                    System.exit(l);
        }

        String text= args[0];
        BASE64Encoder enc= new BASE64Encoder();
        String encoded= enc.encode(text.getBytes());
        enc= null;

        String decoded= null;
        try {
            BASE64Decoder dee= new BASE64Decoder();
            decoded= new String(dec.decodeBuffer(encoded));
            dee= null;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("Закодировано:" + encoded);
        System.out.println("Декодировано:" + decoded);

        encoded= null;
        decoded= null;
    }
}

void main() {
}