package David.Yesayan.brainquest.modelClass;

public class HomeModel {
    String title, des;

    public HomeModel() {
    }

    public HomeModel(String title, String des) {
        this.title = title;
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDes() {
        return des;
    }

    public void setDes(String Des) {
        this.des = des;
    }
}
