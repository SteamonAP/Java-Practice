import java.io.File;

public class createpdf {
    public static void main(String[] args) throws Exception {
        String filePath = "D:\\my_pdf_file.pdf";

        File file = new File(filePath);

        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
