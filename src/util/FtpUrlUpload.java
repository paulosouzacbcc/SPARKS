package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import org.apache.commons.net.ftp.FTPClient;
import sparks.FTPCreateDirDemo;

public class FtpUrlUpload {

    private static final int BUFFER_SIZE = 4096;

    static String host = "localhost";
    static String user = "paulo";
    static String pass = "1234";

    public static String upload(String filePath, String fileName) {

        String ftpUrl = "ftp://%s:%s@%s/%s;type=i";

        System.out.println(filePath);
        String dir = filePath.substring(filePath.lastIndexOf("/"), filePath.length() - 1);
        System.out.println(dir);
        //String filePath = "C:/Users/gtiago/Downloads/estagio/teste.xlsx";
        String uploadPathInFtp = "/Teste/".concat(fileName);

        ftpUrl = String.format(ftpUrl, user, pass, host, uploadPathInFtp);
        System.out.println("Upload URL: " + ftpUrl);

        FTPCreateDirDemo.main(null, "joao");

        try {
            URL url = new URL(ftpUrl);
            URLConnection conn = url.openConnection();
            OutputStream outputStream = conn.getOutputStream();
            FileInputStream inputStream = new FileInputStream(filePath);

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            inputStream.close();
            outputStream.close();

            System.out.println("File uploaded");
            return ftpUrl;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void createDiretorio() {

    }

    private static void showServerReply(FTPClient ftpClient) {
        String[] replies = ftpClient.getReplyStrings();
        if (replies != null && replies.length > 0) {
            for (String aReply : replies) {
                System.out.println("SERVER: " + aReply);
            }
        }
    }
}
