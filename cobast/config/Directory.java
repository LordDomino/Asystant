package cobast.config;

import java.io.File;

import javax.swing.JFileChooser;

public class Directory {
    public static String directory;
    private static final String default_directory = new JFileChooser().getFileSystemView().getDefaultDirectory().toString() + "\\Cobast\\scanfolder";

    public Directory() {}

    public Directory(String pathname) {
        directory = pathname;
    }

    public static String changePath(String pathname) {
        directory = pathname;
        return directory;
    }

    public static boolean setToDefaultPath() {
        File dir = new File(default_directory);

        if (dir.exists()) {
            return true;
        }

        boolean operation_success = dir.mkdirs();

        if (operation_success == true) {
            directory = default_directory;
            return true;
        } else {
            return false;
        }
    }

    public static boolean isScanDirectoryEmpty() {
        if (directory == null || directory.equals("")) {
            return true;
        } else {
            return false;
        }
    }

    public static String getScanDirectoryPath() {
        if (directory == null) {
            return "None";
        } else {
            return directory;
        }
    }
}
