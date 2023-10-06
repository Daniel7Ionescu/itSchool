package session11_abstractization.practice.data_transfer_information;

import java.util.List;

public abstract class Report {

    private String title;
    private List<String> data;

    public abstract void showPreview();

    public void displayMetaData(){
        System.out.println("Title: " + title);
    }


}
