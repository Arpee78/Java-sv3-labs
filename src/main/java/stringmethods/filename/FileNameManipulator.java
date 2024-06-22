package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        return str.charAt(str.trim().length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.substring(fileName.indexOf("."));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        String fileNameExt = fileName.substring(fileName.indexOf(".") + 1);
        return fileNameExt.equals(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        String fileName1 = searchedFileName.substring(0, searchedFileName.indexOf("."));
        String fileName2 = actualFileName.substring(0, actualFileName.indexOf("."));
        return fileName1.equals(fileName2);
    }

    public String changeExtensionToLowerCase(String fileName) {
        String fileNameWOext = fileName.substring(0, fileName.indexOf("."));
        String ext = fileName.substring(fileName.indexOf(".")).toLowerCase();
        return fileNameWOext + ext;
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replace(present, target);
    }


}
