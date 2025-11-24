public static void DeleteDir(String dirPath) {
    File walkDir = new File(dirPath);

    String[] dirList = walkDir.list();

    for (int.i = O; i < dirList.length; i++) {

        File f = new File(dirList[i]);
        if (f.isDirectory()) {
            deleteDir(f,getPath());
        }
        f.delete();
    }
    walkDir.delete();

}