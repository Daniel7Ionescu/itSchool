package session11_abstractization.practice.data_transfer_information;

public class CSVReport extends Report implements CSVExportable{

    @Override
    public void exportToCSV() {
        //from interface
    }

    @Override
    public void showPreview() {
        //from abstract class
    }

    @Override
    public void displayMetaData() {
        super.displayMetaData();
        //from abstract class, not required to import, it is not abstract
    }
}
