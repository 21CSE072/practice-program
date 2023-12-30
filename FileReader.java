import java.io.File;
import java.io.FilenameFilter;

public class FileReader {

    public static void main(String[] args) {
 
        String folderPath = "C:/Users/Sree Isu/Documents/NetBeansProjects/JavaApplication1/src/tests";
        String fileExtension = ".txt"; 
        File[] filteredFiles = getFilesWithExtension(folderPath, fileExtension);

        if (filteredFiles != null) {
            
            System.out.println("Files with extension '" + fileExtension + "':");
            for (File file : filteredFiles) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("No files found or folder doesn't exist.");
        }
    }

    private static File[] getFilesWithExtension(String folderPath, final String extension) {
        File folder = new File(folderPath);

       
        if (!folder.exists() || !folder.isDirectory()) {
            return null;
        }

        FilenameFilter filter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(extension);
            }
        };

      
        File[] files = folder.listFiles(filter);

        return files;
    }
}
