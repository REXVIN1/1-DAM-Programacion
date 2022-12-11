


package examen;
//import java.util.Scanner;
import java.text.NumberFormat;
import java.util.StringTokenizer;
import java.util.Random;
//import java.awt.Desktop;
import java.io.File;
//import java.util.Properties;
import java.net.InetAddress;
import java.io.IOException;
//import java.io.OutputStream;
//import java.io.InputStream;
//import java.io.FileInputStream;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.Duration;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.Writer;
//import java.io.FileWriter;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.TreeMap;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

/*@author Kevin Gómez Valderas<kgomval118@g.educaand.es>*/

public class Examen {

    /*@param args the command line arguments*/
    
    public static void main(String[] args){
        
        //STRINGS (default)
        
        System.out.println("STRINGS--------------------------------------");
        String s1 = "    Hola Que Tal   ",s2 = "    hola que tal   ";
        
        System.out.println("Strings:");
        s1 = s1.replaceAll("\\s+", "");
        s2 = s2.replaceAll("\\s+", "");
        
        System.out.println(s1+"\n"+s2);
        
        boolean b1 = s1.equalsIgnoreCase(s2),b2 = s1.equals(s2);
        System.out.println("\nCoincide con mayúsculas: "+b2);
        System.out.println("Coincide sin mayúsculas: "+b1);
        
        System.out.println("\nPosición en 0: "+s1.charAt(0));
        System.out.println("Posición en 0: "+s2.charAt(0));
        
        System.out.println("\nSin espacios al principio y al final: "+s1.trim());
        System.out.println("Sin espacios al principio y al final: "+s2.trim());
        
        System.out.println("\nEn mayúsculas: "+s1.toUpperCase());
        System.out.println("En minúsculas: "+s1.toLowerCase());
        
        System.out.println("\nSufijo: "+s1.endsWith("Tal"));
        System.out.println("Prefijo: "+s1.startsWith("Hola"));
        
        System.out.println("\nPosición de 'Que': "+s1.indexOf("Que"));
        System.out.println("Posición de 'Que': "+s1.lastIndexOf("Que")); 
        System.out.println("Extraer a partir de 5: "+s1.substring(5));
        System.out.println("Extraer a partir de 5 y 7: "+s1.substring(5, 7));
        
        //SCANNER (java.util)
        
        /*
        System.out.println("SCANNER:");
        String t = new Scanner(System.in).nextLine();
        int i = new Scanner(System.in).nextInt();
        long l = new Scanner(System.in).nextLong();
        double d = new Scanner(System.in).nextDouble();
        Falta close
        */
            
        //THREAD (default)
        
        try{
            System.out.println("\nThread--------------------------------------");
            Thread.sleep(1000);
            System.out.println("1 Segundo");
        }catch(InterruptedException e1){
            System.out.println("Error: "+e1.getMessage());
        }
        
        //MATH (default/java.math)
        
        System.out.println("\nMATH--------------------------------------");
        int a = 5,b = 6;
        
        double operacion = Math.pow(a, b);
        System.out.println("A elevado a B: "+operacion);
        
        operacion = Math.sqrt(a);
        System.out.println("Raiz de A: "+operacion);
        
        operacion = Math.abs(a);
        System.out.println("Valor absoluto de A: "+operacion);
        
        operacion = Math.exp(a);
        System.out.println("Expnencial e^x de A: "+operacion);
        
        operacion = Math.log(a);
        System.out.println("Logaritmo de A: "+operacion);
        
        operacion = Math.log10(a);
        System.out.println("Logaritmo 10 de A: "+operacion);
        
        operacion = Math.sin(a);
        System.out.println("Sin de A: "+operacion);
        
        operacion = Math.cos(a);
        System.out.println("Coseno de A: "+operacion);
        
        operacion = Math.tan(a);
        System.out.println("Tangente de A: "+operacion);
        
        operacion = Math.max(a, b);
        System.out.println("Número maximo entre A y B: "+operacion);
        
        operacion = Math.min(a, b);
        System.out.println("Número mínimo de A: "+operacion);
        
        operacion = Math.random();
        System.out.println("Número random de A: "+operacion);
        
        operacion = a+(b-a)*Math.random();
        System.out.println("Número random entre A y B: "+operacion);
        
        operacion = Math.toRadians(a);
        System.out.println("A a radianes: "+operacion);
        
        operacion = Math.toDegrees(a);
        System.out.println("A a grados: "+operacion);
        
        operacion = Math.round(operacion);
        System.out.println("A a radianes: "+operacion);
        
        //NUMBERFORMAT (java.text)
        
        System.out.println("\nNUMBERFORMAT--------------------------------------");               
        int c = 9;
        long d = 601479874;
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(6);
        nf.setMinimumFractionDigits(3);      
        System.out.println("Int a String: "+nf.format(c));
        System.out.println("Long a String: "+nf.format(d));
        
        //RUNTIME (default)
        
        System.out.println("\nRUNTIME--------------------------------------");
        Runtime rt = Runtime.getRuntime();
        int procesadores = rt.availableProcessors();
        long mlibre = rt.freeMemory(), mtotal = rt.totalMemory();
        System.out.println("Procesadores: "+procesadores+"\n"
                + "Memoria libre: "+mlibre+"\n"
                        + "Memoria total: "+mtotal);
        
        //CLASE ENVOLTORIO (WRAPPERS/Integer) (default)
        
        System.out.println("\nCLASE ENVOLTORIO (WRAPPERS)--------------------------------------");
        System.out.println("Número a binario: "+Integer.toBinaryString(1233));
        System.out.println("Número a Hexadecimal: "+Integer.toHexString(1233));
        System.out.println("Número a string: "+Integer.toString(1233));
        System.out.println("Número a binario: "+Integer.parseInt("1233"));
        Double y = 20.56;
        Float f = 456f;
        System.out.println("Paso de double a int: "+y.intValue());
        System.out.println("Paso Float a int: "+f.intValue());
        
        //STRINGTOKENIZER (java.util)
        
        System.out.println("\nSTRINGTOKENIZER--------------------------------------");   
        String frase = "hola que tal como estas";
        StringTokenizer st = new StringTokenizer(frase," ");
        System.out.println("Frase desplegada:");
        while(st.hasMoreTokens()){     
            System.out.println(st.nextToken());
        }
        
        //RANDOM (java.util)
        
        System.out.println("\nRANDOM--------------------------------------");
        Random rm = new Random();
        System.out.println("Número random int: "+rm.nextInt());
        System.out.println("Número random double: "+rm.nextDouble());
        System.out.println("Número random boolean: "+rm.nextBoolean());
        System.out.println("Número random entre dos valores: ");
        System.out.println("Número random entre 50 y 100: "+rm.nextInt(50, 100));
        
        //STRINGBUILDER(java.util)
        
        System.out.println("\nSTRINGBUILDER--------------------------------------");
        
        String sb = "hola como estas todo bien";        
        System.out.println("Posicion en 5: "+sb.charAt(5));
        System.out.println("Primer encuentro de 'como': "+sb.indexOf("como"));
        System.out.println("Extraer entre valores 5 y 9: "+sb.substring(5,9));
        System.out.println("Longitud: "+sb.length());
        System.out.println("Quitar espacios: "+sb.replaceAll("\\s+", ""));
        System.out.println("Replace palabra por otra: "+sb.replace("estas", "hola"));
        System.out.println("Extraer String a StringBuilder: "+sb.subSequence(5, 9));
        
        StringBuilder sb2 = new StringBuilder("string builder");
        System.out.println("StringBuilder: "+sb2);
        System.out.println("Insertar string al final: "+sb2.append(" class"));
        System.out.println("Inserta string en posicion: "+sb2.insert(0, "metodo "));
        System.out.println("Borrar entre posicion 23 y 27: "+sb2.delete(23, 27));
        System.out.println("Borrar caracter en posicion: "+sb2.deleteCharAt(22));
        System.out.println("Cadena invertida: "+sb2.reverse());
        System.out.println("A string: "+sb2.toString());
        
        //System.out.println("Longitud establecida: "+sb2.setLength(1));
        
        //SYSTEM (default) REVISAR
        
        System.out.println("\nSYSTEM--------------------------------------");
        System.out.println("Separador de carpetas: "+System.getProperty("file.separator"));
        System.out.println("Carpeta donde está instalado java: "+System.getProperty("java.home"));
        System.out.println("Fabricante: "+System.getProperty("java.vendor"));
        System.out.println("Versión de java: "+System.getProperty("java.version"));
        System.out.println("Arquitectura del SO: "+System.getProperty("os.arch"));
        System.out.println("Nombre del SO: "+System.getProperty("os.name"));
        System.out.println("Version del SO: "+System.getProperty("os.version"));
        System.out.println("Directorio home: "+System.getProperty("user.home"));
        System.out.println("Nombre de usuario: "+System.getProperty("user.name"));        
        System.out.println("Tiempo Unix: "+System.currentTimeMillis());
        //System.exit(c);       REVISAR
        //System.gc();      REVISAR
        //System.out.println("GetEnv: "+System.getenv("so.name"));      REVISAR
        
        //DESKTOP (java.awt) REVISAR
        
        System.out.println("\nDESKTOP--------------------------------------");
        /*
        Desktop dp = Desktop.getDesktop();
        File file = new File("C:/Users/kevin/Desktop/hola.txt");
        try{
            dp.mail();
            dp.browse();
            dp.edit(file);
            dp.open(file);
        }catch(IOException e2){
            System.out.println(e2.getMessage());
        }
        */
        
        //PROPERTIES (java.util) REVISAR
        /*
        System.out.println("\nPROPERTIES--------------------------------------");
        Properties prop = new Properties();
        System.out.println("Setproperty: "+prop.setProperty("123", "bienvenido"));
        System.out.println("GetProperty; "+prop.getProperty("123"));
        System.out.println("Size: "+prop.size());
        System.out.println("Keys: "+prop.keys());
        System.out.println(""+prop.storeToXML(os, "flipa"));
        System.out.println(""+prop.loadFromXML(in));
        */
        
        //INETADDRESS (java.net)
        
        System.out.println("\nINETADDRESS--------------------------------------");
        
        try{
            InetAddress ia = InetAddress.getByName("8.8.8.8");
            System.out.println("Host Address: "+ia.getHostAddress());
            System.out.println("Host name: "+ia.getHostName());
            System.out.println("Reachable: "+ia.isReachable(1000));
        }catch(IOException e3){
            System.out.println("Error: "+e3.getMessage());
        }
        
        //FILE (java.io)
        
        System.out.println("\nFILE--------------------------------------");
        File file2 = new File("C:/Users/kevin/Desktop/nombre_archivo_1.txt");
        File file3 = new File("C:/Users/kevin/Desktop/nombre_archivo_2.txt");
        //File file4 = new File("C:/Users/kevin/Desktop/archivo.txt");
        
        System.out.println("Existe: "+file2.exists());
        System.out.println("Se puede leer: "+file2.canRead());
        System.out.println("Se puede ejecutar: "+file2.canExecute());
        System.out.println("URL del archivo: "+file2.getPath());
        System.out.println("Nombre del archivo: "+file2.getName());        
        System.out.println("Es un archivo: "+file2.isFile());
        System.out.println("Es una carpeta: "+file2.isDirectory());
        System.out.println("Longitud: "+file2.length());
        System.out.println("Cambia el nombre: "+file2.renameTo(file3));
        try{
            /*
            System.out.println("Se ha creado el archivo: "+file4.createNewFile());
            Thread.sleep(2000);
            System.out.println("Se ha eliminadoe l archivo: "+file4.delete());
            Thread.sleep(2000);
            System.out.println("Se ha creado una carpeta: "+file5.mkdirs());
            Thread.sleep(2000);
            System.out.println("Se ha borrado la carpeta: "+file5.delete());
            */
        }catch(Exception e4){
            System.out.println("Error: "+e4.getMessage());
        } 

        File file5 = new File("C:/Users/kevin/Desktop");            
        File[] lista = {};
        lista = file5.listFiles();
        int valor = 0,archivos=0,carpetas=0;
        
        System.out.println("\nARCHIVOS Y CARPETAS");
        System.out.println("ARCHIVOS-----------------------------");
        while(valor<lista.length){
            if(lista[valor].isFile()){
                archivos++;
                System.out.println("Archivo "+(archivos)+": "+lista[valor].getName());
                valor++;  
            }else{
                valor++;
            }      
        }
        valor = 0;
        System.out.println("\nCARPETAS-----------------------------");
        while(valor<lista.length){
            if(lista[valor].isDirectory()){
                carpetas++;
                System.out.println("Carpeta "+(carpetas)+": "+lista[valor].getName());
                valor++;  
            }else{
                valor++;
            }      
        }  
        
        //PRINTWRITER (java.io)
        
        System.out.println("\nPRINTWRITER--------------------------------------");
        try{
            PrintWriter pw = new PrintWriter("C:/Users/kevin/Desktop/archivo.txt");
            pw.println("texto1");
            pw.print("texto2");
            pw.close();
        }catch(IOException e7){
            System.out.println("Error: "+e7.getMessage());
        }
        
        //CLASSLOADER (default) REVISAR
        
        System.out.println("\nCLASSLOADER--------------------------------------");
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        System.out.println("Resource: "+cl.getResource("hola que tal"));
        System.out.println("Resource as stream: "+cl.getResourceAsStream("hola que tal"));
        //System.out.println(""+cl.getResources("hola"));
        //System.out.println(""+cl.loadClass("hola que tal"));
        
        //OUTPUTSTREAM (java.io) REVISAR
        
        System.out.println("\nOUTPUTSTREAM--------------------------------------");
        /*
        try{
            OutputStream ops = OutputStream.nullOutputStream();
            ops.write(b);
            ops.flush();
            ops.close();
            
        }catch(Exception e4){
            System.out.println("Error: "+e4.getMessage());
        }
        */
        
        //INPUTSTREAM (java.io) REVISAR
        
        System.out.println("\nINPUTSTREAM--------------------------------------");
        /*
        InputStream ips = InputStream.nullInputStream();
        try{
            ips.read();
            ips.markSupported();
            ips.mark(10);
            ips.reset();;
            ips.available();
            ips.skip(10);
            ips.close();
        }catch(Exception e5){
            System.out.println("Error: "+e5.getMessage());
        }
        */
        
        //FILEINPUTSTREAM (java.io) REVISAR
        
        System.out.println("\nFILEINPUTSTREAM--------------------------------------");
        /*
        try{
            FileInputStream fis = new FileInputStream("C:/Users/kevin/Desktop/nombre_archivo_2.txt");
            System.out.println("FileInputStream: "+fis);
        }catch(Exception e6){
            System.out.println("Error: "+e6.getMessage());
        }
        */
        
        
        //BUFFEREDREADER (java.io) REVISAR
        
        System.out.println("\nBUFFEREDREADER--------------------------------------");
        /*
        try{
            BufferedReader bf = new BufferedReader();
        }catch(Exception e8){
            System.out.println("Error: "+e8.getMessage());
        }
        */
        
        //WRITER (java.io) REVISAR
        
        /*
        System.out.println("\nWRITER--------------------------------------");
        Writer w = Writer.nullWriter();
        try{
            w.write("hola que tal");
            w.write(0x17);
            w.close();
        }catch(IOException e9){
            System.out.println("Error: "+e9.getMessage());
        }
        */
        
        //FILEWRITER (java.io) REVISAR
        
        System.out.println("\nFILEWRITER--------------------------------------");
        /*
        try{
            FileWriter file9 = new FileWriter("C:/Users/kevin/Desktop/archivo.txt");
            System.out.println("Archivo: "+file9);
        }catch(IOException e10){
            System.out.println("Error: "+e10.getMessage());
        }
        */
        
        //LOCALDATE (java.time)Indica la fecha
        
        System.out.println("\nLOCALDATE--------------------------------------");
        LocalDate fecha = LocalDate.now();
        System.out.println("Fecha de hoy: "+fecha);
        fecha = LocalDate.of(22, 12, 5);
        System.out.println("Fecha3 indicada: "+fecha);
        fecha = LocalDate.of(2022, Month.DECEMBER, 5);
        System.out.println("Fecha indicada con mes: "+fecha);
        System.out.println("Indica dia del mes: "+fecha.getDayOfMonth());
        System.out.println("Indica dia de la semana: "+fecha.getDayOfWeek());
        System.out.println("Indica dia del año: "+fecha.getDayOfYear());
        System.out.println("Indica el mes en numero: "+fecha.getMonthValue());
        System.out.println("Indica el mes en letra: "+fecha.getMonth());
        System.out.println("Indica año: "+fecha.getYear());
        System.out.println("Es bisisesto: "+fecha.isLeapYear()); 
        System.out.println("Es posterior a fecha2: "+fecha.isAfter(fecha));
        System.out.println("Es anterior a fecha2: "+fecha.isBefore(fecha));
        System.out.println("Formato de fecha: "+fecha.format(DateTimeFormatter.ISO_DATE));
        LocalDate fecha2 = LocalDate.parse("2022-12-05");//con -
        System.out.println("Fecha mediante string: "+fecha2);
        
        //LocalTime (java.time) Indica la hora
        
        System.out.println("\nLOCALTIME--------------------------------------");
        LocalTime hora = LocalTime.now();
        System.out.println("Hora actual: "+hora);
        hora = LocalTime.of(12, 00);
        System.out.println("Hora y minuto indicado"+hora);
        hora = LocalTime.of(12, 00, 00);
        System.out.println("Hora y minuto indicado"+hora);
        hora = LocalTime.of(12, 00, 00,00);
        System.out.println("Hora y minuto indicado"+hora);
        System.out.println("Indica hora: "+hora.getHour());
        System.out.println("Indica minuto: "+hora.getMinute());
        System.out.println("Indica segundo: "+hora.getSecond());
        System.out.println("Indica segundo: "+hora.getNano());
        LocalTime hora2 = LocalTime.of(13, 30, 20, 21);
        System.out.println("Es anterior a hora2: "+hora.isBefore(hora2));
        System.out.println("Es posterior a hora2: "+hora.isAfter(hora2));
        
        //LOCALDATETIME (java.time) Indica la fecha y la hora
        
        System.out.println("\nLOCALDATETIME--------------------------------------");
        LocalDateTime fecha_hora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: "+fecha_hora);
        fecha_hora = LocalDateTime.of(22, 12, 5, 12, 12, 21, 30);
        System.out.println("Fecha y hora indicada: "+fecha_hora);
        
        //DATETIMEFORMATTER (java.time) Establece el patron de fecha
        
        System.out.println("\nDATETIMEFORMATTER--------------------------------------");
        LocalDate fecha3 = LocalDate.now();
        System.out.println("Fecha 1: "+fecha3.format(DateTimeFormatter.ofPattern("y/d/M")));
        System.out.println("Fecha 2: "+fecha3.format(DateTimeFormatter.ofPattern("eeee/MMMM/yyyy")));
        
        //DAYOFWEEK (java.time) Dia de la semana con su numero correspondiente
        
        System.out.println("\nDAYOFWEEK--------------------------------------");
        System.out.println("Dia lunes: "+DayOfWeek.MONDAY.name());
        System.out.println("Numero correspondiente: "+DayOfWeek.MONDAY.getValue());
        System.out.println("Dia martes: "+DayOfWeek.TUESDAY.name());
        System.out.println("Numero correspondiente: "+DayOfWeek.TUESDAY.getValue());
        System.out.println("Dia miércoles: "+DayOfWeek.WEDNESDAY.name());   
        System.out.println("Numero correspondiente: "+DayOfWeek.WEDNESDAY.getValue());  
        System.out.println("Dia jueves: "+DayOfWeek.THURSDAY.name());
        System.out.println("Numero correspondiente: "+DayOfWeek.THURSDAY.getValue());
        System.out.println("Dia viernes: "+DayOfWeek.FRIDAY.name());
        System.out.println("Numero correspondiente: "+DayOfWeek.FRIDAY.getValue());
        System.out.println("Dia sábado: "+DayOfWeek.SATURDAY.name());
        System.out.println("Numero correspondiente: "+DayOfWeek.SATURDAY.getValue());
        System.out.println("Dia domingo: "+DayOfWeek.SUNDAY.name());
        System.out.println("DNumero correspondiente: "+DayOfWeek.SUNDAY.getValue());
        
        //INSTANT (java.time) Instancia de fecha u hora
        
        System.out.println("\nINSTANT--------------------------------------");
        Instant in1 = Instant.now();
        System.out.println("Instant now: "+in1);
        long num1 = System.currentTimeMillis();
        System.out.println("Tiempo del instante"+Instant.ofEpochMilli(num1));
        
        //DURATION (java.time) Duracion entre dos instancias
        
        System.out.println("\nDURATION--------------------------------------");
        Instant in2 = Instant.now();
        Duration duration = Duration.between(in1, in2);
        System.out.println("Duración a milisegundos: "+duration.toMillis());
        System.out.println("Duración a nanosegundos: "+duration.getNano());
        
        //ZONELD (java.time) Zona horaria
        
        System.out.println("\nZONELD--------------------------------------"); 
        ZoneId zi= ZoneId.systemDefault();
        System.out.println("Zona horario del equipo: "+zi);
        System.out.println("Zonas horarias: "+ZoneId.getAvailableZoneIds());
        System.out.println("Zona horaria correspondientes: "+ZoneId.of("Europe/Madrid"));
        
        //ZONEDDATETIME (java.time)
        
        System.out.println("\nZONEDDATETIME--------------------------------------"); 
        Instant in3 = Instant.now();
        System.out.println(""+ZonedDateTime.now());
        System.out.println(""+ZonedDateTime.now(zi));
        System.out.println(""+ZonedDateTime.now(zi));
        System.out.println(""+ZonedDateTime.ofInstant(in3, zi));
        
        //ARRAYLIST/HASHET/HASHMAP
        
        System.out.println("\nARRAYLIST");
        ArrayList al = new ArrayList();
        al.add("hola");
        al.add("que");
        al.add("tal");
        System.out.println("Tamaño: "+al.size());
        System.out.println("Extracción en posicion 3: "+al.get(2));
        System.out.println("ArrayList to string: "+al.toString());
        System.out.println("Eliminar valor en posicion 3: "+al.remove(1));
        
        Collections.sort(al);
        System.out.println("Collections to string"+al.toString());
        
        System.out.println("\nHASHET");
        HashSet hs = new HashSet();
        hs.add("hola");
        hs.add("que");
        hs.add("tal");
        System.out.println("Tamaño: "+hs.size());
        System.out.println("Extracción en posicion 3: "+al.get(1));
        System.out.println("HashSet to string: "+hs.toString());
        
        System.out.println("\nHASHMAP");
        HashMap hm = new HashMap();
        hm.put("Spain", "Madrid");
        hm.put("Italia", "Roma");
        hm.put("Alemania", "Berlin");
        System.out.println("Tamaño: "+hm.size());
        System.out.println("Hashmap to string: "+hm.toString());
        
        System.out.println("\nTREEMAP");
        TreeMap tm = new TreeMap();
        tm.put(123, "valor1");
        tm.put(231, "valor2");
        tm.put(321, "valor3");
        System.out.println("Tamaño: "+tm.size());
        System.out.println("TreeMap to string: "+tm.toString());
        
        //COLOR (java.awt)
        
        System.out.println("\nCOLOR--------------------------------------");
        Color color1 = new Color(1,2,3);
        Color color2 = new Color(1,2,3,4);
        System.out.println("Color 1: "+color1);
        System.out.println("Color 2: "+color2);
        System.out.println("Red: "+color2.getRed());
        System.out.println("Green: "+color2.getGreen());
        System.out.println("Blue: "+color2.getBlue());
        System.out.println("Alpha: "+color2.getAlpha());
        System.out.println("Color 2 mas claro: "+color2.brighter());
        System.out.println("Color 2 mas oscuro: "+color2.darker());
        final Color c1 = Color.BLACK;
        System.out.println("Constante de color: "+c1);
        
        //IMAGE/GRAPHICS (java.awt)
        
        System.out.println("\nIMAGE/GRAPHICS--------------------------------------");
        
        JFrame frame = new JFrame();
        frame.setSize(1920, 1080);
        /*
        frame.setVisible(true);        
        Image imagen = Image("C:/Users/kevin/Desktop/FP/SISTEMAS INFORMATICOS/1.png");
        try{
            imagen.getScaledInstance(1920, 1080, 0);
            MediaTracker.COMPLETE;
        }catch(Exception e12){
            System.out.println("Error: "+e12.getMessage());
        }
        
        Graphics g = frame.getGraphics();
        int ancho = frame.getWidth();
        int alto = frame.getHeight();
        System.out.println("Grapohics: "+g);
        System.out.println("Ancho: "+ancho);
        System.out.println("Alto: "+alto);
        */
        
        //FONT (java.awt)
        

        System.out.println("\nFONT--------------------------------------");
        
        Font fuente = new Font("Times New Roman",Font.PLAIN,28);
        
        //GRAPHICS (java.awt)
        
        System.out.println("\nGRAPHICS--------------------------------------");
        /*
        Graphics g = frame.getGraphics();
        g.setColor(Color.BLACK);
        g.setFont(fuente);
        g.drawLine(c, c, c, c);
        g.drawRect(c, c, valor, valor);
        g.fillRect(c, c, valor, valor);
        g.draw3DRect(c, c, valor, valor, b2);
        g.drawRoundRect(c, c, valor, valor, archivos, archivos);
        g.drawOval(c, c, valor, valor);
        g.fillOval(c, c, valor, valor);
        g.drawString(sb, c, c);
        g.drawImage(img, c, c, frame);
        g.drawImage(img, c, c, color2, frame);
        g.drawPolygon(p);
        g.dispose();
        */
        
        //POINT Y DIMENSION (java.awt)
        
        System.out.println("\nPOINT Y DIMENSION--------------------------------------");
        Point punto = new Point(50,50);
        double x1 = punto.getX();
        double y1 = punto.getY();
        System.out.println("Punto x: "+x1);
        System.out.println("Punto y: "+y1);
        
        Dimension dimension = new Dimension(50,50);
        double x2 = dimension.getWidth();
        double y2 = dimension.getHeight();
        System.out.println("Anchura: "+x2);
        System.out.println("Altura: "+y2);
        
        //RECTANGLE (java.awt)
        
        System.out.println("\nRECTANGLE--------------------------------------");
        Rectangle rectangulo1 = new Rectangle(50,50,50,50);
        Rectangle rectangulo2 = new Rectangle(punto,dimension);
        
        System.out.println("Punto x: "+rectangulo1.getX());
        System.out.println("Punto y: "+rectangulo1.getY());
        System.out.println("Anchura: "+rectangulo1.getWidth());
        System.out.println("Altura: "+rectangulo1.getHeight());
        /*
        rectangulo1.add(punto);
        rectangulo1.grow(50, 50);
        rectangulo1.contains(punto);
        rectangulo2.contains(rectangulo2);
        rectangulo1.setBounds(rectangulo2);
        rectangulo1.setLocation(50, 50);
        rectangulo1.setSize(1920, 1080);
        */        

        //TOOLKIT (java.awt)
        
        System.out.println("\nTOOLKIT--------------------------------------");
        Toolkit tk = Toolkit.getDefaultToolkit();
        //tk.createCustomCursor(Imagen, punto, frase);
        tk.beep();
        System.out.println("Resolucion: "+tk.getScreenResolution());
        System.out.println("Tamaño de pantalla: "+tk.getScreenSize());
        
        //IMAGEIO/BUFFEREDIMAGE (javax.imageio)
        
        System.out.println("\nIMAGEIO/BUFFEREDIMAGE--------------------------------------");   
        
        //BUFFEREDIMAGE (java.awt)
        
        System.out.println("\nBUFFEREDIMAGE--------------------------------------");
        BufferedImage imagen1 = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
        /*
        imagen1.getGraphics();
        int ancho2 = imagen1.getWidth();
        int alto2 = imagen1.getHeight();
        int rgb = imagen1.getRGB(c, c);
        int rgb2 = imagen1.setRGB(c, c, rgb);
        imagen1.getSubimage(c, c, c, c);
        */
    }
}
