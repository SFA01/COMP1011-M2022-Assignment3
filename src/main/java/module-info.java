module ca.georgiancollege.comp1011m2022assignment3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ca.georgiancollege.comp1011m2022assignment3 to javafx.fxml;
    exports ca.georgiancollege.comp1011m2022assignment3;
}