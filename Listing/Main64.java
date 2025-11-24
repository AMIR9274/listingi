import java.io*;
import javax.xml.parses.*;
import java.io.*;
import org.w3c.dom.*;

class DomPrint {

    private static void printindentation(int level) {
        for (inti= O; i < level; i ++) {
            System.out.print("	");
        }

        private static void print(Node node, int level) {

            System.out.println("");
            printindentation(level);
        }
        System.out.println(node.getNodeName().toString() + ":");

        NamedNodeMap attributes= node.getAttributes();

        if (attributes.getLength() > 0) {
            for (inti= 0; i < attributes.getLength(); i++) {
                Node attribute= attributes.item(i);
                printindentation(level);
                Strings="."+ attribute.getNodeName() + "=";
                System.out.println(s + attribute.getNodeValue());
            }
            level--;
        }
    }

    String value= node.getNodeValue();
    value= (value== null ?	"" value.trim());
if (value.length() > 0)	{
        printindentation(level);
        System.out.println(value);
    }

if (node.hasChildNodes()) {
        level++;
        NodeList children= node.getChildNodes();
        for (inti= 0; i < children.getLength(); i ++) {
            Node child= children.item(i);
            print(child, level);
        }
    }
}

File docFile = new File(args[O]); try {
DocumentBuilderFactory factory= DocumentBuilderFactory.newinstance();
factory.setignoringComments(true);

DocumentBuilder builder= factory.newDocumentBuilder();

Document doc= builder.parse(docFile);

print(doc.getDocumentElement(), O);
        } catch(Exception ex) { System.out.println(ex);
}
        }
        }