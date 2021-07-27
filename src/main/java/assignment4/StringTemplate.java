package assignment4;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.StringRenderer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringTemplate {
    public static void main(String[] args) {
        STGroupFile stfile= new STGroupFile("templates/mtfirstTemplate.stg",'$','$');
        stfile.registerRenderer(String.class, new StringRenderer());

        Map<String, Object> mymap = new HashMap<>();
        mymap.put("s",1);
        mymap.put("a",3);
        int i=143;
        System.out.println("question 1");

        ST template=stfile.getInstanceOf("template1");
        template.add("mydata", i);
        System.out.println(template.render());

        ST maptemplate=stfile.getInstanceOf("template2");
        maptemplate.add("mydata", mymap);
        System.out.println(maptemplate.render());

        ST mapiterate=stfile.getInstanceOf("template3");
        mapiterate.add("myinput",mymap);
        System.out.println(mapiterate.render());

        System.out.println("*************");
        System.out.println("question:2");
        List<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(22);
        l1.add(222);
        l1.add(2222);
        l1.add(22222);
        ST listele= stfile.getInstanceOf("template4");
        listele.add("mylist",l1);
        System.out.println(listele.render());


    }
}
