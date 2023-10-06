package session11_abstractization.practice.data_transfer_information;

public class PDFReport extends Report implements PDFExportable {
    @Override
    public void exportToPDF() {
        //from interface
    }

    @Override
    public void showPreview() {
        //from abstract class
    }

    @Override
    public void displayMetaData() {
        super.displayMetaData();
    }
}
