package cdi;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.time.LocalDateTime;

@SessionScoped
public class SessionBean implements Serializable {
    public static Integer cont = 0;
    public SessionBean(){
        cont++;
        }
    public String getCont(){
        return cont.toString();
    }

    @PostConstruct
    private void init(){
        System.out.println("SessionBean fui criado :" + LocalDateTime.now());
    }

    @PreDestroy
    private void destroy(){
        System.out.println("SessionBean fui destruido :" + LocalDateTime.now());

    }
}

