package assignment8;

import com.modak.utils.StringTemplateUtils;

import java.util.ArrayList;
import java.util.List;

public class stringTemplateUtils {

    public static void main(String[] args) {


        List<String> l=new ArrayList<>();
        l.add("saiteja");
        l.add("sai");
        l.add("teja");
        l.add("Teja");

        String s1= StringTemplateUtils.renderTemplate("templates/mtfirstTemplate.stg","template4","mylist",l);
        System.out.println(s1);

    }

}
