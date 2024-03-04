public class R06_MET03_J {
    public void readSensitiveFile() {
        try {
            SecurityManager sm = System.getSecurityManager();
            if (sm != null) {  // Check for permission to read file
              sm.checkRead("/temp/tempFile");
            }
            // Access the file
            } catch (SecurityException se) {
            // Log exception
            }
            // Access the file
    }
}
