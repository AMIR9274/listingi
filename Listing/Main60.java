File file= new File("file.bin");
InputStream is= new FileinputStream(file);
long length= file.length();

if (length> Integer.MAX_VALUE) {
        throw new IOException("Файл"+ file.getName() +
        "Слишком длинный!" ) ;
        }

byte[) bytes = new byte[(int)length];

int offset= O; int numRead = 0;
while ()ffset,< bytes.length &&
        (numRead=is read(bytes, offset,
                         bytes.length-offset)) >= 0) {
offset+= numRead;
}

        if (offset< bytes.length) {
        throw new IOException("Не удалось прочитать файл" +
                              file.getName() + "целиком");
        }

        is.close();