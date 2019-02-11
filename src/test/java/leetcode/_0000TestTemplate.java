package leetcode;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _0000TestTemplate {
  @DataProvider(name = "dp")
  public Object[][] dataProvider() {
    //todo
    return new Object[][]{
        {},
        {}
    };
  }

  @Test(dataProvider = "dp")
  public void test() {


  }

  public static void main(String[] args) {
    String s = "123             ";
//    String reg = "^[0-9].";
//    Pattern p = Pattern.compile(reg);
//    Matcher m = p.matcher(s);
////    while (m.find()) {
////      System.out.println(m.group(0));
////    }
//    String[] s1 = s.split("\\D");
//    String s2 = s.substring(1);
    String[] s1 = s.split("^\\s+");
    System.out.println(s.split("^\\s+")[0]);

  }
}
