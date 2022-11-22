
package test;
/*@author usuario-mañana*/
public class Test {

    /*@param args the command line arguments*/
    public static void main(String[] args) {
        String nombreSO = "os.name";
        String versionSO = "os.version";
        String arquitecturaSO = "os.arch";
        String file_separator = "file.separator";
        String java_class_path= "java.class.path";
        String java_home = "java.home";
        String java_vendor = "java.vendor";
        String java_vendor_url = "java.vendor.url";
        String java_version = "java.version";
        String line_separator = "line.separator";
        String path_separator = "path.separator";
        String user_dir = "user.dir";
        String user_home = "user.home";
        String user_name = "user.name";
        
        System.out.println("\nInformación sobre el SO:");
        System.out.println("\nNombre del SO: "+ System.getProperty(nombreSO));
        System.out.println("Versión del SO: " + System.getProperty(versionSO));
        System.out.println("Arquitectura del SO: "+System.getProperty(arquitecturaSO));
        System.out.println("File separator: "+System.getProperty(file_separator));
        System.out.println("Java class path: "+System.getProperty(java_class_path));
        System.out.println("Java home: "+System.getProperty(java_home));
        System.out.println("Java vendor: "+System.getProperty(java_vendor));
        System.out.println("Java vendor url: "+System.getProperty(java_vendor_url));
        System.out.println("Java versión: "+System.getProperty(java_version));
        System.out.println("Line separator: "+System.getProperty(line_separator));
        System.out.println("Path separator: "+System.getProperty(path_separator));
        System.out.println("User dir: "+System.getProperty(user_dir));
        System.out.println("User home: "+System.getProperty(user_home));
        System.out.println("User name: "+System.getProperty(user_name));
        
    }//main    
}//class
