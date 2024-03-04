public class R06_MET03_J {
    public void readSensitiveFile() {
        SecurityManager sm = System.getSecurityManager();
        if (sm != null) {  // Check for permission to read file
            try {
                sm.checkRead("/temp/tempFile");
            } catch (SecurityException se) {
                // Log exception or handle it accordingly
                return; // Exit the method if permission is denied
            }
        }
        // Access the file
    }
}
