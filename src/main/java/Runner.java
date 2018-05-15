import db.DBChild;
import models.Child;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Child liesl = new Child("Liesl", 16, "Soprano");
        Child friedrich = new Child("Friedrich", 14, "Tenor");
        Child louisa = new Child("Louisa", 13, "Contralto");
        Child kurt = new Child("Kurt", 11, "Tenor");
        Child brigitta = new Child("Brigitta", 10, "Soprano");
        Child marta = new Child("Marta", 7, "Mezzo-Soprano");
        Child gretl = new Child("Gretl", 5, "Soprano");

        DBChild.save(liesl);
        DBChild.save(friedrich);
        DBChild.save(louisa);
        DBChild.save(kurt);
        DBChild.save(brigitta);
        DBChild.save(marta);
        DBChild.save(gretl);

        friedrich.setAge(15);
        friedrich.setRange("Bass");
        DBChild.update(friedrich);

     List<Child> allChildren = DBChild.getAllChildren();

     Child foundChild = DBChild.find("Kurt");

     List<Child> orderByAge = DBChild.orderbyAge();

     List<Child> findsp = DBChild.getSp("Soprano");

     List<Child> underTens = DBChild.underTen(10);

     Child oldestChild = DBChild.findOldest(allChildren);


    }

}
