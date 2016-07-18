import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by ashwani arora on 7/17/2016.
 */
public class FileComparator {

    public static void main(String[] args) {
         final String directory ="D:\\study\\resumes\\Others\\From Indeed";
        File fileDirectory = new File(directory);


        File[] files = fileDirectory.listFiles();
        for (File file: files)
        {
            System.out.println(file.getName());
        }

        System.out.println("+++++ After Sorting++++");

        Collections.sort(Arrays.asList(files), new Comparator<Object>() {

            public int compare(Object o1, Object o2) {
                return ((File)o1).lastModified()< ((File)o2).lastModified() ?-1:
                        ((File)o1).lastModified()>((File)o2).lastModified() ? 1:0
                        ;
            }
        });

        for (File file: files)
        {
            System.out.println(file.getName());
        }

    }
}
