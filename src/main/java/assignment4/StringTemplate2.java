package assignment4;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.StringRenderer;

import java.util.ArrayList;
import java.util.List;

public class StringTemplate2 {
    public static void main(String[] args) {
        STGroupFile stfile = new STGroupFile("templates/secondTemplate.stg",'$','$');
        stfile.registerRenderer(String.class, new StringRenderer());

        List<String> l=new ArrayList<>();
        l.add("saiteja");
        l.add("sai");
        l.add("teja");
        l.add("Teja");
        ST t1 = stfile.getInstanceOf("template3");
        t1.add("mylist",l);
        System.out.println(t1.render());
    }
}
