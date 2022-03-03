import java.net.*;

// Compile: javac Main.java
// Usage: java portScanner <ip/hostname>

class portScanner{
  public static void main(String arg[]){
    Socket sock;
    for(int i =1;i<65536;i++){
      try{
        sock = new Socket(arg[0],i);
        System.out.println("\u001B[32m" + "[+] Port open: " + i + "\u001B[0m");
      } catch(Exception e){
          // e.printStackTrace();
      }
    }
  }
}
