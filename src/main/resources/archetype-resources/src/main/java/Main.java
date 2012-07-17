#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${packageInPathFormat};

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] argv) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

}