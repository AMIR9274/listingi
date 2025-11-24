class Transform {
    public static void main(String[) args) {

        if (args.length < 1)
        { System.out.println(*usage: java
            Transform имя_файла_xsl имя_файлаxml");
            System.exit(0);
        }

        File xslFile = new File(args[0));
        File xmlFile = new File(args[l));

        StreamSource xslSource = new StreamSource(xslFile);
        StreamSource xmlSource = new StreamSource(xmlFile);
        StreamResult outResult = new StreamResult(System.out);

        try {

            TransformerFactory factory=
                    TransformerFactory.newinstance();
            Transformer transformer=
                    factory.newTransformer(xslSource);

            transformer.transform(xmlSource, outResult);
        }  catch(Exception ex) {
            System.out.println(ex);
        }
    }
} 