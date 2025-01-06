import java.io.File;

public class check {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\my_pdf_file.pdf";

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
