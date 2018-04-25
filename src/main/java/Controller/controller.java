package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import Model.model;
@ManagedBean(name ="siam")
@SessionScoped
public class controller extends model {

    public controller() {
    }
    public String toNextPage() {

        setID(36);
        setName("Siam");
        setMarks(100);
        return "myPractice";

    }
}
